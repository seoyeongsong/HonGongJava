package section01.example02;

public class VariableUseExample {

	public static void main(String[] args) {
		// 정수형 변수를 초기화
		int hour = 3;
		int minute = 5;
		
		// 문자열과 함께 출력
		System.out.println(hour + " 시간 " + minute + " 분 ");

		// 위 시간을 분 단위로 변환하여 새로운 변수에 담아 출력하기
		int totalMinute = (hour*60) + (minute);
		System.out.println("총 " + totalMinute + " 분 ");
	}

}
