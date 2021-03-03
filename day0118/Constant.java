package day0118;
/**
 Constant의 활용.(변수를 상수처럼 사용하기)<br/>
 선언은 Class field에만 가능하다.<br/>
 public static final 데이터형 상수명 = 값;<br/>
 사용시에는<br/>
  상수명<br/>
  클래스명.상수명<br/>
 다른 클래스에서 사용할 때는<br/>
  클래스명.상수명<br/>
*/
class  Constant{
	//class field

	//constant
	public static final int MAX_SCORE = 100;
	public static final int MIN_SCORE = 0;

	public static void main(String[] args) {
		//local

		//public static final int MIN_SCORE = 0; //constant는 class field에서만 만들 수 있다.

		System.out.println("최고점 : " + MAX_SCORE);
		System.out.println("최하점 : " + Constant.MIN_SCORE);

		//Local Variable
		int myScore = 90;

		System.out.println("획득점수 : " + myScore);

		myScore = 95;
		//MAX_SCORE = 99;//상수는 선언한 문장 이외에는 값을 할당할 수 없다.

		System.out.println("내 점수는 " + myScore + "점 이고, 최고 점수는 " + Constant.MAX_SCORE + "점 입니다. 최고 점수와 내 점수간의 차이는 " + (MAX_SCORE-myScore) + "점 입니다.");
		
		//java.lang package에서 제공하는 Wrapper class의 상수를 사용.
		System.out.println("Byte의 최소값 : " + java.lang.Byte.MIN_VALUE + " 최대값 : " + Byte.MAX_VALUE);
	
		byte b1 = 10;
		byte b2 = 20;
		//int의 하위 데이터형을 연산하면 연산의 결과는 promotion에 의해 int로 발생한다.
		//대입할 변수의 형을 int로 바꾸거나 연산의 결과를 byte로 강제 형변환 해준다.
		byte result = (byte)(b1 + b2);

		System.out.println(b1 + " + " + b2 + " = " + result);
	}//main
}//class
