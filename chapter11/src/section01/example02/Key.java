package section01.example02;

public class Key {
	// �ʵ� ����
	public int number;
	
	// ������
	public Key(int number) {
		this.number = number;
	}
	
	public boolean equals(Object obj) {
		if(obj instanceof Key) {
			// Ÿ�� ��ȯ
			Key compareKey = (Key) obj;
			
			if(this.number == compareKey.number) {
				return true;
			}
		}
		return false;
	}
	
	// hashCode() �޼ҵ� ������
	public int hashCode() {
		return number;
	}
}
