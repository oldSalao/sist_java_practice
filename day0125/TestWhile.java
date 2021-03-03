package day0125;

/**
 * while <br>
 * 시작과 끝을 모를 때 사용하는 반복문. <br>
 * 
 * @author user
 */
public class TestWhile {

	public static void main(String[] args) {
		int i = 0; // 초기값
		while (i < 10) {// 조건식
			System.out.println("안녕하세요?");// 반복수행문장
			i++; // 증가또는 감소식.
		}

		/////////////////////// 단을 입력받아 단이 2단에서 9단 사이일 때에만 입력받은 단으로 구구단 출력

		int input = Integer.parseInt(args[0]);
		i = 1;

		if ((input > 1) && (input < 10)) {
			while (i < 10) {
				System.out.println(input + " * " + i + " = " + (input * i));
				i++;
			}
		}
	}

}
