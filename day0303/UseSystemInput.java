package day0303;

import java.io.IOException;

/**
 * 입력의 근원인 keyboard일때의 처리.
 * 
 * @author user
 */
public class UseSystemInput {

	public UseSystemInput() {
		super();
		System.out.println("아무키나 누르고 엔터를 치세요");
		//////////////////////// 처음 한글자 읽기////////////////////////////
//		try {
//		int keyValue = System.in.read();
//		System.out.println("입력한 값 : " + keyValue + ", 문자 : " + ((char)keyValue));//첫입력의 아스키코드만 출력됨.
//		}
//		catch(IOException e) {
//			System.err.println("키보드 입력 중 문제가 발생" + e);
//		}

		//////////////////////// 1byte로 구성된 여러 글자 읽기(한글 불가)/////////////////////////////
		try {
			while (true) {
				int keyValue = System.in.read();
				if (keyValue == 13) {
					break;
				} else {
					System.out.println("입력한 값 : " + keyValue + ", 문자 : " + ((char) keyValue));// 첫입력의 아스키코드만 출력됨.
				}
			}
		} catch (IOException e) {
			System.err.println("키보드 입력 중 문제가 발생" + e);
		}
	}

	public static void main(String[] args) {
		new UseSystemInput();
	}
}
