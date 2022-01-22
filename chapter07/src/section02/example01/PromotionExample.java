package section02.example01;

// 부모 class A
class A{}

// class A를 상속하는 자식 class B, C
class B extends A {}
class C extends A {}

// class B를 상속하는 자식 class D
class D extends B{}
// class C를 상속하는 자식 class E
class E extends C{}

public class PromotionExample {

	public static void main(String[] args) {
		// 객체 생성하기
		B b = new B();
		C c = new C();
		D d = new D();
		E e = new E();
		
		// 자동 타입 변환
		A a1 = b;
		A a2 = c;
		A a3 = d;
		A a4 = e;
		
		B b1 = d;
		C c1 = e;
	}
}
