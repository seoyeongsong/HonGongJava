package section02.example04;

public class DriverExample {
	public static void main(String[] args) {
		// ��ü ����
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// �޼ҵ� ȣ��
		driver.drive(bus);
		driver.drive(taxi);
	}
}
