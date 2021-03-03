package day0217;

import java.util.StringTokenizer;

public class UseStringTokenizer {

	public UseStringTokenizer() {
		String csvData = "�⺻����,����.������,���~method,OOP,instance,source code,bytecode";
		//���ڿ� �����͸� ,�� ���ع��ڿ��� ����Ͽ� ��ū�� ����.
		//���ع��ڿ� ������ or ����� ������. (",~. " �� ���� �����ϸ� ��.)
		//StringTokenizer stk = new StringTokenizer(csvData,",",true);
		//�Ű����� 3���� �����ڸ� ����ϸ� ��ū�� �����ϴ� ���ڿ����� ��ū���� ����� ������ ���ð���.
		StringTokenizer stk = new StringTokenizer(csvData,",~. ");
		
		while(stk.hasMoreTokens()) {
			System.out.println(stk.nextToken());
		}
	}

	public static void main(String[] args) {
		new UseStringTokenizer();
	}
}
