package section01.example03;

public class Computer extends Calculator {
	@Override
	double areaCircle(double r) {
		System.out.println("## Computer ��ü�� areaCircle �޼ҵ� ���� ##");
		return Math.PI * r * r;
	}
}
