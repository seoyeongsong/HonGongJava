package section01.example10;

public class IntegerCompareExample {
	public static void main(String[] args) {
		// Integer ��ü �ڵ� boxing
		Integer obj1 = 100;
		Integer obj2 = 300;
		Integer obj3 = 100;
		Integer obj4 = 300;
		
		System.out.println("100 ���ϱ� : " + (obj1 == obj3));
		System.out.println("300 ���ϱ� : " + (obj2 == obj4));
		
		System.out.println("equals �޼ҵ�� 100 ���ϱ� : " + (obj1.equals(obj3)));
		System.out.println("equals �޼ҵ�� 300 ���ϱ� : " + (obj2.equals(obj4)));
		
		System.out.println("=====================");
		
		System.out.println("��ڽ� 100 ���ϱ� : " + (obj1.intValue() == obj3.intValue()));
		System.out.println("��ڽ� 300 ���ϱ� : " + (obj2.intValue() == obj4.intValue()));
	}
}
