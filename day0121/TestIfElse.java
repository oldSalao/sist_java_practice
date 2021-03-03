package day0121;

/**
 *	if-else
 *	둘 중 하나의 코드를 실행해야할 때 사용.
 *	문법)
 *	if(조건식){
 *	조건에 맞을 때 수행할 문장들
 *	}
 *	else{
 *	조건에 맞지 않을 때 수행할 문장들.
 * @author user
 */
public class TestIfElse {
	public static void main(String[] args) {
		// 수를 입력받아 수를 출력한 후 수가 홀수라면 "홀수"를 출력하고 그렇지않다면 "짝수"를 출력하라.
		int num = Integer.parseInt(args[0]);

		System.out.println(num);

		if (num % 2 == 0) {
			System.out.println("짝수");
		} else {
			System.out.println("홀수");
		}
		
		//수가 "양수"인지 "음수인지를 출력"
		
		if (num>=0) {
			System.out.println("양수");
		}
		else {
			System.out.println("음수");
		}
		
		//args[1]의 값을 받아서 int형의 score변수에 저장하고 점수가 0~100사이라면 "유효점수"를 출력하고
		//그렇지 않다면 "무효점수"를 출력하세요.
		
		int score = Integer.parseInt(args[1]);//경계값 테스트를 해야함. -1,0,중간값,100,101
		
		if((score>-1)&&(score<101)) { 
			System.out.println("유효점수");
		}
		else {
			System.out.println("무효점수");
		}
		
		
		//
	}//main
}//class
