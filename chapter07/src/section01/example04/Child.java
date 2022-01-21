package section01.example04;

// 부모 클래스인 Parent를 상속
public class Child extends Parent {
	private String name;
	
	public Child() {
		this("홍길동");
		System.out.println("## Child() Call ##");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("## Child(String name) Call ##");
	}
}
