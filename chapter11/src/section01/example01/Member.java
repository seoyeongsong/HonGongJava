package section01.example01;

public class Member {
	// �ʵ� ����
	public String id;
	
	// ������ ����
	public Member(String id) {
		this.id = id;
	}
	
	// �޼ҵ� ������
	public boolean equals(Object object) {
		if(object instanceof Member) {
			// ���� Ÿ�� ��ȯ
			Member member = (Member) object;
			if(id.equals(member.id)) {
				return true;
			}
		}
		return false;
	}
}