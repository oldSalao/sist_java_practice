package day0305;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 16bit stream을 사용한 파일에 문자열 기록.
 * 
 * @author user
 */
public class UseFileWriter {
	public UseFileWriter() throws IOException {
		File file = new File("C:\\dev\\temp1\\test.txt");
		BufferedWriter bw = null;
		try {
		bw = new BufferedWriter(new FileWriter(file));
		bw.write("택시비2만원");
//		bw.flush(); //flush 혹은 close 둘중 하나만 해도 된다. 하지만 둘다 쓰는게 제일 좋음.
		}finally {
			if(bw!=null) {
				bw.close();
			}
		}
	}

	public static void main(String[] args) {
		try {
			new UseFileWriter();
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
