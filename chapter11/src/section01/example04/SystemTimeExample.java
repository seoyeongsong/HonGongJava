package section01.example04;

public class SystemTimeExample {
	public static void main(String[] args) {
		// 
		long time1 = System.nanoTime();
		
		int sum = 0;
		
		for(int i=1; i<=1000000; i++) {
			sum += i;
			System.out.println("sum �߰� Ȯ�� : " + sum);
		}
		
		long time2 = System.nanoTime();
		
		System.out.println("�� ���ϱ� : " + sum);
		System.out.println("�ҿ� �ð� ���ϱ�(ns) : " + (time2 - time1));
	}
}