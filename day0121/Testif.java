package day0121;

/**
 * ���� if ���. ���ǿ� ���� ��쿡�� �ڵ带 ������ �� ���. ����) if(���ǽ�){ ���ǿ� ���� �� ������ �����... }
 * 
 * @author user
 */
public class Testif {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);

		if (num < 0) {
			num = -num;
		}

		System.out.println(args[0] + "�� ���밪�� " + num);

		// args[0]�� Ȧ���� ��쿡 1�� ������ ¦���� ����� ���.
		int num2 = Integer.parseInt(args[0]);
		
		if ((num2 % 2) != 0) {
			System.out.println(++num2);
		}

		// args[1]�� ����� �� args[1]�� "�Ѹ�"�� ��쿡�� "��! ����� �����"
		System.out.println(args[1]);
		
		if (args[1].equals("�Ѹ�")) {
			System.out.println("��! ����� �����");
		}
	}// main
}// class
