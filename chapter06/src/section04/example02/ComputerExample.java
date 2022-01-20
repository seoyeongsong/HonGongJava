package section04.example02;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3,4,5};
		int result1 = myCom.sum1(values1);
		System.out.println("매개 변수로 배열을 만들어서 계산하기 : " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("배열을 직접 만들어 계산하기 : "+result2);
		
		int result3 = myCom.sum2(1,2,3,4,5);
		System.out.println("... 사용하여 입력변수로 배열을 생성하여 계산하기 : " + result3);

	}

}
