package day0122;

/**
 * ��ġ�ϴ� ������ ���� �� ����ϴ� switch - case��.<br/>
 * ����)<br/>
 * 	switch (������){ case ��� : ���๮��; <br/>
 * 		case ��� : ���๮��; <br/>
 * 		case ��� : ���๮��; <br/>
 * 		case ��� : ���๮��; <br/>
 * 		default : ���๮��; <br/>
 * 	}
 * 
 * @author user
 */
public class TestSwitchCase {
	public static void main(String[] args) {
		int i = 2; // byte,short,int,char (long�� switch�� ���Ұ�.)

//		switch (i) {//������ ������ ������ ��� �� �� �ִ�.
//		case 0:
//			System.out.println("ZERO");
//		case 1:
//			System.out.println("ONE");
//		case 2:
//			System.out.println("TWO");
//		default:
//			System.out.println("��ġ�ϴ� ��� ����.");
//		}
		
//		// case�� ����� �ԷµǴ� ���������� ���������� ����� �� �ִ�
//		//Int�� i�� 2147483648 ��� �Ұ���.
//		switch (i) {
//		case 2147483648L:
//			System.out.println("ZERO");
//		case 1 :
//			System.out.println("ONE");
//		case 2:
//			System.out.println("TWO");
//		default:
//			System.out.println("��ġ�ϴ� ��� ����.");
//		}
		
//		///////////////////////char��//////////////////////////
//		char c = 'A'; // char�� �ԷµǴ� ���ڿ� �����ϴ� Unicode ���� ����.
//		switch (c) {
//		case 65:
//			System.out.println("A");
//		case 'B' :
//			System.out.println("B");
//		case 'C':
//			System.out.println("C");
//		default:
//			System.out.println("��ġ�ϴ� ��� ����.");
//		}
		
		
		///////////////////////String//////////////////////////
		String s = "Oracle" ; // JavaSE 7 ���� ����.
		switch (s) {
		case "Java":
			System.out.println("�Ϻ��� OOP���");
			break;
		case "Oracle" :
			System.out.println("��뷮 �����ͺ��̽�");
			break;//break�� ����Ǹ� �Ʒ����� �ڵ带 �������� �ʰ� switch�� ����������.
		case "HTML":
			System.out.println("��ũ�� ���");
			break;
		default:
			System.out.println("��ġ�ϴ� ��� ����.");
			break;
		}
		
	}
}
