package section02.example01;

import java.text.SimpleDateFormat;
import java.util.Date;

public class DateExample {
	public static void main(String[] args) {
		// Date ��ü �����ϱ�
		Date date = new Date();
		// ���� ��¥�� �ð� ������ ���ڿ��� ����
		String strNow1 = date.toString();
		System.out.println("strNow1 : " + strNow1);
		
		// ���ϴ� �������� �����Ͽ� ��¥ ���� ���
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy�� MM�� dd�� hh�� mm�� ss��");
		String strNow2 = sdf.format(date);
		System.out.println("strNow2 : " + strNow2);
		
	}
}
