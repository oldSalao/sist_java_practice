package day0304;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;

/**
 * 8bit Stream�� ����Ͽ� ������ �����б�.(�ѱ۱��� - ������ �����ϸ� ������ �ʴ´�.)<br>
 * 
 * @author user
 */
public class UseFileInputStream {
	public UseFileInputStream() {
		File file = new File("C:\\dev\\temp\\java_read.txt");
		int data = 0;

		try {
			if (file.exists()) {// ������ �����Ѵٸ�
				FileInputStream fis = new FileInputStream(file); // ���Ͽ� ��Ʈ���� �����ϰ�
				data = fis.read();// ó�� ���ڸ� �о���δ�.
				while ((data = fis.read()) != -1) {
					System.out.print((char) data);// 1byte�� �о���� ������ ���.���ڳ� ����� 1byte�̱� ������
					// 1byte�� �о�鿩 ����ϸ� ������ ������, �ѱ��� �ּ� 2byte�� �������� ���ڰ� ��������� ������
					// 1byte�� �о�鿩 ����ϸ� ������.
				}
				// ��Ʈ�� ����� �����ٸ� ��Ʈ���� ��� �޸� Ȯ��.
				fis.close();
			} else {
				System.out.println(file + "�� ��θ� Ȯ�����ּ���.");
			}
		} catch (IOException e) {
			System.err.println("������ �д� ���� ������ �߻�.");
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		new UseFileInputStream();
	}

}
