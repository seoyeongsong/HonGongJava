package section06.example06;

public class CarExample {

	public static void main(String[] args) {
		// ��ü�� ����
		Car mycar = new Car();
		
		// ��ȿ���� ���� �ӵ��� ������ ��
		mycar.setSpeed(-10);
		System.out.println("���� �ӵ� Ȯ���ϱ� : " + mycar.getSpeed());

		// ��ȿ�� ������ �ӵ��� �����ϱ�
		mycar.setSpeed(40);
		System.out.println("���� �ӵ� Ȯ���ϱ� : " + mycar.getSpeed());
		
		System.out.println("���� ���� Ȯ���ϱ� : " + mycar.isStop());
		
		if(!mycar.isStop()) {
			mycar.setStop(true);
		}
		
		System.out.println("���� �ӵ� Ȯ���ϱ� : " + mycar.getSpeed());
	}
}
