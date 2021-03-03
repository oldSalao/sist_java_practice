package day0119;
/**
단항 연산자
~, !, +, -, ++, --
*/
class Operator1{
	public static void main(String[] args) {
		int i = 19, j = -10;

		System.out.println("~" + i + " = " + ~i ); // -20 출력. ~양수 => 부호변경, 1증가.
		System.out.println("~(" + j + ") = " + ~j ); // 9 출력. ~음수 => 부호변경, 1감소.

		boolean flag1 = true, flag2 = false;
		System.out.println("!" + flag1 + " = " + !flag1); //false
		System.out.println("!" + flag2 + " = " + !flag2); //true

		boolean flag3 = !(3>2); // !은 true나 false 앞에만 붙일 수 있다. 관계연산자와 단항연산자가 함께 사용되면 단항이 먼저 연산된다.
		System.out.println(flag3); //false

		System.out.println("+" + i + " = " + +i ); //19
		System.out.println("+(" + j + ") = " + +j ); //-10

		//2의보수 연산자.
		System.out.println("-" + i + " = " + -i ); //-19 : 값은 그대로이고 부호만 변경
		System.out.println("-(" + j + ") = " + -j ); // 10

		i=100;
		j=50;

		//전위연산 : 대상체 앞에 연산자 사용.
		++i;
		--j;
		System.out.println("전위 연산 후 i : " + i + ", j : " + j);

		//후위연산 : 대상체 뒤에 연산자 사용.
		i++; //101 -> 102
		j--; // 49 -> 48
		System.out.println("후위 연산 후 i : " + i + ", j : " + j);

		i=0;
		j=10;

		i = ++j;
		System.out.println("전위 연산 후 i : " + i + ", j : " + j);

		i=0;
		j=10;

		i = j++;
		System.out.println("후위 연산 후 i : " + i + ", j : " + j);

		i=0;
		System.out.println(++i);//1
		System.out.println(i);//1
		i=0;
		System.out.println(i++);//0
		System.out.println(i);//1
		
	}//main
}//class
