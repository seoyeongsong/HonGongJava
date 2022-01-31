package section01.example02;

import java.util.HashMap;

public class KeyExample {

	public static void main(String[] args) {
		// Key ��ü�� �ĺ�Ű�� �Ͽ� String ���� �����ϴ� HashMap ��ü ����
		HashMap<Key, String> hashMap = new HashMap<Key, String>();
		
		// put() �޼ҵ�� Ű:�� ������ �ֱ�
		// 1 : ȫ�浿 �߰�
		hashMap.put(new Key(1), "ȫ�浿");
		// 2 : ���ڹ� �߰�
		hashMap.put(new Key(2), "���ڹ�");
		
		// get() �޼ҵ�� hashMap �� ����� ������ �б�
		String value = hashMap.get(new Key(1));
		
		System.out.println("value Ȯ���ϱ� : " + value);
	}
}
