package section03.example02;

public class Cat extends Animal{
	// ������
	public Cat() {
		this.kind = "������";
	}
	// �߻� �޼ҵ� ������
	@Override
	public void sound() {
		System.out.println("Meow");
	}
}
