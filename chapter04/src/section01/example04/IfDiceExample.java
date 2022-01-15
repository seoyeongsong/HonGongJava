package section01.example04;

public class IfDiceExample {
	public static void main(String[] args) {
		// 주사위 눈 (1~6) 랜덤으로 뽑기
		// Math 패키지 내 random 메소드를 사용하면 0부터 1사이 소수를 생성한다.
		//System.out.println(Math.random());
		
		// 정수를 만들어주기 위해 6을 곱한뒤 올림한다.
		//System.out.println(Math.ceil((Math.random())*6));
		
		// 주사위 눈 변수는 1부터 6사이에서만 생성되어야 한다.
		// 난수 생성 결과는 double 이므로 int 강제 타입 변환한다.
		int noon = (int) Math.ceil((Math.random())*6);
		System.out.println(noon);
		
		if(noon ==1) {
			System.out.println("1번이 나왔다!");
		}else if(noon==2) {
			System.out.println("2번이 나왔다!");
		}else if(noon == 3) {
			System.out.println("3번이 나왔다!");
		}else if(noon == 4){
			System.out.println("4번이 나왔다!");
		}else if(noon ==5) {
			System.out.println("5번이 나왔다!");
		}else if(noon ==6) {
			System.out.println("6번이 나왔다!");
		}else {
			System.out.println("프로그램이 잘못됐다!");
		}
	}
}
