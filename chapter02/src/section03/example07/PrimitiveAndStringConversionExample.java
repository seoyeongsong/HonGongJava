package section03.example07;

public class PrimitiveAndStringConversionExample {
	public static void main(String[] args) {
		// String -> int 강제 변환
		int intValue = Integer.parseInt("10");
		System.out.println("intValue : " + intValue);
		
		// String -> double 강제 변환
		double doubleValue = Double.parseDouble("3.14");
		System.out.println("doubleValue : " + doubleValue);
		
		// String -> boolean 강제 변환
		boolean booleanValue = Boolean.parseBoolean("true");
		System.out.println("booleanValue : " + booleanValue);
	}
}
