package day0304;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class Homework1 {

	public Homework1() {
		String dirInput = JOptionPane.showInputDialog(null, "폴더명을 입력하세요.");
		if (dirInput == null) {
			System.exit(0);
		}
		File dir = new File(dirInput);
		StringBuilder sb = new StringBuilder();

		if (dir.isFile()) {
			System.out.println("파일은 처리할 수 없습니다.");
		} else if (dir.isDirectory()) {
			JTextArea jta = new JTextArea();
			Date d = new Date(dir.lastModified());
			SimpleDateFormat sd = new SimpleDateFormat("YYYY-MM-dd aa HH:mm");
			File[] fileList_ = dir.listFiles();

			sb.append("이름\t마지막수정일\t\t유형\t크기\n")/*.append(dir.getName() + "\t" + sd.format(d) + "\t폴더\n")*/;
			for (File temp : fileList_) {
				String type = "파일";
				d = new Date(temp.lastModified());
				if (temp.isDirectory()) {
					type = "폴더";
				}
				sb.append(temp.getName() + "\t" + sd.format(d) + "\t" + type + "\t" + temp.length() + "byte\n");
				System.out.println();
			}

			jta.setText(sb.toString());
			JScrollPane jsp = new JScrollPane(jta);

			JOptionPane.showMessageDialog(null, jsp);
		} else {
			JOptionPane.showMessageDialog(null, "잘못된 입력입니다.");
		}
	}
}
