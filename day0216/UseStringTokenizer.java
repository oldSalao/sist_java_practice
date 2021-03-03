package day0216;

import java.util.StringTokenizer;

/**
 * ���ڿ��� ª�� �� ����� �����ϴ� StringTokenizer�� ���.
 * 
 * @author user
 */
public class UseStringTokenizer {

	public UseStringTokenizer() {
		String data = "�ڹ� ����Ŭ ������������ �ӳɳ� JDBC HTML";

		// ���ڿ��� �������� �����Ͽ� �ڸ� �� �ִ� ��ü ����.
		StringTokenizer st = new StringTokenizer(data);

		System.out.println("��ū�� ���� : " + st.countTokens());
		String token = "";
		while (st.hasMoreTokens()) {
			token = st.nextToken();
			System.out.println(token);
		}
		System.out.println("��ū�� ���� : " + st.countTokens());
	}

	public static void main(String[] args) {
//		new UseStringTokenizer();
		String names = "���й� �ǿ��� ����� ���μ� ������ ����� �ڱ��";
		
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