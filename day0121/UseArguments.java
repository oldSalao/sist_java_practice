package day0121;

/**
 * �� Ŭ������ �ܺ� �Է°��� Arguments�� ����ϱ� ���� Ŭ�����Դϴ�. arguments�� �Է��� java ��Ű����.Ŭ������ �� �� ��
 * �Է��Ѵ�.
 * 
 * @author user
 */
public class UseArguments {

	public static void main(String[] args) {

		System.out.println(args[0]);
		System.out.println(args[1]);
		System.out.println(args[2]);
		System.out.println(args[3]);

		System.out.println(Integer.parseInt(args[0]) + Integer.parseInt(args[1]));

		int num1 = Integer.parseInt(args[0]);
		int num2 = Integer.parseInt(args[1]);
		System.out.println(num1 + num2);
	}// main
}// class
