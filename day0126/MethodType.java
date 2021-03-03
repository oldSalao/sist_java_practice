package day0126;

/**
 * method�� 4���� ����.
 * 
 * @author user
 */
public class MethodType {

	/**
	 * �������� ��. ��ȯ��x,�Ű�����x
	 */
	public void typeA() {
		System.out.println("�������� ��.");
	}

	
	/**
	 * �������� ��. ��ȯ�� ����, �Ű����� �ִ� ��.
	 * 
	 * @param num
	 */
	public void typeB(int num) {
		System.out.println("�������� ��. i = " + num);
	}

	
	/**
	 * ������. ��ȯ�� �ְ�, �Ű�����x
	 * @return
	 */
	public int typeC() {
		return 2021;
	}
	
	/**
	 * ������. ��ȯ�� �ְ�, �Ű����� ����.
	 * @param num
	 * @return
	 */
	public int typeD(int num) {
		long l = num * 2L;
		
		if(l>Integer.MAX_VALUE) {
			l = Integer.MAX_VALUE;
		}
		
		return ((int)l);
	}

	
	public static void main(String[] args) {
		int temp = 0;
		// ��üȭ
		MethodType mt = new MethodType();
		// method ȣ��.
		for (int i = 0; i < 10; i++) {
			mt.typeA(); // �������� ��. ��� ȣ���ϵ� ���� ����� ���´�.
			mt.typeB(i); // �������� ��. �Է� ����� ���� �ٸ� ����� ���´�.
			temp = mt.typeC()*3;
			System.out.println("������ : " + mt.typeC() + ",  ���� �� : " + temp); // ������. �׻� ������ ����� ��ȯ�Ѵ�.
		}
		temp = mt.typeD((2147483647/2)+2);//������. �Է°��� ���� �ٸ������ ��ȯ�ȴ�.
		System.out.println(temp);
	}
}
