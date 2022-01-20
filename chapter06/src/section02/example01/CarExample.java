package section02.example01;

public class CarExample {

	public static void main(String[] args) {
		// class Car의 필드를 사용하기 위해 객체를 생성
		Car myCar = new Car();
		
		// 필드 읽기
		System.out.println("제작사 : " + myCar.company);
		System.out.println("모델명 : " + myCar.model);
		System.out.println("색상  : " + myCar.color);
		System.out.println("최고속도 : " + myCar.maxSpeed);
		System.out.println("현재속도 : " + myCar.speed);
		
		// 필드 변경하기
		myCar.speed = 60;
		System.out.println("변경된 현재속도 : " + myCar.speed);

	}

}
