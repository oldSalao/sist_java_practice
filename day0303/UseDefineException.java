package day0303;

import java.util.Random;

public class UseDefineException {

	/**
	 * ��踦 �ǿ�� ���� �����ϸ� ���� ����.
	 * 
	 * @return
	 */
	public String kibum() throws TobacoException {
		String result = null;
		String[] stuGrade = { "�ʵ�", "�ߵ�", "���", "���" };
		String temp = stuGrade[new Random().nextInt(stuGrade.length)];

		if (temp.equals("�ʵ�")) {// ���ڰ� �ʵ��̶�� ���ܸ� �߻�.
			throw new TobacoException("�ʵ��� �ݿ� ��!");
		}

		result = temp + "���� �� ��. ��ô ��������.('')";

		return result;
	}

	public void callKibum() {
		try {
			System.out.println(kibum());
		} catch (TobacoException e) {//�߻��� ���ܸ� ��Ȯ�ϰ� �����Ͽ� ó���� �� �ִ�.
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		UseDefineException ude = new UseDefineException();
		ude.callKibum();
	}
}
