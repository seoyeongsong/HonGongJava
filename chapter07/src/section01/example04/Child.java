package section01.example04;

// �θ� Ŭ������ Parent�� ���
public class Child extends Parent {
	private String name;
	
	public Child() {
		this("ȫ�浿");
		System.out.println("## Child() Call ##");
	}
	
	public Child(String name) {
		this.name = name;
		System.out.println("## Child(String name) Call ##");
	}
}
