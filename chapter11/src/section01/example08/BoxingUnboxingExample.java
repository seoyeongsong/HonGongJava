package section01.example08;

public class BoxingUnboxingExample {
	public static void main(String[] args) {
		// boxing
		Integer obj1 = new Integer(100);
		Integer obj2 = new Integer(101);
		Integer obj3 = new Integer(102);
		
		// unboxing
		int value1 = obj1.intValue();
		int value2 = obj2.intValue();
		int value3 = obj3.intValue();
		
		System.out.println("value1 Ȯ�� : " + value1);
		System.out.println("value2 Ȯ�� : " + value2);
		System.out.println("value3 Ȯ�� : " + value3);
	}
}