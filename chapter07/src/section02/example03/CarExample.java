package section02.example03;

public class CarExample {

	public static void main(String[] args) {
		// 객체 생성
		Car myCar = new Car();
		
		// Car 객체의 roll 메소드 5회 실행을 위한 for loop
		for(int i=1; i <=5; i++) {
			// Car 객체의 run 메소드에서는 펑크난 타이어의 위치를 숫자로 return한다.
			int problemLocation = myCar.run();
			
			// run 메소드로부터 받은 문제되는 타이어 위치에 따라서 처리하기 위해 switch문 사용
			switch(problemLocation) {
			case 1:
				System.out.println("앞 왼쪽 HankookTire로 교체");
				myCar.frontLeftTire = new HankookTire("앞왼쪽", 15);
				break;
			case 2:
				System.out.println("앞 오른쪽 KumhoTire로 교체");
				myCar.frontRightTire = new HankookTire("앞오른쪽", 13);
				break;
			case 3:
				System.out.println("뒤 왼쪽 HankookTire로 교체");
				myCar.backLeftTire = new HankookTire("뒤왼쪽", 14);
				break;
			case 4:
				System.out.println("뒤 오른쪽 KumhoTire로 교체");
				myCar.backRightTire = new HankookTire("뒤오른쪽", 17);
				break;
			}
			System.out.println("-----------------------------");	// 1회전 시 구분하기 위해 출력
		}

	}

}
