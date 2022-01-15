package section02.example05;

public class ForMultipleicationTableExample {

	public static void main(String[] args) {
		// 구구단 프로그램
		for(int m=2; m <=9; m++) {
			System.out.println("구구단 " + m + "단 시작!");
			for(int n=1; n<=9; n++) {
				System.out.println(m + " x " + n + " = " + m*n);
			}
		}
	}
}
