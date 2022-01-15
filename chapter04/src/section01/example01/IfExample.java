package section01.example01;

public class IfExample {

	public static void main(String[] args) {
		int score = 93;
		
		// 점수가 90점 이상(true)일 경우 if문 블럭 실행
		if(score >=90) {
			System.out.println("점수가 90점 보다 높습니다.");
			System.out.println("등급은 A입니다");
		}

		// 점수가 90점 미만(true)일 경우 if문 블럭 실행
		if(score < 90) {
			System.out.println("점수가 90점 보다 낮습니다.");
			System.out.println("등급은 B입니다.");
		}
	}

}
