package day0129;

public class UseConstructer {

	public UseConstructer() {
		System.out.println("�⺻������");
		//�޼ҵ�� ���ǵ� ������ ������ �׳� ȣ�� ����.
		test();
		//������ �����ڴ� ������ ���Ƶ� �׳� ȣ���� �� ����. �� new�� ����ؾ��Ѵ�.
		new UseConstructer(45);
	}
	
	public UseConstructer(int i) {
		System.out.println("�Ű����� �ִ� ������. " + i);
	}
	
	public void test() {
		System.out.println("method");
	}
	
	public static void main(String[] args) {
		new UseConstructer();
		new UseConstructer(146);
//		UseConstructer uc = new UseConstructer();
//		uc.test();//������ �ٸ��� ��ü�� ����� ��ü�� ���ؼ� ȣ���ؾ��Ѵ�.
	}
}
