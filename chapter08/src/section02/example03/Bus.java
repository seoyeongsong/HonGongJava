package section02.example03;

public class Bus implements Vehicle{
	@Override
	public void run() {
		System.out.println("Bus�� �޸��ϴ�.");
	}
	
	public void checkFare() {
		System.out.println("���� ����� üũ�մϴ�.");
	}
}