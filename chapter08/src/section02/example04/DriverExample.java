package section02.example04;

public class DriverExample {
	public static void main(String[] args) {
		// 객체 생성
		Driver driver = new Driver();
		Bus bus = new Bus();
		Taxi taxi = new Taxi();
		
		// 메소드 호출
		driver.drive(bus);
		driver.drive(taxi);
	}
}
