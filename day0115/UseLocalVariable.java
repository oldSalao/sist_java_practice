package day0115;
/**
method �ȿ��� �����ϴ� ���������� Ư¡.
*/

class  UseLocalVariable{
	public static void main(String[] args) {
		//1.���� : �������� ������;
		int i; //�ʱ�ȭ ���� ���� ����.
		int j=0; //�ʱ�ȭ�� ����. -> ����.
		int k;
		//���� �̸��� ������ �����ϸ� Error.
		//int i;

		//2.�� �Ҵ� : ������=��;
		i = 15;
		j=1;

		//3.�� ��� : ���,����,���Ҵ�.
		System.out.println( i );//15
		System.out.println( j );
		i = 2021;

		//���� �Ҵ� ���� ���� ������ ����ϸ� Error.
		//System.out.println( k );

		k=0;

		System.out.println( k );
		System.out.println( i );//2021

		int myAge = 0;
		myAge = 26;
		System.out.println(myAge);

		int year = 2021;
		System.out.println("���ش� "+year+"�� �Դϴ�.");
	}
}
