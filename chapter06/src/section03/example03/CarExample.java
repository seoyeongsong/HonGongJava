package section03.example03;

public class CarExample {

	public static void main(String[] args) {
		// ������ 1 ȣ���Ͽ� ��ü �����ϱ�
		Car car1 = new Car();
		// ������ 1�� �Ű� ������ ������ ������, �ʱ�ȭ�� �ʵ常 �����Ѵ�.
		System.out.println("car1.company : " + car1.company);
		System.out.println();

		// ������ 2 ȣ���Ͽ� ��ü �����ϱ�
		Car car2 = new Car("�Ÿ");
		System.out.println("car2.company : " + car2.company);
		System.out.println("car2.model : " + car2.model);
		System.out.println();
		
		// ������ 3 ȣ���Ͽ� ��ü �����ϱ�
		Car car3 = new Car("�׷���", "����");
		System.out.println("car3.company : " + car3.company);
		System.out.println("car3.model : " + car3.model);
		System.out.println("car3.color : " + car3.color);
		System.out.println();
		
		// ������ 4 ȣ���Ͽ� ��ü �����ϱ�
		Car car4 = new Car("�ƹݶ�", "���", 200);
		System.out.println("car4.company : " + car4.company);
		System.out.println("car4.model : " + car4.model);
		System.out.println("car4.color : " + car4.color);
		System.out.println("car4.maxSpeed : " + car4.maxSpeed);
		System.out.println();
		
	}

}
