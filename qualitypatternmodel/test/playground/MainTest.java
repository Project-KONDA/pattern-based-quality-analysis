package playground;

public class MainTest {
	public static void main(String[] args) {
		String s = "Hello";
		String s1 = s + ";";
		String[] sA = s.split(";");
		String[] sA1 = s1.split(";");
		System.out.println(sA.length);
		System.out.println(sA1.length);
	}
}
