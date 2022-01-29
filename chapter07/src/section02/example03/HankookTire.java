package section02.example03;

public class HankookTire extends Tire{
	// 필드
	
	// 생성자
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	// 메소드
	// 부모 class의 roll 메소드를 재정의하여 사용할 것이다.
	// Override annotation을 추가하여 재정의하여 사용한다.
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire 수명 :" + 
					(maxRotation - accumulatedRotation) + " 회 ");
			return true;
		}else {
			System.out.println("***" + location + "HankookTire 펑크 ***");
			return false;
		}
	}

}
