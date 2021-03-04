package day0304;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * HDD�� �����ϴ� File�� ������ ������� ���� Ŭ����<br>
 * @author user
 */
public class UseFile {
	
	public UseFile() throws IOException {
		File file = new File("C:\\dev\\temp\\java_read.txt");
		System.out.println("������ �����ϴ°�?" + file.exists());
		System.out.println("�Թ���� : " + file.getCanonicalPath());
		System.out.println("������ : " + file.getAbsolutePath());
		System.out.println("����� : " + file.getPath());
		System.out.println("������ �����ϴ� ������ : " + file.getParent());
		System.out.println("���ϸ� : " + file.getName());
		System.out.println("��������Ȯ��: " + file.isFile());
		System.out.println("��������Ȯ��: " + file.isDirectory());
		System.out.println("���� �������� Ȯ��: " + file.canExecute());
		System.out.println("���� �������� Ȯ��: " + file.isHidden());
		System.out.println("�б� �������� Ȯ��: " + file.canRead());
		System.out.println("���� �������� Ȯ��: " + file.canWrite());
		Date d = new Date(file.lastModified());
		SimpleDateFormat sdf = new SimpleDateFormat("YYYY MM dd HH:mm");
		System.out.println("���������� ������ ��¥ : "+sdf.format(d));
//		System.out.println("���ϻ���: " + file.delete());
		File mk = new File("C:\\test\\temp");
//		System.out.println("���� ����� " + mk.mkdir());//���������� ������ ������ ����.
		System.out.println("���� ������ ����� " + mk.mkdirs());//������������ ����� ��.
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
