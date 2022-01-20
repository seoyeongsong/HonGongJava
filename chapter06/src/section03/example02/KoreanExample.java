package section03.example02;

public class KoreanExample {

	public static void main(String[] args) {
		
		// new 연산자로 객체 생성하여 초기값 할당하고 확인하기
		Korean korean1 = new Korean("김하나", "011225-1234567");
		System.out.println("생성자 초기값 확인(name) : " + korean1.name);
		System.out.println("생성자 초기값 확인(ssn) : " + korean1.ssn);
		
		Korean korean2 = new Korean("김자바", "930525-0654321");
		System.out.println("생성자 초기값 확인(name) : " + korean2.name);
		System.out.println("생성자 초기값 확인(ssn) : " + korean2.ssn);

	}

}
