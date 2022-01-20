package section03.example03;

public class CarExample {

	public static void main(String[] args) {
		// 생성자 1 호출하여 객체 생성하기
		Car car1 = new Car();
		// 생성자 1은 매개 변수가 없었기 때문에, 초기화한 필드만 존재한다.
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		// 생성자 2 호출하여 객체 생성하기
		Car car2 = new Car("쏘나타");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		// 생성자 3 호출하여 객체 생성하기
		Car car3 = new Car("그랜저", "검정");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		// 생성자 4 호출하여 객체 생성하기
		Car car4 = new Car("아반떼", "흰색", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
	}

}
