package section02.example03;

public class VehicleExample {
	public static void main(String[] args) {
		// 객체 선언
		Vehicle vehicle =  new Bus();
		
		// 메소드 호출
//		vehicle.run();
		
		// 강제 타입 변환
		Bus bus = (Bus) vehicle;
		
		bus.checkFare();
		bus.run();
	}

}
