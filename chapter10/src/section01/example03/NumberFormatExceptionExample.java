package section01.example03;

public class NumberFormatExceptionExample {
	public static void main(String[] args) {
		String data1 = "13";
		String data2 = "a11";
		
		int value1 = Integer.parseInt(data1);
		System.out.println("정수형으로 변환하기 : " + value1);
		
		double value2 = Double.parseDouble(data2);
		System.out.println("더블로 변환하기 : " + value2);
	}
}
