/**
 */
package qualitypatternmodel.execution.impl;

import java.io.IOException;
import java.lang.reflect.InvocationTargetException;
import org.eclipse.emf.ecore.EClass;
import org.eclipse.emf.ecore.impl.ENotificationImpl;
import java.io.*;
import java.net.InetSocketAddress;
import java.net.Socket;
import java.nio.charset.Charset;
import java.security.MessageDigest;
import java.security.NoSuchAlgorithmException;
import java.util.ArrayList;
import org.eclipse.emf.common.notify.Notification;
import org.eclipse.emf.common.util.EList;
import org.eclipse.emf.ecore.impl.MinimalEObjectImpl;

import qualitypatternmodel.execution.BaseXClient;
import qualitypatternmodel.execution.ExecutionPackage;

/**
 * <!-- begin-user-doc --> An implementation of the model object '<em><b>Base
 * XClient</b></em>'. <!-- end-user-doc -->
 * <p>
 * The following features are implemented:
 * </p>
 * <ul>
 *   <li>{@link qualitypatternmodel.execution.impl.BaseXClientImpl#getHost <em>Host</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.BaseXClientImpl#getPort <em>Port</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.BaseXClientImpl#getUsername <em>Username</em>}</li>
 *   <li>{@link qualitypatternmodel.execution.impl.BaseXClientImpl#getPassword <em>Password</em>}</li>
 * </ul>
 *
 * @generated
 */
public class BaseXClientImpl extends MinimalEObjectImpl.Container implements BaseXClient {

	/**
	 * The default value of the '{@link #getHost() <em>Host</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getHost()
	 * @generated
	 * @ordered
	 */
	protected static final String HOST_EDEFAULT = null;
	/** UTF-8 charset. */
	private static Charset UTF8 = Charset.forName("UTF-8");
	/** Output stream. */
	protected OutputStream out;
	/** Input stream (buffered). */
	protected BufferedInputStream in;

	/** Socket. */
	protected Socket socket;
	/** Command info. */
	protected String info;

	protected String host;
	/**
	 * The default value of the '{@link #getPort() <em>Port</em>}' attribute. <!--
	 * begin-user-doc --> <!-- end-user-doc -->
	 * 
	 * @see #getPort()
	 * @generated
	 * @ordered
	 */
	protected static final int PORT_EDEFAULT = 0;
	protected int port;

	/**
	 * The default value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected static final String USERNAME_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getUsername() <em>Username</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getUsername()
	 * @generated
	 * @ordered
	 */
	protected String username = USERNAME_EDEFAULT;
	/**
	 * The default value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected static final String PASSWORD_EDEFAULT = null;
	/**
	 * The cached value of the '{@link #getPassword() <em>Password</em>}' attribute.
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @see #getPassword()
	 * @generated
	 * @ordered
	 */
	protected String password = PASSWORD_EDEFAULT;

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	protected BaseXClientImpl() {
		super();
	}

	/**
	 * <!-- begin-user-doc --> Constructor.
	 * 
	 * @param host     server name
	 * @param port     server port
	 * @param username user name
	 * @param password password
	 * @throws IOException Exception <!-- end-user-doc -->
	 * @generated NOT
	 */
	public BaseXClientImpl(final String host, final int port, final String username, final String password)
			throws IOException {
		super();

		this.host = host;
		this.port = port;
		this.username = username;
		this.password = password;

		connect();
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	protected EClass eStaticClass() {
		return ExecutionPackage.Literals.BASE_XCLIENT;
	}

	/**
	 * Executes a command and serializes the result to an output stream.
	 * 
	 * @param command command
	 * @param output  output stream
	 * @throws IOException Exception
	 */
	public void execute(final String command, final OutputStream output) throws IOException {
		// send {Command}0
		send(command);
		receive(in, output);
		info = receive();
		if (!ok())
			throw new IOException(info);
	}

	/**
	 * Executes a command and returns the result.
	 * 
	 * @param command command
	 * @return result
	 * @throws IOException Exception
	 */
	@Override
	public String execute(final String command) throws IOException {
		if(!isConnected()) {
			connect();
		}
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		execute(command, os);
		return new String(os.toByteArray(), UTF8);
	}

	/**
	 * Creates a query object.
	 * 
	 * @param query query string
	 * @return query
	 * @throws IOException Exception
	 */
	public Query query(final String query) throws IOException {
		if(!isConnected()) {
			connect();
		}
		return new Query(query);
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated NOT
	 */
	@Override
	public boolean isConnected() {
		return out != null;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @throws IOException 
	 * @generated NOT
	 */
	@Override
	public void connect() throws IOException {
		socket = new Socket();
		socket.setTcpNoDelay(true);
		socket.connect(new InetSocketAddress(host, port), 5000);
		in = new BufferedInputStream(socket.getInputStream());
		out = socket.getOutputStream();		

		// receive server response
		final String[] response = receive().split(":");
		final String code, nonce;
		if (response.length > 1) {
			// support for digest authentication
			code = username + ':' + response[0] + ':' + password;
			nonce = response[1];
		} else {
			// support for cram-md5 (Version < 8.0)
			code = password;
			nonce = response[0];
		}

		send(username);
		send(md5(md5(code) + nonce));

		// receive success flag
		if (!ok())
			throw new IOException("Access denied.");
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eGet(int featureID, boolean resolve, boolean coreType) {
		switch (featureID) {
			case ExecutionPackage.BASE_XCLIENT__HOST:
				return getHost();
			case ExecutionPackage.BASE_XCLIENT__PORT:
				return getPort();
			case ExecutionPackage.BASE_XCLIENT__USERNAME:
				return getUsername();
			case ExecutionPackage.BASE_XCLIENT__PASSWORD:
				return getPassword();
		}
		return super.eGet(featureID, resolve, coreType);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eSet(int featureID, Object newValue) {
		switch (featureID) {
			case ExecutionPackage.BASE_XCLIENT__HOST:
				setHost((String)newValue);
				return;
			case ExecutionPackage.BASE_XCLIENT__PORT:
				setPort((Integer)newValue);
				return;
			case ExecutionPackage.BASE_XCLIENT__USERNAME:
				setUsername((String)newValue);
				return;
			case ExecutionPackage.BASE_XCLIENT__PASSWORD:
				setPassword((String)newValue);
				return;
		}
		super.eSet(featureID, newValue);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void eUnset(int featureID) {
		switch (featureID) {
			case ExecutionPackage.BASE_XCLIENT__HOST:
				setHost(HOST_EDEFAULT);
				return;
			case ExecutionPackage.BASE_XCLIENT__PORT:
				setPort(PORT_EDEFAULT);
				return;
			case ExecutionPackage.BASE_XCLIENT__USERNAME:
				setUsername(USERNAME_EDEFAULT);
				return;
			case ExecutionPackage.BASE_XCLIENT__PASSWORD:
				setPassword(PASSWORD_EDEFAULT);
				return;
		}
		super.eUnset(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public boolean eIsSet(int featureID) {
		switch (featureID) {
			case ExecutionPackage.BASE_XCLIENT__HOST:
				return HOST_EDEFAULT == null ? host != null : !HOST_EDEFAULT.equals(host);
			case ExecutionPackage.BASE_XCLIENT__PORT:
				return port != PORT_EDEFAULT;
			case ExecutionPackage.BASE_XCLIENT__USERNAME:
				return USERNAME_EDEFAULT == null ? username != null : !USERNAME_EDEFAULT.equals(username);
			case ExecutionPackage.BASE_XCLIENT__PASSWORD:
				return PASSWORD_EDEFAULT == null ? password != null : !PASSWORD_EDEFAULT.equals(password);
		}
		return super.eIsSet(featureID);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public Object eInvoke(int operationID, EList<?> arguments) throws InvocationTargetException {
		switch (operationID) {
			case ExecutionPackage.BASE_XCLIENT___CONNECT:
				try {
					connect();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.BASE_XCLIENT___IS_CONNECTED:
				return isConnected();
			case ExecutionPackage.BASE_XCLIENT___CLOSE:
				try {
					close();
					return null;
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.BASE_XCLIENT___EXECUTE__STRING:
				try {
					return execute((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
			case ExecutionPackage.BASE_XCLIENT___QUERY__STRING:
				try {
					return query((String)arguments.get(0));
				}
				catch (Throwable throwable) {
					throw new InvocationTargetException(throwable);
				}
		}
		return super.eInvoke(operationID, arguments);
	}

	/**
	 * <!-- begin-user-doc --> <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String toString() {
		if (eIsProxy()) return super.toString();

		StringBuilder result = new StringBuilder(super.toString());
		result.append(" (host: ");
		result.append(host);
		result.append(", port: ");
		result.append(port);
		result.append(", username: ");
		result.append(username);
		result.append(", password: ");
		result.append(password);
		result.append(')');
		return result.toString();
	}

	/**
	 * Creates a database.
	 * 
	 * @param name  name of database
	 * @param input xml input
	 * @throws IOException I/O exception
	 */
	public void create(final String name, final InputStream input) throws IOException {
		send(8, name, input);
	}

	/**
	 * Adds a document to a database.
	 * 
	 * @param path  path to resource
	 * @param input xml input
	 * @throws IOException I/O exception
	 */
	public void add(final String path, final InputStream input) throws IOException {
		send(9, path, input);
	}

	/**
	 * Replaces a document in a database.
	 * 
	 * @param path  path to resource
	 * @param input xml input
	 * @throws IOException I/O exception
	 */
	public void replace(final String path, final InputStream input) throws IOException {
		send(12, path, input);
	}

	/**
	 * Stores a binary resource in a database.
	 * 
	 * @param path  path to resource
	 * @param input xml input
	 * @throws IOException I/O exception
	 */
	public void store(final String path, final InputStream input) throws IOException {
		send(13, path, input);
	}

	/**
	 * Returns command information.
	 * 
	 * @return string info
	 */
	public String info() {
		return info;
	}

	/**
	 * Closes the session.
	 * 
	 * @throws IOException Exception
	 */
	@Override
	public void close() throws IOException {
		send("exit");
		out.flush();
		socket.close();
	}

	/**
	 * Checks the next success flag.
	 * 
	 * @return value of check
	 * @throws IOException Exception
	 */
	private boolean ok() throws IOException {
		out.flush();
		return in.read() == 0;
	}

	/**
	 * Returns the next received string.
	 * 
	 * @return String result or info
	 * @throws IOException I/O exception
	 */
	private String receive() throws IOException {
		final ByteArrayOutputStream os = new ByteArrayOutputStream();
		receive(in, os);
		return new String(os.toByteArray(), UTF8);
	}

	/**
	 * Sends a string to the server.
	 * 
	 * @param string string to be sent
	 * @throws IOException I/O exception
	 */
	private void send(final String string) throws IOException {

//		System.out.println("out= " + out);
//
//		System.out.println("s= " + (string + '\0'));
		out
		.write((string + '\0')
				.getBytes(UTF8));
	}

	/**
	 * Receives a string and writes it to the specified output stream.
	 * 
	 * @param input  input stream
	 * @param output output stream
	 * @throws IOException I/O exception
	 */
	private static void receive(final InputStream input, final OutputStream output) throws IOException {
		for (int b; (b = input.read()) > 0;) {
			// read next byte if 0xFF is received
			output.write(b == 0xFF ? input.read() : b);
		}
	}

	/**
	 * Sends a command, argument, and input.
	 * 
	 * @param code  command code
	 * @param path  name, or path to resource
	 * @param input xml input
	 * @throws IOException I/O exception
	 */
	private void send(final int code, final String path, final InputStream input) throws IOException {
		out.write(code);
		send(path);
		send(input);
	}

	/**
	 * Sends an input stream to the server.
	 * 
	 * @param input xml input
	 * @throws IOException I/O exception
	 */
	private void send(final InputStream input) throws IOException {
		final BufferedInputStream bis = new BufferedInputStream(input);
		final BufferedOutputStream bos = new BufferedOutputStream(out);
		for (int b; (b = bis.read()) != -1;) {
			// 0x00 and 0xFF will be prefixed by 0xFF
			if (b == 0x00 || b == 0xFF)
				bos.write(0xFF);
			bos.write(b);
		}
		bos.write(0);
		bos.flush();
		info = receive();
		if (!ok())
			throw new IOException(info);
	}

	/**
	 * Returns an MD5 hash.
	 * 
	 * @param pw String
	 * @return String
	 */
	private static String md5(final String pw) {
		final StringBuilder sb = new StringBuilder();
		try {
			final MessageDigest md = MessageDigest.getInstance("MD5");
			md.update(pw.getBytes());
			for (final byte b : md.digest()) {
				final String s = Integer.toHexString(b & 0xFF);
				if (s.length() == 1)
					sb.append('0');
				sb.append(s);
			}
		} catch (final NoSuchAlgorithmException ex) {
			// should not occur
			ex.printStackTrace();
		}
		return sb.toString();
	}

	/**
	 * Inner class for iterative query execution.
	 */
	public class Query implements Closeable {
		/** Query id. */
		private final String id;
		/** Cached results. */
		private ArrayList<byte[]> cache;
		/** Cache pointer. */
		private int pos;

		/**
		 * Standard constructor.
		 * 
		 * @param query query string
		 * @throws IOException I/O exception
		 */
		Query(final String query) throws IOException {
			id = exec(0, query);
		}

		/**
		 * Binds a value to an external variable.
		 * 
		 * @param name  name of variable
		 * @param value value
		 * @throws IOException I/O exception
		 */
		public void bind(final String name, final String value) throws IOException {
			bind(name, value, "");
		}

		/**
		 * Binds a value with the specified type to an external variable.
		 * 
		 * @param name  name of variable
		 * @param value value
		 * @param type  type (can be an empty string)
		 * @throws IOException I/O exception
		 */
		public void bind(final String name, final String value, final String type) throws IOException {
			cache = null;
			exec(3, id + '\0' + name + '\0' + value + '\0' + type);
		}

		/**
		 * Binds a value to the context item.
		 * 
		 * @param value value
		 * @throws IOException I/O exception
		 */
		public void context(final String value) throws IOException {
			context(value, "");
		}

		/**
		 * Binds a value with the specified type to the context item.
		 * 
		 * @param value value
		 * @param type  type (can be an empty string)
		 * @throws IOException I/O exception
		 */
		public void context(final String value, final String type) throws IOException {
			cache = null;
			exec(14, id + '\0' + value + '\0' + type);
		}

		/**
		 * Checks for the next item.
		 * 
		 * @return result of check
		 * @throws IOException I/O exception
		 */
		public boolean more() throws IOException {
			if (cache == null) {
				out.write(4);
				send(id);
				cache = new ArrayList<>();
				final ByteArrayOutputStream os = new ByteArrayOutputStream();
				while (in.read() > 0) {
					receive(in, os);
					cache.add(os.toByteArray());
					os.reset();
				}
				if (!ok())
					throw new IOException(receive());
				pos = 0;
			}
			if (pos < cache.size())
				return true;
			cache = null;
			return false;
		}

		/**
		 * Returns the next item.
		 * 
		 * @return item string
		 * @throws IOException I/O Exception
		 */
		public String next() throws IOException {
			return more() ? new String(cache.set(pos++, null), UTF8) : null;
		}

		/**
		 * Returns the whole result of the query.
		 * 
		 * @return query result
		 * @throws IOException I/O Exception
		 */
		public String execute() throws IOException {
			return exec(5, id);
		}

		/**
		 * Returns query info in a string.
		 * 
		 * @return query info
		 * @throws IOException I/O exception
		 */
		public String info() throws IOException {
			return exec(6, id);
		}

		/**
		 * Returns serialization parameters in a string.
		 * 
		 * @return query info
		 * @throws IOException I/O exception
		 */
		public String options() throws IOException {
			return exec(7, id);
		}

		/**
		 * Closes the query.
		 * 
		 * @throws IOException I/O exception
		 */
		@Override
		public void close() throws IOException {
			exec(2, id);
		}

		/**
		 * Executes the specified command.
		 * 
		 * @param code command code
		 * @param arg  argument
		 * @return resulting string
		 * @throws IOException I/O exception
		 */
		private String exec(final int code, final String arg) throws IOException {
			out.write(code);
			send(arg);
			final String s = receive();
			if (!ok())
				throw new IOException(receive());
			return s;
		}
	}

	public String getHost() {
		return host;
	}

	public void setHost(String host) {
		this.host = host;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getUsername() {
		return username;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setUsername(String newUsername) {
		String oldUsername = username;
		username = newUsername;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.BASE_XCLIENT__USERNAME, oldUsername, username));
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public String getPassword() {
		return password;
	}

	/**
	 * <!-- begin-user-doc -->
	 * <!-- end-user-doc -->
	 * @generated
	 */
	@Override
	public void setPassword(String newPassword) {
		String oldPassword = password;
		password = newPassword;
		if (eNotificationRequired())
			eNotify(new ENotificationImpl(this, Notification.SET, ExecutionPackage.BASE_XCLIENT__PASSWORD, oldPassword, password));
	}

} // BaseXClientImpl
