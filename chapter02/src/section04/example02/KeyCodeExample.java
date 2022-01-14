package section04.example02;

public class KeyCodeExample {

	public static void main(String[] args) throws Exception {
		
		int keyCode;
		
		keyCode = System.in.read();
		System.out.println("입력된 key code 확인 : " + keyCode);

	}

}