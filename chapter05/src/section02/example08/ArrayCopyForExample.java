package section02.example08;

public class ArrayCopyForExample {

	public static void main(String[] args) {
		// ���̰� 3�̰� ������ �����ϴ� ���� Ÿ���� �迭�� ����
		int[] oldIntArr = {1, 2, 3};
		
		// ���̰� 5�� ���ο� �迭�� ����
		int[] newIntArr = new int[5];
		
		// for ���� ���� ���� �迭�� ���� �����Ͽ� ���ο� �迭�� ����
		for(int i =0; i<oldIntArr.length; i++) {
			newIntArr[i] = oldIntArr[i];
		}
		
		//���� ������ �迭�� ���� ����ϱ�
		for(int i=0; i<newIntArr.length; i++) {
			System.out.println(" newIntArr[i] : " + newIntArr[i]);
		}

	}

}
