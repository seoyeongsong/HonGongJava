package section02.example05;

public class ChildExample {

	public static void main(String[] args) {
		// �ڵ�Ÿ�� ��ȯ�Ͽ� �ʵ�, �޼ҵ� ����ϱ� ����ϱ�
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// ����Ÿ�� ��ȯ�Ͽ� �θ� Ŭ������ ���� �ʵ�� �޼ҵ� ����ϱ�
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
	}
}
