package section02.example10;

public class AdvancedForExample {

	public static void main(String[] args) {
		// ���̰� 5�� ���� Ÿ���� �迭 ����
		int[] scores = { 95, 80, 65, 95, 70};
		
		// ���� for��
		int sum = 0;
		/*
		for(Ÿ�� [������] : �迭) : �迭�� ���̸�ŭ �ݺ��ϸ鼭 �迭 �� ���� �տ� ������ ������ �����ϹǷ�
		for �� �ȿ��� ������ ����� �迭 ���� ����Ѵ�.
		*/
		
		for(int score : scores) {
			sum = sum + score;
		}
		
		System.out.println("�� ��  : " + sum);
	}

}
