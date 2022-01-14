package section04.example05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// Scanner 클래스 사용
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("입력된 문자열 확인하기 : " + inputData);
			
			if(inputData.equals("q")) {
				break;
			}
		}

	}

}
