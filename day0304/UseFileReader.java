package day0304;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
//import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * 16bit ��Ʈ���� ����Ͽ� ���ڿ� ���� �б�.(�������� ������ ���� �ܼ� ���ڿ��� �о�鿩 Ȯ���� �� �ִ�.)<br>
 * 
 * @author user
 */
public class UseFileReader {

	private BufferedReader br;

	public UseFileReader() throws FileNotFoundException, IOException {
		String text = "";
		try {
			File file = new File("C:\\dev\\temp\\java_read.txt");
			// FileReader�� ����ϸ� �ѱ��� ����
//			BufferedReader br = new BufferedReader(new FileReader(new File("C:\\dev\\temp\\java_read.txt")));
			// InputStreamReader�� FileInputStream�� ����� Charset�� �����ϸ� �ѱ��� ������ �ʴ´�.
			BufferedReader br = new BufferedReader(new InputStreamReader(new FileInputStream(file), "UTF-8"));
			while ((text = br.readLine()) != null) {
				System.out.println(text);
			}
		} finally {
			if (br != null) {// br�� null�̶�� NullpointerException�� �߻��ϹǷ� if ���.
				br.close();// close()�� �ݵ�� �����ؾ��Ѵ�.
			}
		}
	}

	public static void main(String[] args) {
		try {
			new UseFileReader();
		} catch (FileNotFoundException e) {
			System.err.println("������ ã�� �� �����ϴ�.");
		} catch (IOException e) {
			System.err.println("������ �д� ���� ���� �߻�.");
		}
	}

}
