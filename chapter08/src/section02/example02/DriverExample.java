package section02.example02;

public class DriverExample {
	public static void main(String[] args) {
		// ��ü ����
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
