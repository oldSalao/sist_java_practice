package day0208;

/**
 * ParentSuper�� �ڽ� Ŭ����
 * @author user
 */
public class ChildSub extends ParentSuper{
	
	int i; // �θ�Ŭ������ ���� �̸��� ���� ����.
	int j; // �ڽ� Ŭ������ ������ �ִ� �̸��� ����.
	
	public void print() {
		super.i=100; // �̸��� ���� ������ this�� super�� ����.
		k=50; // this.k=50; super.k=50;
		System.out.println("�ڽ� i : " + i + ", j : " + j);
//		System.out.println("�θ� i : " + super.i + ", k : " + this.k);
		super.print();
	}
	
	public static void main(String[] args) {
		ChildSub cs = new ChildSub();
		cs.print();
	}
}
