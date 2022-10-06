package playground;

import org.basex.query.value.item.Str;

public class TestGround {
	public static final String name = "%sHello";
	public static void main(String[] args) {
		internalCount count = new internalCount();
		System.out.println(count.getCount());
		System.out.println(count.getCount());
		
	}
		
	static class internalCount {
		int counter = 0;
		protected void increacseCounter() {
			counter++;
		}
		
		protected int getCount() {
			return ++counter;
		}
	}
}
