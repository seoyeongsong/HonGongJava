package section01.example10;

public class IntegerCompareExample {
	public static void main(String[] args) {
		// Integer 객체 자동 boxing
		Integer obj1 = 100;
		Integer obj2 = 300;
		Integer obj3 = 100;
		Integer obj4 = 300;
		
		System.out.println("100 비교하기 : " + (obj1 == obj3));
		System.out.println("300 비교하기 : " + (obj2 == obj4));
		
		System.out.println("equals 메소드로 100 비교하기 : " + (obj1.equals(obj3)));
		System.out.println("equals 메소드로 300 비교하기 : " + (obj2.equals(obj4)));
		
		System.out.println("=====================");
		
		System.out.println("언박싱 100 비교하기 : " + (obj1.intValue() == obj3.intValue()));
		System.out.println("언박싱 300 비교하기 : " + (obj2.intValue() == obj4.intValue()));
	}
}
