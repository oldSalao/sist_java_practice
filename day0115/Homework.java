package day0115;
/**
������ ����� �ʱ�ȭ, ��� ���� ����.
*/
class Homework
{
	public static void main(String[] args) 
	{
		//////////////////////////////���� ����, �ʱ�ȭ////////////////////////////////
		int year = 2021, month = 1, day = 15; //��, ��, ��
		char initialFirst = 'A', initialSecond = 'B', initialThird = 'C'; //�̴ϼ��� ��� ����.
		double leftEye = 1.5, rightEye = 2.0, bothEye = (leftEye+rightEye) / 2;// �÷��� ��� ����
		boolean flag = false;//�Ҹ����� ����.

		///////////////////////////////��¹�//////////////////////////////////////////
		System.out.println("������ " + year + "�� " + month + "�� " + day + "�� �Դϴ�.");
		System.out.println("���̸��� �̴ϼ��� " + initialFirst + ", " + initialSecond + ", " + initialThird + " �Դϴ�");
		System.out.println("�޴��÷� " + leftEye + " ������ �÷� " + rightEye + " ��Ƚ÷� " + bothEye + "�Դϴ�.");
		System.out.println("�⺻�� ���������� boolean���� �⺻ ���� " + flag + "�� �����˴ϴ�.");
	}
}