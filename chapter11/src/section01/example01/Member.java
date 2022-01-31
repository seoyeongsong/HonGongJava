package section01.example01;

public class Member {
	// 필드 선언
	public String id;
	
	// 생성자 선언
	public Member(String id) {
		this.id = id;
	}
	
	// 메소드 재정의
	public boolean equals(Object object) {
		if(object instanceof Member) {
			// 강제 타입 변환
			Member member = (Member) object;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}