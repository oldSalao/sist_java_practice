package day0118;
/**
 Constant�� Ȱ��.(������ ���ó�� ����ϱ�)<br/>
 ������ Class field���� �����ϴ�.<br/>
 public static final �������� ����� = ��;<br/>
 ���ÿ���<br/>
  �����<br/>
  Ŭ������.�����<br/>
 �ٸ� Ŭ�������� ����� ����<br/>
  Ŭ������.�����<br/>
*/
class  Constant{
	//class field

	//constant
	public static final int MAX_SCORE = 100;
	public static final int MIN_SCORE = 0;

	public static void main(String[] args) {
		//local

		//public static final int MIN_SCORE = 0; //constant�� class field������ ���� �� �ִ�.

		System.out.println("�ְ��� : " + MAX_SCORE);
		System.out.println("������ : " + Constant.MIN_SCORE);

		//Local Variable
		int myScore = 90;

		System.out.println("ȹ������ : " + myScore);

		myScore = 95;
		//MAX_SCORE = 99;//����� ������ ���� �̿ܿ��� ���� �Ҵ��� �� ����.

		System.out.println("�� ������ " + myScore + "�� �̰�, �ְ� ������ " + Constant.MAX_SCORE + "�� �Դϴ�. �ְ� ������ �� �������� ���̴� " + (MAX_SCORE-myScore) + "�� �Դϴ�.");
		
		//java.lang package���� �����ϴ� Wrapper class�� ����� ���.
		System.out.println("Byte�� �ּҰ� : " + java.lang.Byte.MIN_VALUE + " �ִ밪 : " + Byte.MAX_VALUE);
	
		byte b1 = 10;
		byte b2 = 20;
		//int�� ���� ���������� �����ϸ� ������ ����� promotion�� ���� int�� �߻��Ѵ�.
		//������ ������ ���� int�� �ٲٰų� ������ ����� byte�� ���� ����ȯ ���ش�.
		byte result = (byte)(b1 + b2);

		System.out.println(b1 + " + " + b2 + " = " + result);
	}//main
}//class
