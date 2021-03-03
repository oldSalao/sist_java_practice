package day0115;
/**
method 안에서 선언하는 지역변수의 특징.
*/

class  UseLocalVariable{
	public static void main(String[] args) {
		//1.선언 : 데이터형 변수명;
		int i; //초기화 하지 않은 선언.
		int j=0; //초기화한 선언. -> 권장.
		int k;
		//같은 이름의 변수를 선언하면 Error.
		//int i;

		//2.값 할당 : 변수명=값;
		i = 15;
		j=1;

		//3.값 사용 : 출력,연산,재할당.
		System.out.println( i );//15
		System.out.println( j );
		i = 2021;

		//값을 할당 하지 않은 변수를 사용하면 Error.
		//System.out.println( k );

		k=0;

		System.out.println( k );
		System.out.println( i );//2021

		int myAge = 0;
		myAge = 26;
		System.out.println(myAge);

		int year = 2021;
		System.out.println("올해는 "+year+"년 입니다.");
	}
}
