package section01.example04;

// �θ� Ŭ����
public class Parent {
	// �ʵ� ����
	public String nation;
	

	public Parent() {
		this("���ѹα�");
		System.out.println("@@ Parent() call @@");
	}

	public Parent(String nation) {
		this.nation = nation;
		System.out.println("@@ Parent(String nation) Call @@");
	}
}
