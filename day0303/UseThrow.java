package day0303;

import java.util.Random;

/**
 * ���� �����߻�.
 * 
 * @author user
 */
public class UseThrow {
	/**
	 * �߻��� ���ܴ� ��κ��� ������ ó���Ѵ�.
	 * ������ ���ܴ� �߻��� ���ܴ� �״�� ������ �ǰ�, �θ� ����ó�� Ŭ������ ������ �ȴ�.
	 * @throws Exception
	 */
	public void useThrow() throws Exception {
		System.out.println("���� �߻���.");
		if (new Random().nextBoolean()) {
			throw new Exception("���ܸ� �����Ͽ���!");
		}
		System.out.println("���� �߻���.");
	}

	public void callUseThrow(){
		try {
		useThrow();
		}
		catch(Exception e) {//throws�� ����ó��Ŭ������ �״�� �ᵵ �ǰ�, �θ𿹿�ó�� Ŭ������ �ᵵ �ȴ�.
			System.err.println("�����߻�.");
		}
	}

	public static void main(String[] args) {
		UseThrow ut = new UseThrow();
//		try {
			ut.callUseThrow();
			ut.callUseThrow();
			ut.callUseThrow();
//		} catch (Exception e) {
//			System.err.println("�����߻�");
//		}
	}
}
