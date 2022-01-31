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
		} catch (ArrayIndexOutOfBoundsException e) {	// �迭 ��뿡 ���� Exception ó��
			System.out.println("ArrayIndexOutOfBoundsException : " + e.getMessage());
		}catch (Exception e) {
			// �� �� �ٸ� Exception�� ó���ϱ� ���� ��������
			// ���� ���� Ŭ������ �Ʒ��� ��ġ�Ѵ�.
			System.out.println("Exception : " + e.getLocalizedMessage());
		}
	}
}