package section02.example01;

public class CarExample {
	public static void main(String[] args) {
		// ��ü ����
		Car myCar = new Car();
		
		// �޼ҵ� ȣ��
//		myCar.run();
		
		// Ÿ�̾� ��ü
		myCar.backLeftTire = new KumhoTire();
		myCar.frontLeftTire = new KumhoTire();
		
		myCar.run();
	}
}