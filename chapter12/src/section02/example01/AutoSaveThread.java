package section02.example01;

public class AutoSaveThread extends Thread {
	public void save() {
		System.out.println("작업 내용을 저장함");
	}
	
	@Override
	// run() 메소드 재정의
	public void run() {
		while(true) {
			try {
				Thread.sleep(1000);	//1초간 일시정지
			} catch (InterruptedException e) {
				break;
			}
			save();
		}
	}
}