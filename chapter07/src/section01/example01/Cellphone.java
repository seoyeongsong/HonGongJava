package section01.example01;

// �θ� Ŭ����
public class Cellphone {
	// �ʵ� ����
	String model;
	String color;
	
	// �޼ҵ�
	void powerOn() {System.out.println("������ �Ҵ�.");}
	void powerOff() {System.out.println("������ ����.");}
	void bell() {System.out.println("���� �︰��.");}
	void sendVoice(String message) {System.out.println("�ڽ� : " + message);}
	void receiveVoice(String message) {System.out.println("���� : " + message);}
	void hangUp() {System.out.println("��ȭ�� ���´�.");}
}
