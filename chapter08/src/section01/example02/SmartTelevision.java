package section01.example02;

public class SmartTelevision implements RemoteControl, Searchable {
	// �ʵ�
	private int volume;
	
	// �޼ҵ�
	// Searchable �������̽��� �߻� �޼ҵ忡 ���� ��ü �޼ҵ�
	@Override
	public void search(String url) {
		System.out.println(url + " �� �˻��մϴ�. ");
	}

	// RemoteControl �������̽��� �߻� �޼ҵ忡 ���� ��ü �޼ҵ�
	@Override
	public void turnOn() {
		System.out.println("TV�� �մϴ�.");
	}

	@Override
	public void turnOff() {
		System.out.println("TV�� ���ϴ�.");
	}

	@Override
	public void setVolume(int volume) {
		if(volume > RemoteControl.MAX_VOLUME) {
			this.volume = RemoteControl.MAX_VOLUME;
		}else if(volume < RemoteControl.MIN_VOLUME) {
			this.volume = RemoteControl.MIN_VOLUME;
		}else {
			this.volume = volume;
		}
		System.out.println("���� ������ " + volume + " �Դϴ�.");
	}
}