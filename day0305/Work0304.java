package day0305;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

/**
 * 폴더를 입력했을 때 폴더안의 하위폴더와 파일 정보를 출력하는 프로그램
 * 
 * @author user
 */
public class Work0304 {

	/**
	 * 경로를 입력받아 경로내의 하위폴더, 파일을 File[]로 받아와서 반환하는 일.
	 * 
	 * @return
	 */
	public File[] setPath() {
		File[] fileArr = null;
		String path = JOptionPane.showInputDialog("경로를 입력하세요");

		if (path != null && !path.equals("")) {
			File file = new File(path);
			if (file.exists()) {
				if (file.isDirectory()) {
					fileArr = file.listFiles();
				} else {
					JOptionPane.showMessageDialog(null, "파일은 처리할 수 없습니다.");
				}
			} else {
				JOptionPane.showMessageDialog(null, "경로가 존재하지 않습니다. 경로를 확인해주세요.");
			}
		} else {
			JOptionPane.showMessageDialog(null, "경로를 입력해 주세요.");
		}

		return fileArr;
	}

	/**
	 * 매개변수로 선언된 File의 배열을 사용하여 출력하는 일.
	 * 
	 * @param contentFile
	 */
	public void printContent(File[] contentFile) {
		StringBuilder sbContent = new StringBuilder();
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd aa hh:mm");
		boolean fileFlag = false;
		sbContent.append("이름\t마지막수정일\t\t유형\t크기\n").append(
				"----------------------------------------------------------------------------------------------------------------------------\n");
		if (contentFile == null || contentFile.length == 0) {
			JOptionPane.showMessageDialog(null, "폴더에 하위 폴더나 파일이 존재하지 않습니다.");
		} else {
			for (File temp : contentFile) {
				fileFlag = temp.isFile();
				sbContent.append(temp.getName() + "\t" + sdf.format(new Date(temp.lastModified())) + "\t"
						+ (fileFlag ? "파일" : "폴더") + "\t");
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
