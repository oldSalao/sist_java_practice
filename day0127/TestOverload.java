package day0127;

/**
 * Ŭ�������� ���� �̸��� method�� ������ ���� �� �ִ� Overload�� ���. ��Ģ)����������, ��ȯ���� �޶� �ǰ�,
 * method���� ���ƾ��ϰ� �Ű������� �ݵ�� �޶�� �Ѵ�.
 * 
 * @author user
 */
public class TestOverload {

	/**
	 * �� �Ѱ��� ����ϴ� method.
	 */
	public void printStar() {
		System.out.println("��");
	}

	/**
	 * �Է¹��� ����� ���� ����ϴ� method
	 * @param count ����� ���� ����.
	 */
	
//	public void printStar(int count) {
//		for (int i = 0; i < count; i++) {
//			System.out.print("��");
//		}
//		System.out.println();
//	}

	public void printStar(int c) {
		for (int i = 0; i < c; i++) {
			for(int j = 0; j < i+1; j++) {
				System.out.print("��");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public static void main(String[] args) {
		TestOverload to = new TestOverload();
		to.printStar();
		to.printStar(4);
	}
}
