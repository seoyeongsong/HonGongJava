package section02.example02;

public class ForSumFrom1to100Example {

	public static void main(String[] args) {
		int sum = 0;
		
		for(int i=1; i<=100; i++) {
			sum += i;
		}
		System.out.println("1부터 100까지의 합 : " + sum);
	}

}
