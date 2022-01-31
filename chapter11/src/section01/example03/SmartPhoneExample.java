package section01.example03;

public class SmartPhoneExample {
	public static void main(String[] args) {
		// 객체 생성
		SmartPhone smartPhone = new SmartPhone("구글", "안드로이드");
		
		// 변수 선언
		String string = smartPhone.toString();
		System.out.println("재정의된 toString() 확인 : " + string);
		
		System.out.println("smartPhone 확인 : " + smartPhone);
	}
}
