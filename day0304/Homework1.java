package day0304;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Homework1 {

	public Homework1() {
		String dirInput = JOptionPane.showInputDialog(null, "�������� �Է��ϼ���.");
		if (dirInput == null) {
			System.exit(0);
		}
		File dir = new File(dirInput);
		StringBuilder sb = new StringBuilder();

		if (dir.isFile()) {
			System.out.println("������ ó���� �� �����ϴ�.");
		} else if (dir.isDirectory()) {
			JTextArea jta = new JTextArea();
			Date d = new Date(dir.lastModified());
			SimpleDateFormat sd = new SimpleDateFormat("YYYY-MM-dd aa HH:mm");
			File[] fileList_ = dir.listFiles();

			sb.append("�̸�\t������������\t\t����\tũ��\n")/*.append(dir.getName() + "\t" + sd.format(d) + "\t����\n")*/;
			for (File temp : fileList_) {
				String type = "����";
				d = new Date(temp.lastModified());
				if (temp.isDirectory()) {
					type = "����";
				}
				sb.append(temp.getName() + "\t" + sd.format(d) + "\t" + type + "\t" + temp.length() + "byte\n");
				System.out.println();
			}

			jta.setText(sb.toString());
			JScrollPane jsp = new JScrollPane(jta);

			JOptionPane.showMessageDialog(null, jsp);
		} else {
			JOptionPane.showMessageDialog(null, "�߸��� �Է��Դϴ�.");
		}
	}
}
