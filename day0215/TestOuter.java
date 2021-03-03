package day0215;

/**
 * ����Ŭ������ �ν��Ͻ� ����ó�� ����� �� �ִ� inner class.<br>
 * Ư�� ������ ������ ��ü�ȿ��� �̺�Ʈ�� ó���Ҷ�.������ Ŭ���� �ϳ����� �ͼӵ� �̺�Ʈ�� ó���� ��)<br>
 * 
 * @author user
 */
public class TestOuter {
	int outI;

	public TestOuter() {
		System.out.println("�ٱ� Ŭ������ ������.");
	}

	public void outMethod() {
		System.out.println("�ٱ� Ŭ������ method : " + outI);
		//�ٱ�Ŭ���������� ���� Ŭ������ �ڿ��� ������� ����� �� ����.
//		inI=100;
//		inMethod();
		//�ٱ� Ŭ�������� ����Ŭ������ �ڿ��� ����Ϸ��� ��üȭ�� �ؾ��Ѵ�.
		//�ٱ�Ŭ������ ��ü���� this�� ��ü�� �� �ִ�.
		//this�� ��������. ��, �ٱ� Ŭ������ ��������.
		//this.Inner in = this.new Inner();
		Inner in = new Inner();
		
		in.inMethod();
		
		System.out.println("-----------------------------------------outMethod ��-----------------------------------------");
	}

	///////////////////////////// inner class ����////////////////////////////////

	public class Inner {
		int inI;

		public Inner() {
			System.out.println("���� Ŭ������ ������.");
		}

		public void inMethod() {
			System.out.println("���� Ŭ������ method : " + inI);
			// ���� Ŭ���������� �ٱ� Ŭ������ ������ method�� ����� �� �ִ�.
			System.out.println("�ٱ� Ŭ������ ���� : " + outI);
			
//			outMethod();
		}
	}

//	/////////////////////////inner class ��////////////////////////////////

	public static void main(String[] args) {
		// 1.�ٱ�Ŭ���� ��üȭ.
		TestOuter to = new TestOuter();// �ٱ� Ŭ������ ��üȭ �Ǿ��ٰ� ����Ŭ������ ��üȭ ���� �ʴ´�.
		// 2.����Ŭ���� ��üȭ : �ٱ�Ŭ������.����Ŭ������ ��ü�� = �ٱ�Ŭ���� ��ü��.new ����Ŭ���� ������();
		TestOuter.Inner ti = to.new Inner();
		
		// �ٱ�Ŭ������ ��ü�δ� ���� Ŭ������ �ڿ��� ����� �� ����.
//		to.inI
//		to.inMethod();
//		ti.outMethod();

		to.outMethod();
		ti.inMethod();
	}
}