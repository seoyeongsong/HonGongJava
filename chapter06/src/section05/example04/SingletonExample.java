package section05.example04;

public class SingletonExample {

	public static void main(String[] args) {
		// Singleton ��ü �����ϱ�
		Singleton obj1 = Singleton.getInstance();
		Singleton obj2 = Singleton.getInstance();
		
		if(obj1 == obj2) {
			System.out.println("���� Singleton ��ü�Դϴ�.");
		}else {
			System.out.println("�ٸ� Singleton ��ü�Դϴ�.");
		}
		
	}

}
