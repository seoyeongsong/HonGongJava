package section02.example03;

public class HankookTire extends Tire{
	// �ʵ�
	
	// ������
	public HankookTire(String location, int maxRotation) {
		super(location, maxRotation);
		// TODO Auto-generated constructor stub
	}

	// �޼ҵ�
	// �θ� class�� roll �޼ҵ带 �������Ͽ� ����� ���̴�.
	// Override annotation�� �߰��Ͽ� �������Ͽ� ����Ѵ�.
	@Override
	public boolean roll() {
		++accumulatedRotation;
		if(accumulatedRotation < maxRotation) {
			System.out.println(location + " HankookTire ���� :" + 
					(maxRotation - accumulatedRotation) + " ȸ ");
			return true;
		}else {
			System.out.println("***" + location + "HankookTire ��ũ ***");
			return false;
		}
	}

}
