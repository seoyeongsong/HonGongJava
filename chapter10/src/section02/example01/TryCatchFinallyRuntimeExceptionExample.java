package section02.example01;

public class TryCatchFinallyRuntimeExceptionExample {
	public static void main(String[] args) {
		String data1 = null;
		String data2 = null;
		
		try {
			data1 = args[0];
			data2 = args[1];
			
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("e 확인 : " + e);
			System.out.println("Exception class 확인 : " + e.getClass());
			System.out.println("Exception message 확인 : " + e.getMessage());
			return;
		}// finally 코드 블럭은 생략 가능
	}
}
