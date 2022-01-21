package section05.example05;

public class PersonExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Person p1 = new Person("123456-1234567","홍길동");
		
		System.out.println("Person.nation : " + p1.nation);
		System.out.println("Person.ssn: " + p1.ssn);
		System.out.println("Person.name : " + p1.name);
		
		p1.name = "홍길서";
		System.out.println("Person.name은 변경이 가능 : " + p1.name);
	}

}
