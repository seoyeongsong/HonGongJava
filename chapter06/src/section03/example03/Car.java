package section03.example03;

public class Car {
	// �ʵ� �����ϱ�
	String company = "�����ڵ���";
	String model;
	String color;
	int maxSpeed;
	
	// ������ �����ϱ�
	// ������ 1 : �Ű� ������ ���� ���
	Car() {
		
	}

	// ������ 2 : �Ű� ������ model �ϳ��� ���
	Car(String model){
		// �ʵ��� �Ű� �������� ��ġ�ϹǷ�, this.�� �ٿ� �ʵ����� ����Ͽ� �Ҵ�
		this.model = model;
	}
	
	// ������ 3 : �Ű� ������ model, color �ΰ��� ���
	Car(String model, String color){
		this.model = model;
		this.color = color;
	}
	
	// ������ 4 : �Ű� ������ model, color, maxSpeed ������ ���
	Car(String model, String color, int maxSpeed){
		this.model = model;
		this.color = color;
		this.maxSpeed = maxSpeed; 
	}
}
