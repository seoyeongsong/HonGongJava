package section01.example04;

public class SystemTimeExample {
	public static void main(String[] args) {
		// 
		long time1 = System.nanoTime();
		
		int sum = 0;
		
		for(int i=1; i<=1000000; i++) {
			sum += i;
			System.out.println("sum 중간 확인 : " + sum);
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("합 구하기 : " + sum);
		System.out.println("소요 시간 구하기(ns) : " + (time2 - time1));
	}
}