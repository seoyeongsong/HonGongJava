package section02.example03;

public class CarExample {

	public static void main(String[] args) {
		// ��ü ����
		Car myCar = new Car();
		
		// Car ��ü�� roll �޼ҵ� 5ȸ ������ ���� for loop
		for(int i=1; i <=5; i++) {
			// Car ��ü�� run �޼ҵ忡���� ��ũ�� Ÿ�̾��� ��ġ�� ���ڷ� return�Ѵ�.
			int problemLocation = myCar.run();
			
			// run �޼ҵ�κ��� ���� �����Ǵ� Ÿ�̾� ��ġ�� ���� ó���ϱ� ���� switch�� ���
			switch(problemLocation) {
			case 1:
				System.out.println("�� ���� HankookTire�� ��ü");
				myCar.frontLeftTire = new HankookTire("�տ���", 15);
				break;
			case 2:
				System.out.println("�� ������ KumhoTire�� ��ü");
				myCar.frontRightTire = new HankookTire("�տ�����", 13);
				break;
			case 3:
				System.out.println("�� ���� HankookTire�� ��ü");
				myCar.backLeftTire = new HankookTire("�ڿ���", 14);
				break;
			case 4:
				System.out.println("�� ������ KumhoTire�� ��ü");
				myCar.backRightTire = new HankookTire("�ڿ�����", 17);
				break;
			}
			System.out.println("-----------------------------");	// 1ȸ�� �� �����ϱ� ���� ���
		}

	}

}
