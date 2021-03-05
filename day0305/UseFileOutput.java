package day0305;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * JVM ������ �����͸� JVM�ܺη� �������� ���� ��Ʈ��.
 * 
 * @author user
 */
public class UseFileOutput {

	private FileOutputStream fos;

	public UseFileOutput() throws IOException {
		File dir = new File("C:\\dev\\temp1");
		if (!dir.exists()) {
			dir.mkdirs();
		}
		File file = new File(dir.getAbsolutePath() + "\\write_test2.txt");
		boolean overwriteFlag = false;
		if (file.exists()) {
			if (JOptionPane.showConfirmDialog(null, "���� ���ðڽ��ϱ�?") == JOptionPane.OK_OPTION) {
				overwriteFlag = true;
			}
		} else {
			overwriteFlag = true;
		}

		if (overwriteFlag) {
			try {
				// 1.��Ʈ������.
				fos = new FileOutputStream(file);
				// 2.��Ʈ���� ���Ϸ� ����� ���� �ۼ�.
				fos.write(66);
				// 3.��Ʈ���� ��ϵ� ������ �������� ����.
				fos.flush();
			} finally {
				if (fos != null) {
					// 4.��Ʈ�� ����� ����Ǿ����� ������ ���´�.
					fos.close();
				}
			}
		} else {
			System.out.println("����� �ʽ��ϴ�.");
		}
	}

	public static void main(String[] args) {
		try {
			new UseFileOutput();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
