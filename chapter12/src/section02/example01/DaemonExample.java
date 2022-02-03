package section02.example01;

public class DaemonExample {
	public static void main(String[] args) {
		// Thread 객체 생성
		AutoSaveThread thread =  new AutoSaveThread();
		// 데몬 스레드 생성
		thread.setDaemon(true);
		thread.start();
		
		try {
			Thread.sleep(4000);	// 3초간 일시 정지
		} catch (InterruptedException e) {
			// TODO: handle exception
		}
		System.out.println("메인 스레드 종료");
	}
}