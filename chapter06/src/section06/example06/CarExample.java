package section06.example06;

public class CarExample {

	public static void main(String[] args) {
		// 객체를 생성
		Car mycar = new Car();
		
		// 유효하지 않은 속도로 변경할 때
		mycar.setSpeed(-10);
		System.out.println("현재 속도 확인하기 : " + mycar.getSpeed());

		// 유효한 값으로 속도를 변경하기
		mycar.setSpeed(40);
		System.out.println("현재 속도 확인하기 : " + mycar.getSpeed());
		
		System.out.println("현재 상태 확인하기 : " + mycar.isStop());
		
		if(!mycar.isStop()) {
			mycar.setStop(true);
		}
		
		System.out.println("현재 속도 확인하기 : " + mycar.getSpeed());
	}
}
