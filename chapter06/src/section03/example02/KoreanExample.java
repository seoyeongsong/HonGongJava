package section03.example02;

public class KoreanExample {

	public static void main(String[] args) {
		
		// new �����ڷ� ��ü �����Ͽ� �ʱⰪ �Ҵ��ϰ� Ȯ���ϱ�
		Korean korean1 = new Korean("���ϳ�", "011225-1234567");
		System.out.println("������ �ʱⰪ Ȯ��(name) : " + korean1.name);
		System.out.println("������ �ʱⰪ Ȯ��(ssn) : " + korean1.ssn);
		
		Korean korean2 = new Korean("���ڹ�", "930525-0654321");
		System.out.println("������ �ʱⰪ Ȯ��(name) : " + korean2.name);
		System.out.println("������ �ʱⰪ Ȯ��(ssn) : " + korean2.ssn);

	}

}
