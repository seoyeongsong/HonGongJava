package section02.example06;

public class InstanceofExample {
	// 메소드
	public static void method1(Parent parent) {
		if(parent instanceof Child) {	// instanceof 연산자로 확인 후
			Child child = (Child) parent;	// 강제 타입 변환
			System.out.println("method1 - Child로 변환 성공");
		}else {
			System.out.println("method1 - Child로 변환되지 않음");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;	// 강제 타입 변환
		System.out.println("method2 - Child로 변환 성공");
	}
	
	public static void main(String[] args) {
		// 부모 타입으로 자동 타입 변환
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		// 부모 타입으로 객체 생성
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}
}
