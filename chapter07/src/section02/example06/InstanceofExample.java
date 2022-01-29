package section02.example06;

public class InstanceofExample {
	// �޼ҵ�
	public static void method1(Parent parent) {
		if(parent instanceof Child) {	// instanceof �����ڷ� Ȯ�� ��
			Child child = (Child) parent;	// ���� Ÿ�� ��ȯ
			System.out.println("method1 - Child�� ��ȯ ����");
		}else {
			System.out.println("method1 - Child�� ��ȯ���� ����");
		}
	}
	
	public static void method2(Parent parent) {
		Child child = (Child) parent;	// ���� Ÿ�� ��ȯ
		System.out.println("method2 - Child�� ��ȯ ����");
	}
	
	public static void main(String[] args) {
		// �θ� Ÿ������ �ڵ� Ÿ�� ��ȯ
		Parent parentA = new Child();
		method1(parentA);
		method2(parentA);
		
		// �θ� Ÿ������ ��ü ����
		Parent parentB = new Parent();
		method1(parentB);
		method2(parentB);
	}
}
