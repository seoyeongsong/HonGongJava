package section01.example05;

public class ClassExample {
	public static void main(String[] args) throws Exception{
		// ù ��° ���
		Class clazz = Car.class;
		System.out.println("clazz �̸� : " + clazz.getName());
		
		// �� ��° ���
		Class clazz2 = Class.forName("section01.example05.Car");
		System.out.println("clazz2 �̸� : " + clazz2);
		
		// �� ��° ���
		Car car = new Car();
		Class clazz3 = car.getClass();
		System.out.println("clazz3 �̸� : " + clazz3);
	}
}