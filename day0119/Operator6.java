package day0119;
/**
����(����) ������.
 ? :
*/

class Operator6 {
	public static void main(String[] args) {
		int num = -6;
		//num ������ �Ҵ�� �������� ������� �������� �Ǵ��Ͽ� ����ϴ� �ڵ�.
		System.out.println(num + "��(��) " + ((num>=0)?"���":"����"));

		int num2 = 2030;
		//num2 ������ �Ҵ�� �������� Ȧ������ ¦������ �Ǵ��Ͽ� ����ϴ� �ڵ�.
		System.out.println(num2 + "��(��) " + ((num2%2==0)?"¦��":"Ȧ��"));
	}//main
}//class
