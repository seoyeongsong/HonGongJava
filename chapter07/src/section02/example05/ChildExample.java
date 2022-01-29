package section02.example05;

public class ChildExample {

	public static void main(String[] args) {
		// 자동타입 변환하여 필드, 메소드 사용하기 사용하기
		Parent parent = new Child();
		parent.field1 = "data1";
		parent.method1();
		parent.method2();
		
		// 강제타입 변환하여 부모 클래스에 없는 필드와 메소드 사용하기
		Child child = (Child) parent;
		child.field2 = "yyy";
		child.method3();
	}
}
