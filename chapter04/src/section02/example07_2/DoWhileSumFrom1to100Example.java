package section02.example07_2;

public class DoWhileSumFrom1to100Example {

	public static void main(String[] args) {
		int sum = 0;
		int i = 1;
		
		do {
			sum += i;
			i++;
		} while(i<=100);
		
		System.out.println("1부터 100까지의 합 : " + sum);
	}

}
