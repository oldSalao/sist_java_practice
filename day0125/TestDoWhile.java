package day0125;

import javax.swing.JOptionPane;

/**
 * do~while <br>
 * 시작과 끝을 모를때 사용하는 반복문<br>
 * 최소 1번 수행, 최대 조건까지 수행. <br>
 * 
 * @author user
 */
public class TestDoWhile {

	public static void main(String[] args) {

		int i = 0;// 초기값
		do {
			System.out.println("안녕하세요?"); // 반복수행 문장.
			i++;// 증감소식
		} while (i < 10);

		// Do-while로 메뉴를 구현할 수 있다.
//		boolean exitFlag = false;
//		do {
//			String menu = JOptionPane.showInputDialog("메뉴선택\n1.입력 2.출력 3.저장 4.종료");
//			if (menu.equals("4")) {
//				exitFlag = true;
//			}
//		} while (!exitFlag);
		
		//무한 Loop
		do {
			System.out.println("무한루프");
		}while(true);
	}

}
