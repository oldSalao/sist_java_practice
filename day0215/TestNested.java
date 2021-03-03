package day0215;

/**
 * ��øŬ����
 * 
 * @author user
 */
public class TestNested {
	int insI;
	static int staI;

	public TestNested() {
		System.out.println("�ٱ� Ŭ������ ������.");
	}// TestNested

	public void outInsMethod() {
		System.out.println("�ٱ�Ŭ������ instance method");
	}// outInsMethod

	public static void outStaMethod() {
		System.out.println("�ٱ�Ŭ������ static method");
	}// outStaMethod

	////////////////////////////////////// nested class
	////////////////////////////////////// ����///////////////////////////////////////

	public static class Nested {
		//class�� ���� �����ڸ� static���� ����ϳ� Ŭ���� ������ static���� ��������� �ʴ´�.
		static int inI;
		
		//�����ڸ� ���� �� ������ ��üȭ�Ͽ� ����� �������� ����� Ŭ������ �ƴϹǷ� �����ڸ� ������ �ʴ´�.
		
		//instance method�� ���� �� ������ ����� ��üȭ�Ͽ� ����ؾ� �ϹǷ� ������ �ʴ´�.
		
		public static void inMethod() {
			System.out.println("���� Ŭ������ method : " + inI);
			//����Ŭ������ method������ �ٱ� Ŭ������ �ڿ��� ���� ����� �� �ִ�.
			//������ static ������ �ڿ��̾���Ѵ�.
//			insI=100; // instance ������ ������ ��� �Ұ�.
			staI=100;
			System.out.println("�ٱ� Ŭ������ ���� : " + staI);
//			outInsMethod(); // instance ������ method ��� �Ұ�.
			outStaMethod();
		}
	}

	////////////////////////////////////// nested class
	////////////////////////////////////// ��///////////////////////////////////////////
	
	public static void main(String[] args) {
		//Ŭ���� �����ȿ� static Ŭ������ ������ �����Ͽ� ����� ����ϴ� ���̹Ƿ�, ��üȭ ���� Ŭ������.method������ ���.
		Nested.inMethod();
	}

}
