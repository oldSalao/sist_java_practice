package day0118;
/**
 ���� ����ȯ.<br/>
 ���� �ش� �࿡���� �Ͻ������� �ٸ� ������ �����ؾ��� �� ���.<br/>
 (��ȯ�� ��������)��
*/
class Casting{
	public static void main(String[] args) {
		char c = 'A';
		System.out.println(c + "�� Unicode �� " + (int)c );

		float f = (float)2021.01;//�Ǽ� literal�� �״�� �ΰ� �Ҵ��� �� ���� float���� ����.
		System.out.println(f);

		int i = (int)f;//byte ���� ������ �Ǽ� ������ ���� ������ �Ҵ�� �� ����. ���� (int)�� casting�� ���ش�. (�� �ս� �߻�)
		System.out.println("���� ����ȯ �� �� : " + i + " ���� �� : " + f);

		double d = 1.111111111111111;
		f = (float)d;//�� �ս�(�ø�) �߻�.
		System.out.println("���� ����ȯ �� �� : " + f + " ���� �� : " + d);

		/////////////////////////////////casting error//////////////////////////////////////
		String s = "2021";
		i = Integer.parseInt(s); // String�� int�� casting�� �Ұ��������� Integer.parseInt(string)�� ����ϸ� �����ϴ�.
		System.out.println(i);

		boolean b = false;
		//i = (int)b; // boolean�� �ٸ� ������ ������ �� ����.
		System.out.println(b);

		byte num1 = 10;
		byte num2 = 20;
		byte result = (byte)(num1+num2);

		System.out.println(num1 + " + " + num2 + " = " + result);

	}//main
}//class