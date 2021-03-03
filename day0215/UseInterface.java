package day0215;

/**
 * �������̽��� ����ϱ� ���� Ŭ����.<br>
 * �������̽��� Ŭ������ ����(implements)�Ͽ� ����� �� �ִ�.<br>
 * @author user
 */
public class UseInterface implements TestInter{

	public UseInterface(){
		System.out.println("�������̽��� ������ Ŭ������ ��ü ����.");
	}
	
//	���� �������̽��� �߻� method�� �ݵ�� Override �ؾ��Ѵ�.
	@Override
	public void methodA() {
		System.out.println("method A");
	}

	@Override
	public void methodB() {
		System.out.println("�������̵��ϴ� method�� ���������ڴ� ������ ���������ڷ� �޶����� �ǰ�, ��ȯ��, method��, �Ű������� ���� �����.");
	}
	
	@Override
	public void methodC(int i) {
		System.out.println("Default method�� Override. i : " + i);
	}
	
	public static void main(String[] args) {
		//�������̽��� ���� ��üȭ�� �� �� ����.
//		TestInter ti = new TestInter;
		//����Ŭ������ �ּҸ� ������ �� �ִ�.(��ü ������)
		TestInter ui = new UseInterface();
		ui.methodA();// ���� Ŭ������ method�� ȣ��ȴ�. (Overriding �߱� �����̴�.)
		ui.methodB();// ���� Ŭ������ method�� ȣ��ȴ�. (Overriding �߱� �����̴�.)
		ui.methodC(5);// Override �� default method ȣ��.
	}
}
