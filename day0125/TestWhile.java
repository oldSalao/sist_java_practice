package day0125;

/**
 * while <br>
 * ���۰� ���� �� �� ����ϴ� �ݺ���. <br>
 * 
 * @author user
 */
public class TestWhile {

	public static void main(String[] args) {
		int i = 0; // �ʱⰪ
		while (i < 10) {// ���ǽ�
			System.out.println("�ȳ��ϼ���?");// �ݺ����๮��
			i++; // �����Ǵ� ���ҽ�.
		}

		/////////////////////// ���� �Է¹޾� ���� 2�ܿ��� 9�� ������ ������ �Է¹��� ������ ������ ���

		int input = Integer.parseInt(args[0]);
		i = 1;

		if ((input > 1) && (input < 10)) {
			while (i < 10) {
				System.out.println(input + " * " + i + " = " + (input * i));
				i++;
			}
		}
	}

}
