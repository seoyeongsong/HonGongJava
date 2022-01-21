package section01.example01;

// 부모 클래스
public class Cellphone {
	// 필드 선언
	String model;
	String color;
	
	// 메소드
	void powerOn() {System.out.println("전원을 켠다.");}
	void powerOff() {System.out.println("전원을 끈다.");}
	void bell() {System.out.println("벨이 울린다.");}
	void sendVoice(String message) {System.out.println("자신 : " + message);}
	void receiveVoice(String message) {System.out.println("상대방 : " + message);}
	void hangUp() {System.out.println("전화를 끊는다.");}
}
