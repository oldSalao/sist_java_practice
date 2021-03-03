package day0303;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * ����ڿ��� �޴��� �����ϰ�, �޴��� ó���ϴ� �ڵ� ����.<br>
 * 
 * @author user
 */
public class SelectMenu {
	private List<DataVO> dataList;// ����ڰ� �Է��� �����͸� ������ ������ JCF.

	public SelectMenu() {
		// ����ڰ� �Է��� �����͸� ������ ������ List�� ����.
		dataList = new ArrayList<DataVO>();
	}

	/**
	 * ����ڰ� �׸� �Ѷ����� ������ �޴�.<br>
	 * 1. �������Է�, 2. ���������. 3.����
	 */
	public void menu() {
		boolean exitFlag = false;// �޴��� ���������� ���� ����.
		String inputMenu = null;
		do {
			inputMenu = JOptionPane.showInputDialog(null, "�������α׷�.�޴��� ��ȣ�� �Է����ּ���.\n�޴� 1.�Է�, 2.���, 3.����");
			if (inputMenu == null) {// �Է¸޴����� Dialog���� x�� �����ų� cancel button�� ������ ��.
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
				JOptionPane.showMessageDialog(null, "�޴��� 1,2,3 �� �ϳ��� �Է��� �ּ���.");
			}

		} while (!exitFlag);
	}

	/**
	 * �̸��� ���̸� CSV(comma separated value)������ �����ͷ� �Է¹޾�,dataList�� �߰��Ѵ�.
	 */
	public void inputData() {
		String csvData = JOptionPane.showInputDialog(null, "�������Է�\n�Է¿�)�̸�,����");
		String[] tempData = null;
		try {
			tempData = csvData.split(",");// x�� cancle ���� �� NullpointerException �߻�
			if (tempData.length == 2) {// �Է°��� ���� üũ, ���� ���� �ʰ� OK�� ������ ""�� �Է�.
				String name = tempData[0];
				int age = Integer.parseInt(tempData[1]);// NumberFormatException

				dataList.add(new DataVO(name, age));

			} else {
				JOptionPane.showMessageDialog(null, "�Է������� �̸�,������ �����̾�� �մϴ�.");
			}
		} catch (NumberFormatException e) {
			JOptionPane.showMessageDialog(null, "���̴� ���ڷ� �Է����ּ���");
		} catch (NullPointerException e) {
			JOptionPane.showMessageDialog(null, "���������� �������ּ���.");
		}
	}

	/**
	 * �Էµ� �̸��� ���̸� List���� �޾� JTextArea�� ����Ѵ�.<br>
	 * ��ȣ(for�ε��� ���),�̸�,����,�¾��.(��¥��ü�� ���̸� ����.)
	 */
	public void printData() {
		StringBuilder sbOutputData = new StringBuilder();// ��µ����͸� ������ ����.
		DataVO dv = null;
		int nowYear = Calendar.getInstance().get(Calendar.YEAR);
		sbOutputData.append("��ȣ\t�̸�\t����\t�¾��\n").append("-----------------------------------------------------------------------------------------\n");
		if (dataList.isEmpty()) {
			sbOutputData.append("�Էµ� �����Ͱ� �������� �ʽ��ϴ�.");
		}
		for (int i = 0; i < dataList.size(); i++) {
			dv = dataList.get(i);
			sbOutputData.append(i + 1).append("\t").append(dv.getName()).append("\t").append(dv.getAge()).append("\t")
					.append(nowYear - dv.getAge() + 1).append("\n");
		}
		JTextArea jtaDataDisplay = new JTextArea(15,40);
		jtaDataDisplay.setText(sbOutputData.toString());//������ ��� �����͸� J,T,A�� �߰�.
		jtaDataDisplay.setEditable(false);//�����Ұ�.
		JScrollPane jspDataDisplay = new JScrollPane(jtaDataDisplay);
		
		JOptionPane.showMessageDialog(null, jspDataDisplay);
	}

	/**
	 * ����ó��
	 */
	public boolean closeApp() {
		boolean flag = false;
		int selectExitBtn = JOptionPane.showConfirmDialog(null, "���� �Ͻðڽ��ϱ�?");
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
