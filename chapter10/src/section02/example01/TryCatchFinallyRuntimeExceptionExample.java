package section02.example01;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("e Ȯ�� : " + e);
			System.out.println("Exception class Ȯ�� : " + e.getClass());
			System.out.println("Exception message Ȯ�� : " + e.getMessage());
			return;
		}// finally �ڵ� ���� ���� ����
	}
}
