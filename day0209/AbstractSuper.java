package day0209;

/**
 * ��� ���迡�� �θ� Ŭ������ ������ ��.
 * @author user
 */
public abstract class AbstractSuper {
	int i;

	public AbstractSuper() {
		System.out.println("�߻�Ŭ������ �⺻������");
	}
	
	public void instanceMethod() {
		System.out.println("�Ϲ� method");
	}
	
	/////////////////////////////////�߻� Ŭ����///////////////////////////////////////////
	public abstract void typeA();
	public abstract void typeB(String msg);
	public abstract int typeC();
	public abstract int typeD(String msh);
	
	public static void main(String[] args) {
//		new AbstractSuper();// �߻� Ŭ������ ���� ��üȭ �� �� ����.
	}
}
