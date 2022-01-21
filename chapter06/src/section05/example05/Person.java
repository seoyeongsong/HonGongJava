package section05.example05;

public class Person {
	// final 필드 선언
	// nation의 경우 Korea로 고정된 상수
	final String nation = "Korea";
	// ssn의 경우 생성자 호출 시 초기값을 설정할 수 있다.
	final String ssn;
	String name;
	
	// 생성자 선언
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
