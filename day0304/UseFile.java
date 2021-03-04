package day0304;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * HDD에 존재하는 File의 정보를 얻기위해 만든 클래스<br>
 * @author user
 */
public class UseFile {
	
	public UseFile() throws IOException {
		File file = new File("C:\\dev\\temp\\java_read.txt");
		System.out.println("파일이 존재하는가?" + file.exists());
		System.out.println("규범경로 : " + file.getCanonicalPath());
		System.out.println("절대경로 : " + file.getAbsolutePath());
		System.out.println("상대경로 : " + file.getPath());
		System.out.println("파일이 존재하는 폴더명 : " + file.getParent());
		System.out.println("파일명 : " + file.getName());
		System.out.println("파일인지확인: " + file.isFile());
		System.out.println("폴더인지확인: " + file.isDirectory());
		System.out.println("실행 가능한지 확인: " + file.canExecute());
		System.out.println("숨김 파일인지 확인: " + file.isHidden());
		System.out.println("읽기 가능한지 확인: " + file.canRead());
		System.out.println("쓰기 가능한지 확인: " + file.canWrite());
		Date d = new Date(file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY MM dd HH:mm");
		System.out.println("마지막으로 수정된 날짜 : "+sdf.format(d));
//		System.out.println("파일삭제: " + file.delete());
		File mk = new File("C:\\test\\temp");
//		System.out.println("폴더 만들기 " + mk.mkdir());//하위폴더가 있으면 만들지 못함.
		System.out.println("폴더 여러개 만들기 " + mk.mkdirs());//하위폴더까지 만들어 줌.
	}
	public static void main(String[] args) {
		try {
		new UseFile();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
	}
}
