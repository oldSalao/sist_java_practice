package day0204;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Method Override (Overriding) ����.<br>
 * Override : �θ�Ŭ������ method�� �ڽ�Ŭ������ ��Ȳ�� ���� �ʴ´ٸ� �ڽ� Ŭ�������� �θ�Ŭ������ method�� ������
 * method�� �����Ͽ� ����ϴ� ��.
 * 
 * @author user
 */
public class OverrideSub extends OverrideSuper {

	public String toString() {
		return "�ּҰ� �Ⱦ��!";
	}

//	public String superMethod() { // ��ȯ���� �ٸ��� Override ��Ģ�� ����ǹǷ� Error �߻�.
//		System.out.println("�ڽ�Ŭ�������� ��ȯ!");
//		return "";
//	}

//	@Override
//	public void superMethod(int i) { //�Ű������� �����ϸ� method ȣ���� �ٸ��� �Ǳ� ������ Override�� �������� �ʴ´�.
//		System.out.println("�ڽ�Ŭ�������� ��ȯ!");
//	}

	@Override
	// �θ�:protected �ڽ�:public
	public void superMethod1() { // Override�� method���� ���������ڴ� ������ ���������ڷ� ���氡��.
		System.out.println("�ڽ�Ŭ�������� ��ȯ!");
	}

	/**
	 * ����õ�޼ҵ�(Deprecated) : ����ֵ��� �󶼿� �޶�...
	 * 
	 */
	@Deprecated
	public void test() {
		System.out.println("HDD");
	}

	public void temp() {
//		@SuppressWarnings("unused") // method ���̳� �������� ��밡��. ���� method ��ü, ���δ� �Ʒ� ���ٸ� ����.
		int i = 0;
		int j = 0;
		
		@SuppressWarnings({ "rawtypes", "unused" })
		List list = new ArrayList();
	}

	public static void main(String[] args) {
		OverrideSub os = new OverrideSub();
		System.out.println("-----------------------Object class�� toString() Override-----------------------");
		// Object Ŭ�������� �����ϴ� toString() ȣ��. ������ �ּҸ� ��ȯ������ Override�� ���� �ּҰ� �Ⱦ��! ���.
		System.out.println(os.toString());
//		System.out.println() �� instance�� �־� ����ϸ� �� �ȿ��� toString()�� ȣ��Ǿ� �ּҰ� ��µȴ�. ������ Override�� ���ؼ� �ּҰ� �Ⱦ��! ���.
		System.out.println(os);

		os.superMethod();
		os.superMethod1();
		System.out.println("--------------------------------------------------------------");

		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getYear() + 1900);

		os.test();
	}
}
