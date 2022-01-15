package section02.example10;

public class ContinueExample {

	public static void main(String[] args) {
		for(int i=1; i <= 10; i++) {
			if(i%2 != 0) {
				continue;
			}
			System.out.println("@@ 실행한 짝수 회차 : " + i);
		}

	}

}
