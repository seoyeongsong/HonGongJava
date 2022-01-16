package section02.example10;

public class AdvancedForExample {

	public static void main(String[] args) {
		// 길이가 5인 정수 타입의 배열 생성
		int[] scores = { 95, 80, 65, 95, 70};
		
		// 향상된 for문
		int sum = 0;
		/*
		for(타입 [변수명] : 배열) : 배열의 길이만큼 반복하면서 배열 속 값을 앞에 선언한 변수에 저장하므로
		for 문 안에서 변수를 사용해 배열 값을 사용한다.
		*/
		
		for(int score : scores) {
			sum = sum + score;
		}
		
		System.out.println("총 합  : " + sum);
	}

}
