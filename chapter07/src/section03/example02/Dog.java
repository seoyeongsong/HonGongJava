package section03.example02;

public class Dog extends Animal {
	// ������
	public Dog() {
		this.kind = "������";
	}
	// �߻� �޼ҵ� ������
	@Override
	public void sound() {
		System.out.println("Bow-Wow");		
	}
}
