package section04.example02;

public class ComputerExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Computer myCom = new Computer();
		
		int[] values1 = {1,2,3,4,5};
		int result1 = myCom.sum1(values1);
		System.out.println("�Ű� ������ �迭�� ���� ����ϱ� : " + result1);
		
		int result2 = myCom.sum1(new int[] {1,2,3,4,5});
		System.out.println("�迭�� ���� ����� ����ϱ� : "+result2);
		
		int result3 = myCom.sum2(1,2,3,4,5);
		System.out.println("... ����Ͽ� �Էº����� �迭�� �����Ͽ� ����ϱ� : " + result3);

	}

}
