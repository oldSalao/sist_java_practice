package day0201;

public class UseHomework {

	public static void main(String[] args) {
		Homework h = new Homework("960302-1234567");
		if (h.numLengthChk()) {
			if (h.hypChk()) {
				System.out.println("�Է��ֹι�ȣ : " + h.getRegistNum());
				System.out.println("������� : " + h.bornDate());
				System.out.println("���� : " + h.getAge());
				System.out.println("���� : " + h.getGender());
				System.out.println("�� : " + h.getBelt());
			}
			else{
				System.out.println("-�� �������� ��ġ�� �����ϴ�.");
			}
		}
		else {
			System.out.println("�ֹι�ȣ�� ���ڼ��� ���� �ʽ��ϴ�.");
		}
	}

}
