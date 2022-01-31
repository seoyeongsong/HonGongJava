package section02.example02;

public class CatchOrderExample {
	public static void main(String[] args) {
		try {
			String data1 = args[0];
			String data2 = args[1];
			
			int value1 = Integer.parseInt(data1);
			int value2 = Integer.parseInt(data2);
			int result = value1 + value2;
			System.out.println("result : " + result);
		} catch (ArrayIndexOutOfBoundsException e) {	// 배열 사용에 따른 Exception 처리
			System.out.println("ArrayIndexOutOfBoundsException : " + e.getMessage());
		}catch (Exception e) {
			// 그 외 다른 Exception을 처리하기 위한 구간으로
			// 상위 예외 클래스를 아래에 위치한다.
			System.out.println("Exception : " + e.getLocalizedMessage());
		}
	}
}