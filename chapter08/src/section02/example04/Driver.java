package section02.example04;

public class Driver {
	public void drive(Vehicle vehicle) {
		// Bus class���� �����ϴ� checkFare �޼ҵ带 ����ϱ� ���� 
		// ���� Ÿ�� ��ȯ �ǽ��ϱ� ��, ��ü Ÿ�� Ȯ�� �۾��� ��ģ��.
		// �Ű������� vehicle�� �����ϴ� ��ü�� Bus�ΰ� ����
		if(vehicle instanceof Bus) {
			Bus bus = (Bus) vehicle;
			bus.checkFare();
		}
		vehicle.run();
	}
}