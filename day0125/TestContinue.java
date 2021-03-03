package day0125;

/**
 * continue 반복문의 실행을 건너 뛸 때.<br>
 * @author user
 */
public class TestContinue {
	public static void main(String[] args) {
		//1에서부터 100까지의 수중에 짝수만 출력.
		for(int i = 1; i < 100; i++) {
			if(i%2!=0) {
				continue;//증감식으로 실행위치를 변경.
			}
			System.out.println(i);//홀수일때는 건너뛰어야할 코드.
		}
		
		for(int i = 1; i < 101; i++) {
			if(i%3==0) {
			System.out.print("짝 ");
			continue;
			}
			System.out.print(i+" ");
		}
	}
}