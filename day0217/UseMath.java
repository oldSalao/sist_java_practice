package day0217;

/**
 * �����ڰ� �������� �ʾ�(�����ڰ� private��) ��ü ������ ���� �ʰ� ����ϴ� Ŭ����.
 * @author user
 */
public class UseMath {
	
	public UseMath() {
		//Math m = new Math(); // �����ڰ� private�̹Ƿ� ��ü ���� �Ұ���.
		int i = 2021;
		double d = -2021.02;
		System.out.println(Math.abs(i));
		System.out.println(Math.abs(d));
		
		//�ݿø�
		d=10.6;
		System.out.println(d + "�ݿø�" + Math.round(d));
		//�ø�
		d=10.0;
		System.out.println(d + "�ø�" + Math.ceil(d));
		//����
		d=10.9;
		System.out.println(d + "����" + Math.floor(d));
		//����, casting���� ó��
		d=10.5;
		System.out.println(d + "����" + (int)d);
		
		//����
		double ran = Math.random();
		
		System.out.println("���� : " + ran);
		System.out.println("���� : " + ran*10); // 0~9������ 10���� ���� �ϳ� ��� (�Ǽ� �߻�).
		System.out.println("���� : " + (int)(ran*10)); // 0~9������ 10���� ���� �ϳ� ��� (����).
		
		//1�������� 10������ ����
		System.out.println("���� : " + (int)(ran*10+1));
		
		System.out.println("�빮�� : " + (char)((int)(ran*26+65)));
		
		System.out.println("�ҹ��� : " + (char)((int)(ran*26+97)));
		
		System.out.println("����(char) : " + (char)((int)(ran*10+48)));
	}

	public static void main(String[] args) {
		new UseMath();
	}

}
