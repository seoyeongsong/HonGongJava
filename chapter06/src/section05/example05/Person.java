package section05.example05;

public class Person {
	// final �ʵ� ����
	// nation�� ��� Korea�� ������ ���
	final String nation = "Korea";
	// ssn�� ��� ������ ȣ�� �� �ʱⰪ�� ������ �� �ִ�.
	final String ssn;
	String name;
	
	// ������ ����
	public Person(String ssn, String name) {
		this.ssn = ssn;
		this.name = name;
	}
}
