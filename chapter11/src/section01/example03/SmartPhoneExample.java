package section01.example03;

public class SmartPhoneExample {
	public static void main(String[] args) {
		// ��ü ����
		SmartPhone smartPhone = new SmartPhone("����", "�ȵ���̵�");
		
		// ���� ����
		String string = smartPhone.toString();
		System.out.println("�����ǵ� toString() Ȯ�� : " + string);
		
		System.out.println("smartPhone Ȯ�� : " + smartPhone);
	}
}
