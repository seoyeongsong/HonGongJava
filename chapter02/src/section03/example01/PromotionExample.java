package section03.example01;

public class PromotionExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// �ڵ� Ÿ�� ��ȯ (byte -> int)
		byte byteValue = 10;
		int intValue = byteValue;
		System.out.println("byteValue : " + byteValue);
		System.out.println("intValue : " + intValue);
		
		// �ڵ� Ÿ�� ��ȯ (char -> int)
		char charValue = '��';
		intValue = charValue;	// ������ ����� int �� ���� ���
		System.out.println("charValue : " + charValue);
		System.out.println("intValue : " + intValue);	// ��� ��� �����ڵ�� ��ȯ�Ǿ� ����
		
		// �ڵ� Ÿ�� ��ȯ (int -> long)
		intValue = 50;	// ���� �ʱ�ȭ
		long longValue = intValue;
		System.out.println("intValue : " + intValue);
		System.out.println("longValue : " + longValue);
		
		// �ڵ� Ÿ�� ��ȯ (long -> float)
		longValue = 100;	// ���� �ʱ�ȭ
		float floatValue = longValue;
		System.out.println("longValue : " + longValue);		// ����
		System.out.println("floatValue : " + floatValue);	// �Ǽ������� �Ҽ��� �߻�
		
		// �ڵ� Ÿ�� ��ȯ (float -> double)
		floatValue = 100.5F;	// �Ǽ� ���ͷ��� double�� �ν��ϹǷ� float�� ������ ���� F�� ���δ�.
		double doubleValue = floatValue;
		System.out.println("floatValue : " + floatValue);
		System.out.println("doubleValue : " + doubleValue);
		

	}

}
