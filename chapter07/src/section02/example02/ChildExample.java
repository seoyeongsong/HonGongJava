package section02.example02;

public class ChildExample {

	public static void main(String[] args) {
		// 
		Child child = new Child();
		
		// �ڵ� Ÿ�� ��ȯ
		Parent parent = child;
		
		parent.method1();
		parent.method2();
		child.method3();
	}
}
