package day0126;

/**
 * method �ۼ� ����.<br>
 * method�� ���� �� instance variable�� ����Ͽ� ��ó���� �ϴ� ���.<br>
 * => instance method �ۼ�.<br>
 * method�� ���� �� instance variable�� ������� �ʰ� ��ó���� �ϴ� ���.<br>
 * => static method �ۼ�.<br>
 * @author user
 */
public class UseMethod {
	
	int i;//instance variable
	
	/**
	 * instance method
	 */
	public void instanceMethod() {
		System.out.println("instance method : i�� ��� " + i);
	}
	
	/**
	 * static method
	 */
	public static void staticMethod(int param) {
		System.out.println("static method : i ��� �Ұ���, �Ķ���� ��� " + param);
	}
	
	
	
	public static void main(String[] args) {
		//instance method ȣ��.
		//instanceMethod(); //���� ȣ�� �Ұ�.
		UseMethod um = new UseMethod();
		um.i = 100;
		//instance method ȣ��
		um.instanceMethod();
		//static method ȣ��
		UseMethod.staticMethod(5);
		
	}

}
