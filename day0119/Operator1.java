package day0119;
/**
���� ������
~, !, +, -, ++, --
*/
class Operator1{
	public static void main(String[] args) {
		int i = 19, j = -10;

		System.out.println("~" + i + " = " + ~i ); // -20 ���. ~��� => ��ȣ����, 1����.
		System.out.println("~(" + j + ") = " + ~j ); // 9 ���. ~���� => ��ȣ����, 1����.

		boolean flag1 = true, flag2 = false;
		System.out.println("!" + flag1 + " = " + !flag1); //false
		System.out.println("!" + flag2 + " = " + !flag2); //true

		boolean flag3 = !(3>2); // !�� true�� false �տ��� ���� �� �ִ�. ���迬���ڿ� ���׿����ڰ� �Բ� ���Ǹ� ������ ���� ����ȴ�.
		System.out.println(flag3); //false

		System.out.println("+" + i + " = " + +i ); //19
		System.out.println("+(" + j + ") = " + +j ); //-10

		//2�Ǻ��� ������.
		System.out.println("-" + i + " = " + -i ); //-19 : ���� �״���̰� ��ȣ�� ����
		System.out.println("-(" + j + ") = " + -j ); // 10

		i=100;
		j=50;

		//�������� : ���ü �տ� ������ ���.
		++i;
		--j;
		System.out.println("���� ���� �� i : " + i + ", j : " + j);

		//�������� : ���ü �ڿ� ������ ���.
		i++; //101 -> 102
		j--; // 49 -> 48
		System.out.println("���� ���� �� i : " + i + ", j : " + j);

		i=0;
		j=10;

		i = ++j;
		System.out.println("���� ���� �� i : " + i + ", j : " + j);

		i=0;
		j=10;

		i = j++;
		System.out.println("���� ���� �� i : " + i + ", j : " + j);

		i=0;
		System.out.println(++i);//1
		System.out.println(i);//1
		i=0;
		System.out.println(i++);//0
		System.out.println(i);//1
		
	}//main
}//class
