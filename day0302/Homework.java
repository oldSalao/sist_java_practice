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
			menu = JOptionPane.showInputDialog(null, "메뉴를 선택해주세요.\n1.입력 2.출력 3.종료");
			if (menu==null) {
				System.out.println("종료를 원하시면 종료메뉴를 선택하세요.");
				continue;
			}
			try {
				menuNum = Integer.parseInt(menu);
			} catch (NumberFormatException e) {
				System.err.println("숫자를 입력하세요.");
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
				System.out.println("1과 3사이의 메뉴를 선택하세요");
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
		/////////////////////////////try,catch VS if 질문///////////////////////////////
		while (true) {
			info = JOptionPane.showInputDialog(null, "이름과 나이를 입력해주세요\n예)이하늘,26");
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
				System.err.println("잘못된 입력입니다.");
				continue;
			}
			try {
				infoList.add(new HomeworkVO(infoArr[0], Integer.parseInt(infoArr[1])));
			} catch (NumberFormatException e) {
				System.err.println("나이는 숫자로 입력하세요.");
				continue;
			}
			break;
		}
	}

	public void printData() {
		for (int i = 0; i < infoList.size(); i++) {
			System.out.println("번호 : " + (i + 1) + infoList.get(i));
		}
		infoList.clear();
	}

	public void closeApp() throws InterruptedException {
		int confirmNum = 0;

		confirmNum = JOptionPane.showConfirmDialog(null, "프로그램을 종료하시겠습니까?");
		/////////////////////////////////시간지연 필요한 이유 질문//////////////////////////////////
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
