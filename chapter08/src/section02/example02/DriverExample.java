package section02.example02;

public class DriverExample {
	public static void main(String[] args) {
		// °´Ã¼ ¼±¾ð
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}
}
