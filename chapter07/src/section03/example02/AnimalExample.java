package section03.example02;

public class AnimalExample {

	public static void main(String[] args) {
		// 객체 생성
		Dog dog = new Dog();
		Cat cat = new Cat();
		// 메소드 호출
		dog.sound();
		cat.sound();
		System.out.println("=================");
		
		// 자동 타입 변환
		Animal animal = null;
		
		// 재정의 메소드 호출
		animal = new Dog();
		animal.sound();
		
		animal = new Cat();
		animal.sound();
		System.out.println("================");
		
		// 메소드 다형성
		animalSound(new Dog());
		animalSound(new Cat());
	}

	// 메소드
	private static void animalSound(Animal animal) {
		animal.sound();
	}
}
