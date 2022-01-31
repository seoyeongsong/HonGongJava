package section01.example05;

public class ResourcePathExample {
	public static void main(String[] args) {
		// 
		Class clazz = Car.class;
		
		System.out.println("clazz : " + clazz);
		String photoPath = clazz.getResource("1.jpg").getPath();
		
		System.out.println("photoPath : " + photoPath);
	}
}
