package day0303;

import java.io.IOException;

/**
 * �Է��� �ٿ��� keyboard�϶��� ó��.
 * 
 * @author user
 */
public class UseSystemInput {

	public UseSystemInput() {
		super();
		System.out.println("�ƹ�Ű�� ������ ���͸� ġ����");
		//////////////////////// ó�� �ѱ��� �б�////////////////////////////
//		try {
//		int keyValue = System.in.read();
//		System.out.println("�Է��� �� : " + keyValue + ", ���� : " + ((char)keyValue));//ù�Է��� �ƽ�Ű�ڵ常 ��µ�.
//		}
//		catch(IOException e) {
//			System.err.println("Ű���� �Է� �� ������ �߻�" + e);
//		}

		//////////////////////// 1byte�� ������ ���� ���� �б�(�ѱ� �Ұ�)/////////////////////////////
		try {
			while (true) {
				int keyValue = System.in.read();
				if (keyValue == 13) {
					break;
				} else {
					System.out.println("�Է��� �� : " + keyValue + ", ���� : " + ((char) keyValue));// ù�Է��� �ƽ�Ű�ڵ常 ��µ�.
				}
			}
		} catch (IOException e) {
			System.err.println("Ű���� �Է� �� ������ �߻�" + e);
		}
	}

	public static void main(String[] args) {
		new UseSystemInput();
	}
}
