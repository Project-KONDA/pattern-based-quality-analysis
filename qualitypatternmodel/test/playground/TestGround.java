package playground;

import org.eclipse.emf.common.util.BasicEList;
import org.eclipse.emf.common.util.EList;

public class TestGround {
	public static final String name = "%sHello";
	public static void main(String[] args) {
		EList<Object> l = new BasicEList<Object>();
		EList<Object> l2 = new BasicEList<Object>();
		EList<Object> l3 = new BasicEList<Object>();
		l.addAll(l2);
		l.addAll(l3);
		System.out.println(l.size());
	}
}
