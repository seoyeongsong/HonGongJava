package section03.example03;

public class Car {
	// 필드 선언하기
	String company = "현대자동차";
	String model;
	String color;
	int maxSpeed;
	
	// 생성자 선언하기
	// 생성자 1 : 매개 변수가 없는 경우
	Car() {
		
	}

	// 생성자 2 : 매개 변수가 model 하나인 경우
	Car(String model){
		// 필드명과 매개 변수명이 일치하므로, this.를 붙여 필드임을 명시하여 할당
		this.model = model;
	}
	
	// 생성자 3 : 매개 변수가 model, color 두개인 경우
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	// 생성자 4 : 매개 변수가 model, color, maxSpeed 세개인 경우
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed; 
	}
}
