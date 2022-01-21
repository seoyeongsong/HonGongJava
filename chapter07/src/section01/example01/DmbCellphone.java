package section01.example01;

// 자식 클래스(파생 클래스)
public class DmbCellphone extends Cellphone{
	// 필드
	int channel;
	
	// 생성자
	DmbCellphone(String model, String color, int channel) {

		this.model = model;	// 부모로부터 상속받은 필드
		this.color = color;	// 부모로부터 상속받은 필드
		this.channel = channel;
	}
	
	// 메소드
	void turnOnDmb() {
		System.out.println("채널 " + channel + "번 DMB 방송 수신을 시작합니다.");
	}
	
	void changeChannelDMB(int channel) {
		this.channel = channel;
		System.out.println("채널 " + channel + "번으로 바꿉니다.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB 방속 수신을 멈춥니다.");
	}
}
