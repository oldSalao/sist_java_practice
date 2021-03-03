package day0115;
/**
변수의 선언과 초기화, 출력 관련 숙제.
*/
class Homework
{
	public static void main(String[] args) 
	{
		//////////////////////////////변수 선언, 초기화////////////////////////////////
		int year = 2021, month = 1, day = 15; //년, 월, 일
		char initialFirst = 'A', initialSecond = 'B', initialThird = 'C'; //이니셜을 담는 변수.
		double leftEye = 1.5, rightEye = 2.0, bothEye = (leftEye+rightEye) / 2;// 시력을 담는 변수
		boolean flag = false;//불리언형 변수.

		///////////////////////////////출력문//////////////////////////////////////////
		System.out.println("오늘은 " + year + "년 " + month + "월 " + day + "일 입니다.");
		System.out.println("내이름의 이니셜은 " + initialFirst + ", " + initialSecond + ", " + initialThird + " 입니다");
		System.out.println("왼눈시력 " + leftEye + " 오른눈 시력 " + rightEye + " 양안시력 " + bothEye + "입니다.");
		System.out.println("기본형 데이터형인 boolean형은 기본 값이 " + flag + "로 설정됩니다.");
	}
}