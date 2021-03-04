package day0304;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 16bit 스트림을 사용하여 문자열 파일 읽기.(독자적인 포멧이 없는 단순 문자열만 읽어들여 확인할 수 있다.)<br>
 * 
 * @author user
 */
public class UseFileReader {

	private BufferedReader br;

	public UseFileReader() throws FileNotFoundException, IOException {
		String text = "";
		try {
			File file = new File("C:\\dev\\temp\\java_read.txt");
			// FileReader를 사용하면 한글이 깨짐
//			BufferedReader br = new BufferedReader(new FileReader(new File("C:\\dev\\temp\\java_read.txt")));
			// InputStreamReader과 FileInputStream을 사용해 Charset을 지정하면 한글이 깨지지 않는다.
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			while ((text = br.readLine()) != null) {
				System.out.println(text);
			}
		} finally {
			if (br != null) {// br이 null이라면 NullpointerException이 발생하므로 if 사용.
				br.close();// close()는 반드시 실행해야한다.
			}
		}
	}

	public static void main(String[] args) {
		try {
			new UseFileReader();
		} catch (FileNotFoundException e) {
			System.err.println("파일을 찾을 수 없습니다.");
		} catch (IOException e) {
			System.err.println("파일을 읽는 도중 문제 발생.");
		}
	}

}
