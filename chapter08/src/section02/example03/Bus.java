package section02.example03;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("Bus가 달립니다.");
	}
	
	public void checkFare() {
		System.out.println("승차 요금을 체크합니다.");
	}
}