package section01.example01;

public class DmbCellphoneExample {

	public static void main(String[] args) {
		// ��ü ����
		DmbCellphone dmbcellphone = new DmbCellphone("�ڹ�", "����", 10);
		
		// Cellphone Ŭ�����κ��� ��ӹ��� �ʵ�
		System.out.println("�� : " + dmbcellphone.model);
		System.out.println("���� : " + dmbcellphone.color);
		
		// DmbCellphone Ŭ������ �ʵ�
		System.out.println("ä�� : " + dmbcellphone.channel);
		
		// Cellphone Ŭ�����κ��� ��ӹ��� �޼ҵ� ȣ��
		dmbcellphone.powerOn();
		dmbcellphone.bell();
		dmbcellphone.sendVoice("�ȳ��ϼ���.");
		dmbcellphone.receiveVoice("���� ȫ�浿�Դϴ�.");
		dmbcellphone.sendVoice("�ݰ����ϴ�.");
		dmbcellphone.hangUp();
		
		// DmbCellphone Ŭ������ �޼ҵ� ȣ��
		dmbcellphone.turnOnDmb();
		dmbcellphone.changeChannelDMB(11);
		dmbcellphone.turnOffDmb();

	}

}
