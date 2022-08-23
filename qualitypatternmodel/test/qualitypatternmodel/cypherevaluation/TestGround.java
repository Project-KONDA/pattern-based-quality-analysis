package qualitypatternmodel.cypherevaluation;

public class TestGround {
	public static final String name = "%sHello";
	public static void main(String[] args) {
		
		String n = String.format(name, "1");
		String a = String.format(name, "2");
		System.out.println(n);
		System.out.println(a);
	}
}
