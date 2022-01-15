package section01.example02;

public class IfElseExample {

	public static void main(String[] args) {

		int score = 85;
		
		// 점수가 90 이상(true)일 때, if문 블럭 실행
		if(score >= 90) {
			System.out.println("점수가 90점 이상입니다.");
			System.out.println("등급은 A입니다.");
		}else {	// 점수가 90점 미만(false)일 때, else문 블럭 실행
			System.out.println("점수가 90점 미만입니다.");
			System.out.println("등급은 B입니다.");
		}

	}

}
