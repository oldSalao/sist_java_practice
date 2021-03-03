package day0115;
/**
기본형 데이터형의 사용.
기본형 데이터형을 사용하여 선언한 변수는 상수 값을 저장한다.
*/

class PrimitiveType{
	public static void main(String[] args) {
		////////////////////////////정수형//////////////////////////////////
		byte a = 10;
		short b = 20;
		int c = 30;
		long d = 40;
		// 정수 literal의 크기는 4byte이므로 int의 범위를 초과하는 상수값을 기술할 수 없다.
		//하지만 후미에 L로 실수형을 명시해주면 실수리터럴 즉, 8byte가 되어 문제가 없어진다.
		long e = 3000000000L; 
		
		System.out.println("byte : "+ a +", short : "+b+", int : "+c+", long : "+d+", "+e);

		/////////////////////////////문자형///////////////////////////////
		char f = 'A';
		//char형에는 사실 코드값이 저장된다. 코드 48 = '0'
		char g = 48;
		char h = '가';
		//char를 출력하면 코드값에 대한 문자를 출력.
		System.out.println("char : "+f+", "+g+", "+h);

		////////////////////////////실수형/////////////////////////////////
		//float의 저장공간은 4byte이므로 실수를 대입할때에는 실수리터럴 후미에 f를 입력해줘야 한다.
		float i = 3.14F;
		//double에 대입하는 실수 리터럴에는 형명시 D 생략 가능.
		double j = 3.14, k = 3.14D;

		System.out.println("float : " + i + ", double : " + j + ", " + k);

		///////////////////////////////불린///////////////////////////////////////////
		boolean l = true;

		System.out.println(l);
	}
}
