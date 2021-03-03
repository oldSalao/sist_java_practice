package day0302;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import javax.swing.JOptionPane;

public class Homework {
	public static final int INPUT = 1, PRINT = 2, END = 3;
	private List<HomeworkVO> infoList;
	boolean flag;

	public Homework() throws InterruptedException {
		infoList = new ArrayList<HomeworkVO>();
		String menu = null;
		int menuNum = 0;

		while (true) {
			menu = JOptionPane.showInputDialog(null, "�޴��� �������ּ���.\n1.�Է� 2.��� 3.����");
			if (menu==null) {
				System.out.println("���Ḧ ���Ͻø� ����޴��� �����ϼ���.");
				continue;
			}
			try {
				menuNum = Integer.parseInt(menu);
			} catch (NumberFormatException e) {
				System.err.println("���ڸ� �Է��ϼ���.");
				continue;
			}
			switch (menuNum) {
			case INPUT:
				inputData();
				break;
			case PRINT:
				printData();
				break;
			case END:
				closeApp();
				break;
			default:
				System.out.println("1�� 3������ �޴��� �����ϼ���");
				break;
			}
			if (flag) {
				break;
			}
		}
	}

	public void inputData() {
		String info = null;
		String[] infoArr = new String[2];
		StringTokenizer st = null;
		int len = 0;
		/////////////////////////////try,catch VS if ����///////////////////////////////
		while (true) {
			info = JOptionPane.showInputDialog(null, "�̸��� ���̸� �Է����ּ���\n��)���ϴ�,26");
			if(info==null) {
				break;
			}
			st = new StringTokenizer(info, ",");
			len = st.countTokens();
			try {
				for (int i = 0; i < len; i++) {
					infoArr[i] = st.nextToken();
				}
			} catch (ArrayIndexOutOfBoundsException e) {
				System.err.println("�߸��� �Է��Դϴ�.");
				continue;
			}
			try {
				infoList.add(new HomeworkVO(infoArr[0], Integer.parseInt(infoArr[1])));
			} catch (NumberFormatException e) {
				System.err.println("���̴� ���ڷ� �Է��ϼ���.");
				continue;
			}
			break;
		}
	}

	public void printData() {
		for (int i = 0; i < infoList.size(); i++) {
			System.out.println("��ȣ : " + (i + 1) + infoList.get(i));
		}
		infoList.clear();
	}

	public void closeApp() throws InterruptedException {
		int confirmNum = 0;

		confirmNum = JOptionPane.showConfirmDialog(null, "���α׷��� �����Ͻðڽ��ϱ�?");
		/////////////////////////////////�ð����� �ʿ��� ���� ����//////////////////////////////////
		switch (confirmNum) {
		case JOptionPane.OK_OPTION:
			Thread.sleep(10L);
			JOptionPane.getRootFrame().dispose();
			flag = true;
			break;
		case JOptionPane.NO_OPTION:
			break;
		case JOptionPane.CANCEL_OPTION:
			break;
		}
	}
}
