package day0216;

import java.util.StringTokenizer;

/**
 * 문자열을 짧은 한 마디로 구분하는 StringTokenizer의 사용.
 * 
 * @author user
 */
public class UseStringTokenizer {

	public UseStringTokenizer() {
		String data = "자바 오라클 ㄴㅂㅂㅂㄸㅇ 앙냥냥 JDBC HTML";

		// 문자열을 공백으로 구분하여 자를 수 있는 객체 생성.
		StringTokenizer st = new StringTokenizer(data);

		System.out.println("토큰의 갯수 : " + st.countTokens());
		String token = "";
		while (st.hasMoreTokens()) {
			token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("토큰의 갯수 : " + st.countTokens());
	}

	public static void main(String[] args) {
//		new UseStringTokenizer();
		String names = "이학민 권예원 김다은 강인섭 송준희 김덕영 박기범";
		
		StringTokenizer st = new StringTokenizer(names);

		StkData[] sd = new StkData[st.countTokens()];

		for (int i = 0; i < sd.length; i++) {
			sd[i] = new StkData();
			sd[i].setName(st.nextToken());
		}

		for (StkData target : sd) {
			System.out.println(target.getName());
		}

	}

}