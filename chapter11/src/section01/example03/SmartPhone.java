package section01.example03;

public class SmartPhone {
	// 필드 선언
	private String company;
	private String os;
	
	// 생성자
	public SmartPhone(String company, String os) {
		this.company = company;
		this.os = os;
	}
	
	// 메소드 재정의
	public String toString() {
		return company + " , " + os;
	}
}