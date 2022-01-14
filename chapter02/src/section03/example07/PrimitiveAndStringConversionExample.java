package section03.example07;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		// String -> int ���� ��ȯ
		int intValue = Integer.parseInt("10");
		System.out.println("intValue : " + intValue);
		
		// String -> double ���� ��ȯ
		double doubleValue = Double.parseDouble("3.14");
		System.out.println("doubleValue : " + doubleValue);
		
		// String -> boolean ���� ��ȯ
		boolean booleanValue = Boolean.parseBoolean("true");
		System.out.println("booleanValue : " + booleanValue);
	}
}
