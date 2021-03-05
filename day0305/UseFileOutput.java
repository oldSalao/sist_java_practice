package day0305;

import java.io.File;
import java.io.FileOutputStream;
import java.io.IOException;

import javax.swing.JOptionPane;

/**
 * JVM 내부의 데이터를 JVM외부로 내보내기 위한 스트림.
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
			if (JOptionPane.showConfirmDialog(null, "덮어 쓰시겠습니까?") == JOptionPane.OK_OPTION) {
				overwriteFlag = true;
			}
		} else {
			overwriteFlag = true;
		}

		if (overwriteFlag) {
			try {
				// 1.스트림생성.
				fos = new FileOutputStream(file);
				// 2.스트림의 파일로 기록할 내용 작성.
				fos.write(66);
				// 3.스트림에 기록된 내용을 목적지로 분출.
				fos.flush();
			} finally {
				if (fos != null) {
					// 4.스트림 사용이 종료되었으면 연결을 끊는다.
					fos.close();
				}
			}
		} else {
			System.out.println("덮어쓰지 않습니다.");
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
