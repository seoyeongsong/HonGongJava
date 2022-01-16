package section02.example09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// ���̰� 3�� String �迭�� �����Ѵ�.
		String[] oldStrArr = {"java", "python", "c"};
		
		// ���̰� 5�� ���ο� String �迭�� �����Ѵ�.
		String[] newStrArr = new String[5];
		/*
		System.arraycopy(oldStrArr,	// ������ ��� �迭(���� �迭)
							0,		// ���� �迭�� ���� index
							newStrArr, // ������ �� ���� �迭(���ο� �迭)
							0, 			// ���ο� �迭�� ���� index
							0);			// ������ �׸��� ����
		*/
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		
		for(int i=0; i<newStrArr.length; i++) {
			System.out.println("newStrArr[" + i + "] : " +  newStrArr[i]);
		}

	}

}
