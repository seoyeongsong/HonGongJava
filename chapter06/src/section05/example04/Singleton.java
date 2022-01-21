package section05.example04;

public class Singleton {
	// ���� ���� ���� : ��ü �����Ͽ� �ʱ�ȭ
	private static Singleton singleton = new Singleton();
	
	// �޼ҵ� ����
	private Singleton() {
		
	}
	
	// �ܺο��� ��ü ���� ������ getInstance() �޼ҵ�
	static Singleton getInstance() {
		// ��ܿ� ������ ��ü�� ����
		return singleton;
	}
}
