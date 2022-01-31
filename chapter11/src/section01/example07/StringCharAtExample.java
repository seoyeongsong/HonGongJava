package section01.example07;

public class StringCharAtExample {
	public static void main(String[] args) {
		String ssn = "900101-1234567";
		char sex = ssn.charAt(7);
		
		switch(sex) {
		case '1':
			System.out.println("남자입니다.");
			break;
		case '2':
			System.out.println("여자입니다.");
			break;
		case '3':
			System.out.println("남자입니다");
			break;
		case '4':
			System.out.println("여자입니다.");
			break;
		}
	}
}
