package section02.example08;

public class ArrayCopyForExample {

	public static void main(String[] args) {
		// 길이가 3이고 정수를 저장하는 정수 타입의 배열을 생성
		int[] oldIntArr = {1, 2, 3};
		
		// 길이가 5인 새로운 배열을 생성
		int[] newIntArr = new int[5];
		
		// for 문을 통해 이전 배열의 값을 복사하여 새로운 배열로 저장
		for(int i =0; i<oldIntArr.length; i++) {
			newIntArr[i] = oldIntArr[i];
		}
		
		//새로 생성한 배열의 값을 출력하기
		for(int i=0; i<newIntArr.length; i++) {
			System.out.println(" newIntArr[i] : " + newIntArr[i]);
		}

	}

}
