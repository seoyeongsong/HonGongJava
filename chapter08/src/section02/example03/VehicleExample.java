package section02.example03;

public class VehicleExample {
	public static void main(String[] args) {
		// ��ü ����
		Vehicle vehicle =  new Bus();
		
		// �޼ҵ� ȣ��
//		vehicle.run();
		
		// ���� Ÿ�� ��ȯ
		Bus bus = (Bus) vehicle;
		
		bus.checkFare();
		bus.run();
	}

}
