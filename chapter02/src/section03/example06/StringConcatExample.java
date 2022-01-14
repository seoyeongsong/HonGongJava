package section03.example06;

public class StringConcatExample {

	public static void main(String[] args) {
		// 숫자의 덧셈 연산
		int intValue = 10 + 4 + 1;
		System.out.println("intValue : " + intValue);
		
		// 문자열 결합 연산
		// case1 : 문자열 + 문자열 = 문자열
		String str1 = "가" + "나" + "다";
		System.out.println("str1 : " + str1);

		// case2 : 문자열 + 숫자 = 문자열
		String str2 = "자바";
		int intValue2 = 17;
		String result1 = str2 + intValue2;
		System.out.println("result1 : " + result1);
		
		// case3 : 문자열 + 문자열로 변환한 숫자 = 문자열
		String str3 = "자바버전은";
		String version = "17";
		String result2 = str3 + version;
		System.out.println("result2 : " + result2);		
		
	}

}
