package day0122;

/**
 * 일치하는 정수를 비교할 때 사용하는 switch - case문.<br/>
 * 문법)<br/>
 * 	switch (변수명){ case 상수 : 실행문장; <br/>
 * 		case 상수 : 실행문장; <br/>
 * 		case 상수 : 실행문장; <br/>
 * 		case 상수 : 실행문장; <br/>
 * 		default : 실행문장; <br/>
 * 	}
 * 
 * @author user
 */
public class TestSwitchCase {
	public static void main(String[] args) {
		int i = 2; // byte,short,int,char (long은 switch에 사용불가.)

//		switch (i) {//정수를 저장한 변수만 사용 할 수 있다.
//		case 0:
//			System.out.println("ZERO");
//		case 1:
//			System.out.println("ONE");
//		case 2:
//			System.out.println("TWO");
//		default:
//			System.out.println("일치하는 상수 없음.");
//		}
		
//		// case의 상수는 입력되는 데이터형의 범위까지만 사용할 수 있다
//		//Int형 i에 2147483648 사용 불가능.
//		switch (i) {
//		case 2147483648L:
//			System.out.println("ZERO");
//		case 1 :
//			System.out.println("ONE");
//		case 2:
//			System.out.println("TWO");
//		default:
//			System.out.println("일치하는 상수 없음.");
//		}
		
//		///////////////////////char형//////////////////////////
//		char c = 'A'; // char는 입력되는 문자에 대응하는 Unicode 값을 저장.
//		switch (c) {
//		case 65:
//			System.out.println("A");
//		case 'B' :
//			System.out.println("B");
//		case 'C':
//			System.out.println("C");
//		default:
//			System.out.println("일치하는 상수 없음.");
//		}
		
		
		///////////////////////String//////////////////////////
		String s = "Oracle" ; // JavaSE 7 부터 지원.
		switch (s) {
		case "Java":
			System.out.println("완벽한 OOP언어");
			break;
		case "Oracle" :
			System.out.println("대용량 데이터베이스");
			break;//break가 실행되면 아랫줄의 코드를 실행하지 않고 switch를 빠져나간다.
		case "HTML":
			System.out.println("마크업 언어");
			break;
		default:
			System.out.println("일치하는 상수 없음.");
			break;
		}
		
	}
}
