package section02.example09;

public class ArrayCopyExample {

	public static void main(String[] args) {
		// 길이가 3인 String 배열을 생성한다.
		String[] oldStrArr = {"java", "python", "c"};
		
		// 길이가 5인 새로운 String 배열을 생성한다.
		String[] newStrArr = new String[5];
		/*
		System.arraycopy(oldStrArr,	// 복사할 대상 배열(이전 배열)
							0,		// 이전 배열의 시작 index
							newStrArr, // 복사한 값 저장 배열(새로운 배열)
							0, 			// 새로운 배열의 시작 index
							0);			// 복사할 항목의 길이
		*/
		System.arraycopy(oldStrArr, 0, newStrArr, 0, oldStrArr.length);
		
		for(int i=0; i<newStrArr.length; i++) {
			System.out.println("newStrArr[" + i + "] : " +  newStrArr[i]);
		}

	}

}
