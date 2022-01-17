package section01.example01;

public class Student {

	public static void main(String[] args) {
		
		// Student class에서 student1의 객체를 new 연산자로 생성
		// student1 변수에는 참조하는 Student 객체의 번지가 리턴되어 저장된다.
		Student student1 = new Student();
		
		System.out.println("student1 변수가 Student 객체를 참조한다. " + student1);
		
		// Student class에서 새로운 객체 student2를 new 연산자로 생성
		// student2 변수에는 참조하는 Student 객체의 번지가 리턴되어 저장된다.
		Student student2 = new Student();
		
		System.out.println("student2 변수가 또 다른 Student 객체를 참조한다. " + student2);

	}

}
