package section03.example02;

public class AnimalExample {

	public static void main(String[] args) {
		// ��ü ����
		Dog dog = new Dog();
		Cat cat = new Cat();
		// �޼ҵ� ȣ��
		dog.sound();
		cat.sound();
		System.out.println("=================");
		
		// �ڵ� Ÿ�� ��ȯ
		Animal animal = null;
		
		// ������ �޼ҵ� ȣ��
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println("================");
		
		// �޼ҵ� ������
		animalSound(new Dog());
		animalSound(new Cat());
	}

	// �޼ҵ�
	private static void animalSound(Animal animal) {
		animal.sound();
	}
}
