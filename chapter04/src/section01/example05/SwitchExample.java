package section01.example05;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noon = (int) Math.ceil(Math.random() * 6);
		
		switch(noon) {
		
		case 1:
			System.out.println("1번이 나왔다!");
			break;
		case 2:
			System.out.println("2번이 나왔다!");
			break;
		case 3:
			System.out.println("3번이 나왔다!");
			break;
		case 4:
			System.out.println("4번이 나왔다!");
			break;
		case 5:
			System.out.println("5번이 나왔다!");
			break;
		case 6:
			System.out.println("6번이 나왔다!");
			break;
		default:
			System.out.println("프로그램이 잘못됐다!");
			break;
		}

	}

}
