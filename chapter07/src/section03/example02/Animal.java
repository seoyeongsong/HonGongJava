package section03.example02;

public abstract class Animal {
	// �ʵ�
	public String kind;
	
	// �޼ҵ�
	public void breathe() {
		System.out.println("���� ���ϴ�.");
	}
	
	// �߻� �޼ҵ�
	public abstract void sound();
}
