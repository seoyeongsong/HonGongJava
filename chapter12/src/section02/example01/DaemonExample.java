package section02.example01;

public class DaemonExample {
	public static void main(String[] args) {
		// Thread ��ü ����
		AutoSaveThread thread =  new AutoSaveThread();
		// ���� ������ ����
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(4000);	// 3�ʰ� �Ͻ� ����
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("���� ������ ����");
	}
}