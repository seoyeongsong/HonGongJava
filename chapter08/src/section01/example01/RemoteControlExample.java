package section01.example01;

public class RemoteControlExample {

	public static void main(String[] args) {
		// 인터페이스 타입 변수 선언하여 객체 대입
		RemoteControl rc;

		rc = new Television();
		rc = new Audio();
	}
}