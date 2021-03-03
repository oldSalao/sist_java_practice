package day0121;

/**
 * 단일 if 사용. 조건에 맞을 경우에만 코드를 실행할 때 사용. 문법) if(조건식){ 조건에 맞을 때 수행할 문장들... }
 * 
 * @author user
 */
public class Testif {

	public static void main(String[] args) {
		int num = Integer.parseInt(args[0]);

		if (num < 0) {
			num = -num;
		}

		System.out.println(args[0] + "의 절대값은 " + num);

		// args[0]이 홀수인 경우에 1이 더해진 짝수로 만들어 출력.
		int num2 = Integer.parseInt(args[0]);
		
		if ((num2 % 2) != 0) {
			System.out.println(++num2);
		}

		// args[1]을 출력한 후 args[1]이 "둘리"인 경우에만 "어! 도우너 어서오고"
		System.out.println(args[1]);
		
		if (args[1].equals("둘리")) {
			System.out.println("어! 도우너 어서오고");
		}
	}// main
}// class
