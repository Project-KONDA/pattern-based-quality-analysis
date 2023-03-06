package qualitypatternmodel.adaptionneo4jtests;

import static org.junit.Assert.assertFalse;
import static org.junit.jupiter.api.Assertions.assertTrue;

import java.lang.reflect.Method;

import qualitypatternmodel.adaptionneo4j.NeoPathPart;
import qualitypatternmodel.adaptionneo4j.impl.NeoPathPartImpl;
import qualitypatternmodel.exceptions.InvalidityException;

public abstract class NeoPathPartTest implements INeoPathPartTest {
	protected NeoPathPart neoPathPart;
	
	public void setUp(NeoPathPart neoPathPart) {
		this.neoPathPart = neoPathPart;
	}
	
	public void tearDown() {
		neoPathPart = null;
	}

	protected void getNeoAbstractPathParamException(Method m2) {
		try {
			Method m = m2;
			try {
				m.invoke(neoPathPart);
			} catch (Exception e) {
				if (e.getCause().getClass() == InvalidityException.class) {
					assertTrue(true);
				} else {
					assertTrue(false);
				}
			}
			try {
				neoPathPart.setNeoPathParam(FACTORY.createNeoElementPathParam());
				neoPathPart.setNeoPathParam(FACTORY.createNeoElementPathParam());
				m.invoke(neoPathPart);
			} catch (Exception e) {
				if (e.getCause().getClass() == InvalidityException.class) {
					assertTrue(true);
				} else {
					assertTrue(false);
				}
			}
		} catch (Exception e) {
			System.out.println(e);
			assertFalse(true);
		}
	}

	protected Method getTheGetNeoAbstractPathParamMethod() throws NoSuchMethodException {
		Class obj = NeoPathPartImpl.class;
		Method m = obj.getDeclaredMethod("getNeoAbstractPathParam");
		m.setAccessible(true);
		return m;
	}
}
