package day0125;

/**
 * for���� �پ��� ����.
 * 
 * @author user
 *
 */
public class TestForType {
	public static void main(String[] args) {
		// �������� �ε����� �ѹ��� ����� ��.(�ʱⰪ�� �������� ������ ����.)
		// ��,���ҽ��� for���� �������� �� �ִ� ������ ���� �������� �����ص� �ȴ�.
		for (int i = 0, j = 10, k = 50; i < 10; i++, k += 5) {
			System.out.println("i = " + i + ", j = " + j + ", k = " + k);
		}
		
		//���ѷ���
		//���� �� �ʿ䰡 ������
		
		for(;;) {
			System.out.println("���ѷ���");
			break; // �극��ũ�� ������ ���ѷ����� �Ǿ� �Ʒ� ��¹��� ������ ��Ÿ��.
		}
		
		System.out.println("�׽�Ʈ");
		
		//���� �� �ʿ䰡 ������
		for(int i = 0; ; i++) {
			System.out.println("���ѷ��� : " + i);
			if(i==10) {
				break;
			}
		}
		System.out.println("�׽�Ʈ");
	}
}