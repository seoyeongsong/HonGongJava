package section02.example01;

// �θ� class A
class A{}

// class A�� ����ϴ� �ڽ� class B, C
class B extends A {}
class C extends A {}

// class B�� ����ϴ� �ڽ� class D
class D extends B{}
// class C�� ����ϴ� �ڽ� class E
class E extends C{}

public class PromotionExample {

	public static void main(String[] args) {
		// ��ü �����ϱ�
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// �ڵ� Ÿ�� ��ȯ
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
	}
}
