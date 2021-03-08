package day0305;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

/**
 * 16bit stream�� ����� ���Ͽ� ���ڿ� ���.
 * 
 * @author user
 */
public class UseFileWriter {
	public UseFileWriter() throws IOException {
		File file = new File("C:\\dev\\temp1\\test.txt");
		BufferedWriter bw = null;
		try {
		bw = new BufferedWriter(new FileWriter(file));
		bw.write("�ýú�2����");
//		bw.flush(); //flush Ȥ�� close ���� �ϳ��� �ص� �ȴ�. ������ �Ѵ� ���°� ���� ����.
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
