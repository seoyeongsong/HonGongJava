package section01.example01;

public class MyClassExample {
	public static void main(String[] args) {
//		System.out.println("===1. �������̽��� �ʵ�� ������ ���===");
//
//		MyClass myClass1 = new MyClass();
//		myClass1.rc.turnOn();
//		myClass1.rc.setVolume(6);
		
//		System.out.println("===2. �������̽��� �������� �Ű������� ������ ���===");
//		
//		MyClass myClass2 = new MyClass(new Audio());

//		System.out.println("===3. �������̽��� �޼ҵ��� ���� ������ ������ ���===");
//		
//		MyClass myClass3 = new MyClass();
//		myClass3.methodA();

		System.out.println("===4. �������̽��� �޼ҵ��� �Ű� ������ ������ ���===");
		
		MyClass myClass4 = new MyClass();
		myClass4.methodB(new Television());
	}
}
