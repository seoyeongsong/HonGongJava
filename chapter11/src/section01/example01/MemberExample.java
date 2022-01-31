package section01.example01;

public class MemberExample {
	public static void main(String[] args) {
		Member obj1 = new Member("blue");
		Member obj2 = new Member("red");
		Member obj3 = new Member("blue");
		
		if(obj1.equals(obj2)) {
			System.out.println("obj1 와 obj2 는 동일합니다.");
		}else {
			System.out.println("obj1 와 obj2 는 동일하지 않습니다.");
		}
		System.out.println("===================================");
		if(obj1.equals(obj3)) {
			System.out.println("obj1 와 obj3 는 동일합니다.");
		}else {
			System.out.println("obj1 와 obj3 는 동일하지 않습니다.");
		}
	}
}
