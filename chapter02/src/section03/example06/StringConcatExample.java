package section03.example06;

public class StringConcatExample {

	public static void main(String[] args) {
		// ������ ���� ����
		int intValue = 10 + 4 + 1;
		System.out.println("intValue : " + intValue);
		
		// ���ڿ� ���� ����
		// case1 : ���ڿ� + ���ڿ� = ���ڿ�
		String str1 = "��" + "��" + "��";
		System.out.println("str1 : " + str1);

		// case2 : ���ڿ� + ���� = ���ڿ�
		String str2 = "�ڹ�";
		int intValue2 = 17;
		String result1 = str2 + intValue2;
		System.out.println("result1 : " + result1);
		
		// case3 : ���ڿ� + ���ڿ��� ��ȯ�� ���� = ���ڿ�
		String str3 = "�ڹٹ�����";
		String version = "17";
		String result2 = str3 + version;
		System.out.println("result2 : " + result2);		
		
	}

}
