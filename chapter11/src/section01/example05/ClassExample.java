package section01.example05;

public class ClassExample {
	public static void main(String[] args) throws Exception{
		// 첫 번째 방법
		Class clazz = Car.class;
		System.out.println("clazz 이름 : " + clazz.getName());
		
		// 두 번째 방법
		Class clazz2 = Class.forName("section01.example05.Car");
		System.out.println("clazz2 이름 : " + clazz2);
		
		// 세 번째 방법
		Car car = new Car();
		Class clazz3 = car.getClass();
		System.out.println("clazz3 이름 : " + clazz3);
	}
}