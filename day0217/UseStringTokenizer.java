package day0217;

import java.util.StringTokenizer;

public class UseStringTokenizer {

	public UseStringTokenizer() {
		String csvData = "기본문법,변수.연산자,제어문~method,OOP,instance,source code,bytecode";
		//문자열 데이터를 ,를 기준문자열로 사용하여 토큰을 구분.
		//기준문자열 설정은 or 기능을 가진다. (",~. " 와 같이 열거하면 됨.)
		//StringTokenizer stk = new StringTokenizer(csvData,",",true);
		//매개변수 3개인 생성자를 사용하면 토큰을 구분하는 문자열까지 토큰으로 취급할 것인지 선택가능.
		StringTokenizer stk = new StringTokenizer(csvData,",~. ");
		
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
	}

	public static void main(String[] args) {
		new UseStringTokenizer();
	}
}
