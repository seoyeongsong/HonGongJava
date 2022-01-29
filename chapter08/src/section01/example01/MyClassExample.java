package section01.example01;

public class MyClassExample {
	public static void main(String[] args) {
//		System.out.println("===1. 인터페이스가 필드로 구현된 경우===");
//
//		MyClass myClass1 = new MyClass();
//		myClass1.rc.turnOn();
//		myClass1.rc.setVolume(6);
		
//		System.out.println("===2. 인터페이스가 생성자의 매개변수로 구현된 경우===");
//		
//		MyClass myClass2 = new MyClass(new Audio());

//		System.out.println("===3. 인터페이스가 메소드의 로컬 변수로 구현된 경우===");
//		
//		MyClass myClass3 = new MyClass();
//		myClass3.methodA();

		System.out.println("===4. 인터페이스가 메소드의 매개 변수로 구현된 경우===");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}
}
