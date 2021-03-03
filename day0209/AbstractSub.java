package day0209;

/**
 * �߻�Ŭ������ �ڽ�Ŭ���� �ݵ�� �θ�Ŭ������ �߻�޼ҵ�(abstract method)�� ��� �����ؾ��Ѵ�.
 * 
 * @author user
 */
public class AbstractSub extends AbstractSuper {

	public AbstractSub() {
		System.out.println("�ڽ� Ŭ������ ������.");
	}

	// abstract method ���� (Override).
	@Override
	public void typeA() {
		System.out.println("���� �� : ��ȯ�� ����, �Ű����� ���� ��.");
	}

	@Override
	public void typeB(String msg) {
//		instanceMethod();// �θ�Ŭ������ �Ϲ� method
//		super.typeA(); // �߻�޼ҵ�� ����ȣ�� �Ұ�.
		System.out.println("���� �� : ��ȯ�� ����, �Ű����� �ִ� ��.");
	}

	@Override
	public int typeC() { // ���� �� : ��ȯ�� �ְ�, �Ű����� ���� ��.
		return 0;
	}

	@Override
	public int typeD(String m) { // ���� �� : ��ȯ�� �ְ�, �Ű����� �ִ� ��.
		return m.length();

	}

	public static void main(String[] args) {
		AbstractSub as = new AbstractSub();
		as.typeB("���� ��");
	}

}