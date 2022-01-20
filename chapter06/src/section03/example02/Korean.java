package section03.example02;

public class Korean {
	// 필드선언 시 초기값 할당하기
	
	// nation의 경우 Korean 초기값 설정
	String nation = "Korean";
	// name과 ssn은 따로 설정하지 않았으므로 String은 null이 설정
	String name;
	String ssn;
	
	// 생성자 선언 시 초기값 할당하기
	public Korean(String name, String ssn) {
		// 필드 초기값을 매개 변수를 통해 설정
		this.name = name;
		this.ssn = ssn;
		
	}

}
