package day0215;

/**
 * �������̽� : ���� ����� ������ ������ ���ؼ� ���.<br>
 * �Ǵ�, ������� �������� ��ü���� �������� ���̱� ���ؼ� ���.<br>
 * 
 * @author user
 */
public interface TestInter {
//	int i; // ��ü�� ũ�⿡ ������ �ִ� �ν��Ͻ� ������ ���� �� ����. 
	public static final int I = 100; // ��� �ۼ� ����.

//	public TestInter() {} // ��ü�� ������ �� ���� ���� �� �ִ� �����ڸ� ���� �� ����.

//	public void test() {} // ���� �� �� �ִ� �Ϲ� �޼ҵ带 ���� �� ����.

	// �������̽����� abstract�� ������ �������� �����ϻ� ���� �߻�޼ҵ��̴�.

//	abstract�� �� abstract method. 
	public abstract void methodA();

//	abstract�� �������� abstract method.
	public void methodB();
	
	//default method : body�� �ִ� method.
	
	public default void methodC(int i) {
		System.out.println("default method ȣ��. i : "+i);
	}
	
}// interface
