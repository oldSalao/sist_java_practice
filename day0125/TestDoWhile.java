package day0125;

import javax.swing.JOptionPane;

/**
 * do~while <br>
 * ���۰� ���� �𸦶� ����ϴ� �ݺ���<br>
 * �ּ� 1�� ����, �ִ� ���Ǳ��� ����. <br>
 * 
 * @author user
 */
public class TestDoWhile {

	public static void main(String[] args) {

		int i = 0;// �ʱⰪ
		do {
			System.out.println("�ȳ��ϼ���?"); // �ݺ����� ����.
			i++;// �����ҽ�
		} while (i < 10);

		// Do-while�� �޴��� ������ �� �ִ�.
//		boolean exitFlag = false;
//		do {
//			String menu = JOptionPane.showInputDialog("�޴�����\n1.�Է� 2.��� 3.���� 4.����");
//			if (menu.equals("4")) {
//				exitFlag = true;
//			}
//		} while (!exitFlag);
		
		//���� Loop
		do {
			System.out.println("���ѷ���");
		}while(true);
	}

}
