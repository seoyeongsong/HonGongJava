package section01.example01;

public class MyClass {

	// 1. �ʵ�
	RemoteControl rc = new Television();


	// 2. ������
	MyClass() {

	}

	MyClass(RemoteControl rc) {
		this.rc = rc;
		rc.turnOn();
		rc.setVolume(5);
	}



	// 3. �޼ҵ�
	void methodA() {
		RemoteControl rc = new Audio();
		rc.turnOn();
		rc.setVolume(5);
	}

	void methodB(RemoteControl rc) {
		rc.turnOn();
		rc.setVolume(5);
	}

}
