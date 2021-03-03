package day0215;

/**
 * method �ȿ� Ŭ������ �����ϴ� ����Ŭ����.
 * 
 * @author user
 */
public class TestLocal {
	int outI;

	public TestLocal() {
		System.out.println("�ٱ�Ŭ������ ������.");
	}// TestLocal

	// parameter�� final�� ���̸� method ���ο����� �������� ����, �Է��� �״�θ� ����ϰԵȴ�.
	public void methodA(int paramA, final int paramB) {
		int locA = 0;
		final int locB = 0;// public, static���� ���������� ���Ұ���. ������ final�� ����.
		// �Ű������� ���������� ���� ��� final�� �ٿ��� ������ ���� JDK ���������� �Ⱥٿ��� ��. ��� ������ �Ұ�.

		////////////////////////// ����Ŭ���� ����///////////////////////////
		class Local {
			int i;

			public Local() {
				System.out.println("����Ŭ������ ������.");
			}// Local

			public void locMethod() {
				System.out.println("����Ŭ������ method. ����Ŭ������ instance ���� : " + i);
				// paramA = 100;// final�� �ƴѵ��� ������ �Ұ�.
				// locA = 100;// final�� �ƴѵ��� ������ �Ұ�.
				System.out.println("method�� �Ű����� : " + paramA + ", " + paramB);
				System.out.println("method�� �������� : " + locA + ", final : " + locB);
			}// locMethod
		}
		////////////////////////// ����Ŭ���� ��///////////////////////////

		// ����Ŭ������ ��üȭ
		Local loc = new Local();
		loc.locMethod();// ����Ŭ������ method ȣ��.
	}// methodA

	public void methodB() {
		//�ܺ� method �ȿ����� ���� Ŭ������ ����� �� ����.
		//Ŭ������ �����ϴ� method�� ȣ���ϴ°��� ����.
	}
	public static void main(String[] args) {
		TestLocal tl = new TestLocal();
		tl.methodA(2021, 2);
	}
}