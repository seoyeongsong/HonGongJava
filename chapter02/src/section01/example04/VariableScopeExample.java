package section01.example04;

public class VariableScopeExample {

	public static void main(String[] args) {
		
		int v1 = 5;
		int v2 =0;
		int v3;
		
		if(v1>5) {
			v2 = v1 - 10;
			
			System.out.println("v2 : " + v2);
		}
		v3 = v2 + v1;
		
		System.out.println("v3 : " + v3 + ", v2 : " + v2 + ", v1 : " + v1);
	}

}
