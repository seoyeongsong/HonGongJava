package section01.example02;

public class Key {
	// 필드 선언
	public int number;
	
	// 생성자
	public Key(int number) {
		this.number = number;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			// 타입 변환
			Key compareKey = (Key) obj;
			
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	// hashCode() 메소드 재정의
	public int hashCode() {
		return number;
	}
}
