package section01.example04;

public class IfDiceExample {
	public static void main(String[] args) {
		// �ֻ��� �� (1~6) �������� �̱�
		// Math ��Ű�� �� random �޼ҵ带 ����ϸ� 0���� 1���� �Ҽ��� �����Ѵ�.
		//System.out.println(Math.random());
		
		// ������ ������ֱ� ���� 6�� ���ѵ� �ø��Ѵ�.
		//System.out.println(Math.ceil((Math.random())*6));
		
		// �ֻ��� �� ������ 1���� 6���̿����� �����Ǿ�� �Ѵ�.
		// ���� ���� ����� double �̹Ƿ� int ���� Ÿ�� ��ȯ�Ѵ�.
		int noon = (int) Math.ceil((Math.random())*6);
		System.out.println(noon);
		
		if(noon ==1) {
			System.out.println("1���� ���Դ�!");
		}else if(noon==2) {
			System.out.println("2���� ���Դ�!");
		}else if(noon == 3) {
			System.out.println("3���� ���Դ�!");
		}else if(noon == 4){
			System.out.println("4���� ���Դ�!");
		}else if(noon ==5) {
			System.out.println("5���� ���Դ�!");
		}else if(noon ==6) {
			System.out.println("6���� ���Դ�!");
		}else {
			System.out.println("���α׷��� �߸��ƴ�!");
		}
	}
}
