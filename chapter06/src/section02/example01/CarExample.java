package section02.example01;

public class CarExample {

	public static void main(String[] args) {
		// class Car�� �ʵ带 ����ϱ� ���� ��ü�� ����
		Car myCar = new Car();
		
		// �ʵ� �б�
		System.out.println("���ۻ� : " + myCar.company);
		System.out.println("�𵨸� : " + myCar.model);
		System.out.println("����  : " + myCar.color);
		System.out.println("�ְ�ӵ� : " + myCar.maxSpeed);
		System.out.println("����ӵ� : " + myCar.speed);
		
		// �ʵ� �����ϱ�
		myCar.speed = 60;
		System.out.println("����� ����ӵ� : " + myCar.speed);

	}

}
