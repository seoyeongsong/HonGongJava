package section02.example04;

public class Driver {
	public void drive(Vehicle vehicle) {
		// Bus class에만 존재하는 checkFare 메소드를 사용하기 위해 
		// 강제 타입 변환 실시하기 전, 객체 타입 확인 작업을 거친다.
		// 매개변수인 vehicle이 참조하는 객체가 Bus인가 조사
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}