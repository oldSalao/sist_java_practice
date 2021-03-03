package day0303;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 사용자에게 메뉴를 제공하고, 메뉴를 처리하는 코드 정의.<br>
 * 
 * @author user
 */
public class SelectMenu {
	private List<DataVO> dataList;// 사용자가 입력한 데이터를 저장할 목적의 JCF.

	public SelectMenu() {
		// 사용자가 입력한 데이터를 저장할 목적의 List를 생성.
		dataList = new ArrayList<DataVO>();
	}

	/**
	 * 사용자가 그만 둘때까지 제공할 메뉴.<br>
	 * 1. 데이터입력, 2. 데이터출력. 3.종료
	 */
	public void menu() {
		boolean exitFlag = false;// 메뉴를 빠져나가기 위한 변수.
		String inputMenu = null;
		do {
			inputMenu = JOptionPane.showInputDialog(null, "관리프로그램.메뉴의 번호를 입력해주세요.\n메뉴 1.입력, 2.출력, 3.종료");
			if (inputMenu == null) {// 입력메뉴에서 Dialog에서 x를 눌렀거나 cancel button을 눌렀을 때.
				exitFlag = closeApp();
				continue;
			} else if (inputMenu.equals("1") || inputMenu.equals("2") || inputMenu.equals("3")) {
				if (inputMenu.equals("1")) {
					inputData();
				}
				if (inputMenu.equals("2")) {
					printData();
				}
				if (inputMenu.equals("3")) {
					exitFlag = closeApp();
				}

			} else {
				JOptionPane.showMessageDialog(null, "메뉴는 1,2,3 중 하나만 입력해 주세요.");
			}

		} while (!exitFlag);
	}

	/**
	 * 이름과 나이를 CSV(comma separated value)형식의 데이터로 입력받아,dataList에 추가한다.
	 */
	public void inputData() {
		String csvData = JOptionPane.showInputDialog(null, "데이터입력\n입력예)이름,나이");
		String[] tempData = null;
		try {
			tempData = csvData.split(",");// x와 cancle 누를 시 NullpointerException 발생
			if (tempData.length == 2) {// 입력값의 형식 체크, 값을 넣지 않고 OK를 누르면 ""가 입력.
				String name = tempData[0];
				int age = Integer.parseInt(tempData[1]);// NumberFormatException

				dataList.add(new DataVO(name, age));

			} else {
				JOptionPane.showMessageDialog(null, "입력형식은 이름,나이의 형식이어야 합니다.");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "나이는 숫자로 입력해주세요");
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "정상적으로 종료해주세요.");
		}
	}

	/**
	 * 입력된 이름과 나이를 List에서 받아 JTextArea에 출력한다.<br>
	 * 번호(for인덱스 사용),이름,나이,태어난해.(날짜객체와 나이를 연산.)
	 */
	public void printData() {
		StringBuilder sbOutputData = new StringBuilder();// 출력데이터를 저장할 변수.
		DataVO dv = null;
		int nowYear = Calendar.getInstance().get(Calendar.YEAR);
		sbOutputData.append("번호\t이름\t나이\t태어난해\n").append("-----------------------------------------------------------------------------------------\n");
		if (dataList.isEmpty()) {
			sbOutputData.append("입력된 데이터가 존재하지 않습니다.");
		}
		for (int i = 0; i < dataList.size(); i++) {
			dv = dataList.get(i);
			sbOutputData.append(i + 1).append("\t").append(dv.getName()).append("\t").append(dv.getAge()).append("\t")
					.append(nowYear - dv.getAge() + 1).append("\n");
		}
		JTextArea jtaDataDisplay = new JTextArea(15,40);
		jtaDataDisplay.setText(sbOutputData.toString());//생성된 출력 데이터를 J,T,A에 추가.
		jtaDataDisplay.setEditable(false);//편집불가.
		JScrollPane jspDataDisplay = new JScrollPane(jtaDataDisplay);
		
		JOptionPane.showMessageDialog(null, jspDataDisplay);
	}

	/**
	 * 종료처리
	 */
	public boolean closeApp() {
		boolean flag = false;
		int selectExitBtn = JOptionPane.showConfirmDialog(null, "종료 하시겠습니까?");
		if (selectExitBtn == JOptionPane.OK_OPTION) {
			flag = true;
		}
//		switch(selectExitBtn) {
//		case JOptionPane.OK_OPTION:
//			flag = true;
//			break;
//		}
		return flag;
	}
}
