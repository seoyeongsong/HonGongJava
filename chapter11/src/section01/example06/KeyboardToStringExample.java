package section01.example06;

public class KeyboardToStringExample {
	public static void main(String[] args) {
		// byte �迭 ��ü ����
		byte[] bytes = {72, 101, 108, 111, 32, 74, 97, 118, 97};
		
		// ���ڿ��� ��ȯ
		String str1 = new String(bytes);
		System.out.println("���ڿ� ��ü Ȯ�� : " + str1);
		
		// ���ڿ� ��ȯ �� �����̽�
		String str2 = new String(bytes, 5, 4);
		System.out.println("���ڿ� ��ü Ȯ��2 : " + str2);
	}
}