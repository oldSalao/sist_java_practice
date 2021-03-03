package day0215;

/**
 * �͸�Ŭ������ ���.
 * @author user
 */

public class UseAnonymous {

	public void useSuperInterA(SuperInterA sia) {
		sia.methodA();
//		sia.test(); //sia�� �������̽� �̹Ƿ� Override�� �ƴ� ���� ������ ����� �� ����.
		//���� �������� Override�� methodA�� ���ؼ� ȣ���Ѵ�.
	}

	public void useSuperInterB(SuperInterB sib) {
		sib.methodA();
		sib.methodB();
	}
	
	public static void main(String[] args) {
		UseAnonymous ua = new UseAnonymous();
		ua.useSuperInterA(new SuperInterA() {
			@Override
			public void methodA() {
				System.out.println("�͸� Ŭ������ Override�Ͽ� ������ method");
				test();
			}

			// Ŭ������ �̸��� �����Ƿ� �����ڸ� ������ �� ����.

			// ���ǵ� method�� anonymous inner class �ȿ����� ȣ��� �� �ִ�.
			public void test() {
				System.out.println("�͸� Ŭ�������� ������ method");
			}
		});
		ua.useSuperInterB(new SuperInterB() {
			@Override
			public void methodA() {
				System.out.println("�͸� Ŭ������ Override�Ͽ� ������ method");
			}
			
			@Override
			public void methodB() {
				System.out.println("�͸� Ŭ������ Override�Ͽ� ������ method");
			}
		});
	}

}
