package section03.example04;

public class Car {
	// �ʵ� �����ϱ�
	String company = "����";
	String model;
	String color;
	int maxSpeed;
	
	// ������
	Car() {
		
	}
	
	Car(String model){
		this(model, "����", 250);
	}
	
	Car(String model, String color){
		this(model, color, 250);
	}
	
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed;
	}

}
