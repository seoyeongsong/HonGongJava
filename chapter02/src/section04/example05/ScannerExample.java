package section04.example05;

import java.util.Scanner;

public class ScannerExample {

	public static void main(String[] args) {
		// Scanner Ŭ���� ���
		@SuppressWarnings("resource")
		Scanner scanner = new Scanner(System.in);
		String inputData;
		
		while(true) {
			inputData = scanner.nextLine();
			System.out.println("�Էµ� ���ڿ� Ȯ���ϱ� : " + inputData);
			
			if(inputData.equals("q")) {
				break;
			}
		}

	}

}
