package section02.example05;

public class ForMultipleicationTableExample {

	public static void main(String[] args) {
		// ������ ���α׷�
		for(int m=2; m <=9; m++) {
			System.out.println("������ " + m + "�� ����!");
			for(int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + m*n);
			}
		}
	}
}
