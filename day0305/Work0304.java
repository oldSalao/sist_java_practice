package day0305;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * ������ �Է����� �� �������� ���������� ���� ������ ����ϴ� ���α׷�
 * 
 * @author user
 */
public class Work0304 {

	/**
	 * ��θ� �Է¹޾� ��γ��� ��������, ������ File[]�� �޾ƿͼ� ��ȯ�ϴ� ��.
	 * 
	 * @return
	 */
	public File[] setPath() {
		File[] fileArr = null;
		String path = JOptionPane.showInputDialog("��θ� �Է��ϼ���");

		if (path != null && !path.equals("")) {
			File file = new File(path);
			if (file.exists()) {
				if (file.isDirectory()) {
					fileArr = file.listFiles();
				} else {
					JOptionPane.showMessageDialog(null, "������ ó���� �� �����ϴ�.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "��ΰ� �������� �ʽ��ϴ�. ��θ� Ȯ�����ּ���.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "��θ� �Է��� �ּ���.");
		}

		return fileArr;
	}

	/**
	 * �Ű������� ����� File�� �迭�� ����Ͽ� ����ϴ� ��.
	 * 
	 * @param contentFile
	 */
	public void printContent(File[] contentFile) {
		StringBuilder sbContent = new StringBuilder();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd aa hh:mm");
		boolean fileFlag = false;
		sbContent.append("�̸�\t������������\t\t����\tũ��\n").append(
				"----------------------------------------------------------------------------------------------------------------------------\n");
		if (contentFile == null || contentFile.length == 0) {
			JOptionPane.showMessageDialog(null, "������ ���� ������ ������ �������� �ʽ��ϴ�.");
		} else {
			for (File temp : contentFile) {
				fileFlag = temp.isFile();
				sbContent.append(temp.getName() + "\t" + sdf.format(new Date(temp.lastModified())) + "\t"
						+ (fileFlag ? "����" : "����") + "\t");
				if (fileFlag) {
					sbContent.append(temp.length() + "byte");
				}
				sbContent.append("\n");
			}
		}
		JTextArea jtaContent = new JTextArea(sbContent.toString(), 15, 80);
		jtaContent.setEditable(false);
		JScrollPane jsp = new JScrollPane(jtaContent);
		JOptionPane.showMessageDialog(null, jsp);
	}

	public static void main(String[] args) {
		Work0304 work = new Work0304();
		work.printContent(work.setPath());
	}
}
