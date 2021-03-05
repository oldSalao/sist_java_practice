package day0305;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Object Stream�� ����Ͽ� ��ü�� JVM �ܺη� �������ų�,(ObjectOutputStream - marshaling)<br>
 * JVM�ܺο� �����ϴ� ��ü�� JVM ���η� �о���̱� ���� ��(ObjectInputStream - unmarshaling)
 * 
 * @author user
 */
public class UseMarshalStream {

	public UseMarshalStream() {
	}

	/**
	 * ��ü�� �����Ͽ� ��Ʈ������ ��������
	 */
	public void useObjectOutputStream() throws FileNotFoundException, NotSerializableException, IOException {
		// IOExeption�� ���� Exception�̱� ������ IOException�� throws ���൵ ��.
		MyData md = new MyData("���ϴ�", 185, 89.5);
		ObjectOutputStream oos = null;
		try {
			// 1.��Ʈ�� ����
			oos = new ObjectOutputStream(new FileOutputStream("C:\\dev\\temp1\\obj.dat"));
			// 2.��ü�� ��Ʈ���� ����.
			oos.writeObject(md);
			// 3.��Ʈ���� ��ϵ� ������ �������� ����.
			oos.flush();
			System.out.println("��ü�� JVM�ܺη� ������.");
		} finally {
			if (oos != null) {
				oos.close();
			}
		}
	}

	/**
	 * ��Ʈ���� ����Ͽ� ��ü�� �о���̱�.
	 */
	public void useObjectInputStream()
			throws FileNotFoundException, NotSerializableException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;

		try {
			// 1.��ü�� �о���� �� �ִ� ��Ʈ�� ����
			ois = new ObjectInputStream(new FileInputStream("C:\\dev\\temp1\\obj.dat"));
			// 2.��ü �б�
			MyData md = (MyData) ois.readObject();
			System.out.println(md);
		} finally {
			if (ois != null) {
				ois.close();
			}
		}

	}

	public static void main(String[] args) {
		UseMarshalStream ums = new UseMarshalStream();
		try {
//			ums.useObjectOutputStream();
			ums.useObjectInputStream();
		} catch (NotSerializableException e) {
			System.err.println("����ȭ �ȵ�.");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.err.println("��ΰ� �߸���.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("Ŭ������ ã�� �� ����.");
			e.printStackTrace();
		}catch (IOException e) {
			System.err.println("���� ���߿� ���� �߻�.");
			e.printStackTrace();
		}
	}

}
