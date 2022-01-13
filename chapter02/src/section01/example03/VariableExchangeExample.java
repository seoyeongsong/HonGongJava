package section01.example03;

public class VariableExchangeExample {
	public static void main(String[] args) {
		// 
		int x = 3;
		int y = 5;
		
		System.out.println("x : " + x + ", y : " + y);
		
		// 두 변수의 값을 교환하기 위해 중간에 temp변수를 선언한다.
		
		// temp에 x값을 복사
		int temp = x;
		// x에 y값을 복사
		x = y;
		// y에 temp의 값을 복사(원래 x값)
		y = temp;
		
		// 출력결과, x와 y값이 서로 바뀌었음을 확인할 수 있다.
		System.out.println("x : " + x + ", y : " + y);
	}

}
