package day0115;
/**
주석의 연습
class 위에 Java Doc 주석 설정하여 클래스의 설명을 작성.
Doc 주석은 javadoc.exe를 사용하여 API 문서를 생성할 수 있다.
*/

class  UseComment{
	public static void main(String[] args) {
		//한줄 주석.
		//System.out.println("A");

		//여러줄 주석.
		/*
		System.out.println("A");
		System.out.println("B");
		System.out.println("C");
		*/
		
		System.out.println("A");

		//아래와 같이 코드의 영역을 표현하는데에 사용하기도 함.
		/////////////////////////////코드시작///////////////////////////////////

		System.out.println("B"/*여러줄 주석 여기에도 들어갈 수 있음.*/);

		/////////////////////////////코드끝/////////////////////////////////////

	}
}