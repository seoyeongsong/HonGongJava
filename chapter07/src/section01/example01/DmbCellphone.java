package section01.example01;

// �ڽ� Ŭ����(�Ļ� Ŭ����)
public class DmbCellphone extends Cellphone{
	// �ʵ�
	int channel;
	
	// ������
	DmbCellphone(String model, String color, int channel) {

		this.model = model;	// �θ�κ��� ��ӹ��� �ʵ�
		this.color = color;	// �θ�κ��� ��ӹ��� �ʵ�
		this.channel = channel;
	}
	
	// �޼ҵ�
	void turnOnDmb() {
		System.out.println("ä�� " + channel + "�� DMB ��� ������ �����մϴ�.");
	}
	
	void changeChannelDMB(int channel) {
		this.channel = channel;
		System.out.println("ä�� " + channel + "������ �ٲߴϴ�.");
	}
	
	void turnOffDmb() {
		System.out.println("DMB ��� ������ ����ϴ�.");
	}
}
