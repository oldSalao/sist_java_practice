package day0122;

/**
 * switch - case �� break���<br/>
 * break�� ������ switch ���� ����������.
 * 
 * @author user
 */
public class TestSwitchCase2 {

	public static void main(String[] args) {
		int i = 0;

		switch (i) {
		case 0: System.out.println("��"); break;
		case 1: System.out.println("��"); 
		case 2: System.out.println("��"); break;
		case 3: System.out.println("��"); break;
		default : System.out.println("����"); break;
		}
	}

}
