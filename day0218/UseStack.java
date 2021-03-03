package day0218;

import java.util.Stack;

/**
 * Stack�� Vetor�� �ڽ� Ŭ������ MultiThread���� ���������� �Ұ���. 
 * LIFO
 * @author user
 */
public class UseStack {
	
	public UseStack() {
		//1.����
		Stack<String> stk = new Stack<String>();
		
		//2.��(item)�ֱ�.
		stk.push("�ϼ���?");
		stk.push("�ȳ�");
		stk.push("���õ�");
		
		System.out.println(stk);
		
		//3.�� ���
//		System.out.println(stk.pop());
//		System.out.println(stk.pop());
//		System.out.println(stk.pop());
//		
//		System.out.println(stk);
		
		while(!stk.empty()) {
			System.out.println(stk.pop());
		}
	}
	
	public static void main(String[] args) {
		new UseStack();
	}

}
