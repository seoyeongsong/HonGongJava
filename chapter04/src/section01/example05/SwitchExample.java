package section01.example05;

public class SwitchExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int noon = (int) Math.ceil(Math.random() * 6);
		
		switch(noon) {
		
		case 1:
			System.out.println("1���� ���Դ�!");
			break;
		case 2:
			System.out.println("2���� ���Դ�!");
			break;
		case 3:
			System.out.println("3���� ���Դ�!");
			break;
		case 4:
			System.out.println("4���� ���Դ�!");
			break;
		case 5:
			System.out.println("5���� ���Դ�!");
			break;
		case 6:
			System.out.println("6���� ���Դ�!");
			break;
		default:
			System.out.println("���α׷��� �߸��ƴ�!");
			break;
		}

	}

}
