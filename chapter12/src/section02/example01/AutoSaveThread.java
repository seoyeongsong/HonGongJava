package section02.example01;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("�۾� ������ ������");
	}
	
	@Override
	// run() �޼ҵ� ������
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);	//1�ʰ� �Ͻ�����
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}