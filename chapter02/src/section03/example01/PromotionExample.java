package section03.example01;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// 자동 타입 변환 (byte -> int)
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("byteValue : " + byteValue);
		System.out.println("intValue : " + intValue);
		
		// 자동 타입 변환 (char -> int)
		char charValue = '가';
		intValue = charValue;	// 위에서 사용한 int 형 변수 사용
		System.out.println("charValue : " + charValue);
		System.out.println("intValue : " + intValue);	// 출력 결과 유니코드로 변환되어 저장
		
		// 자동 타입 변환 (int -> long)
		intValue = 50;	// 변수 초기화
		long longValue = intValue;
		System.out.println("intValue : " + intValue);
		System.out.println("longValue : " + longValue);
		
		// 자동 타입 변환 (long -> float)
		longValue = 100;	// 변수 초기화
		float floatValue = longValue;
		System.out.println("longValue : " + longValue);		// 정수
		System.out.println("floatValue : " + floatValue);	// 실수형으로 소숫점 발생
		
		// 자동 타입 변환 (float -> double)
		floatValue = 100.5F;	// 실수 리터럴은 double로 인식하므로 float로 지정할 때는 F를 붙인다.
		double doubleValue = floatValue;
		System.out.println("floatValue : " + floatValue);
		System.out.println("doubleValue : " + doubleValue);
		

	}

}
