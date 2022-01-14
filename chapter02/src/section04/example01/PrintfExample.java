package section04.example01;

public class PrintfExample {

	public static void main(String[] args) {
		// format string 출력하기
		int quantity = 123;
		int price = 500;
		// 변수가 한 개일 경우
		System.out.printf("상품의 재고수량 : %d 개\n", quantity);
		// 변수가 여러 개일 경우
		System.out.printf("상품의 재고수량 : %1$d 개, 상품 단가 : %2$d 원 \n", quantity, price);

	}

}
