package section02.example04;

public class DriverExample {

	public static void main(String[] args) {
		// Driver °´Ã¼ »ý¼º
		Driver driver = new Driver();

		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		driver.drive(bus);
		driver.drive(taxi);
	}

}
