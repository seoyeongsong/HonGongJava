package section01.example01;

public class DmbCellphoneExample {

	public static void main(String[] args) {
		// 객체 생성
		DmbCellphone dmbcellphone = new DmbCellphone("자바", "검정", 10);
		
		// Cellphone 클래스로부터 상속받은 필드
		System.out.println("모델 : " + dmbcellphone.model);
		System.out.println("색상 : " + dmbcellphone.color);
		
		// DmbCellphone 클래스의 필드
		System.out.println("채널 : " + dmbcellphone.channel);
		
		// Cellphone 클래스로부터 상속받은 메소드 호출
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("안녕하세요.");
		dmbcellphone.receiveVoice("저는 홍길동입니다.");
		dmbcellphone.sendVoice("반갑습니다.");
		dmbcellphone.hangUp();
		
		// DmbCellphone 클래스의 메소드 호출
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDMB(11);
		dmbcellphone.turnOffDmb();

	}

}
