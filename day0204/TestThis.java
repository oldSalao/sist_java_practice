package day0204;

/**
 * this Ű���� ������ ���
 * @author user
 */
public class TestThis {
	private int i;
	
	public void useInstance(TestThis tt) {
		System.out.println("�޼ҵ带 ȣ���� ��ü�� �ּ� : " + tt);
	}
	
	public void useInstanceVariable(int i,TestThis tt) {
		System.out.println(i);
	}
	
	public void useInstanceVariable(int i) {
		this.i = i;
		System.out.println(this.i);
	}
	
	public static void main(String[] args) {
		TestThis tt1 = new TestThis();
		TestThis tt2 = new TestThis();
		System.out.println("tt1 instance�� �ּ� : " + tt1);
		System.out.println("tt1 instance�� �ּ� : " + tt2);
		System.out.println("-----------------------��ü�ּ�-------------------------");
		tt1.useInstance(tt1);
		tt2.useInstance(tt2);
		System.out.println("-----------------------��, ��ü�ּ�-----------------------");
		tt1.useInstanceVariable(50,tt1);
		tt2.useInstanceVariable(100,tt2);
		System.out.println(tt1.i);
		System.out.println(tt2.i);
		System.out.println("-----------------------this ���-----------------------");
		tt1.useInstanceVariable(5);
		tt2.useInstanceVariable(5);
		System.out.println(tt1.i);
		System.out.println(tt2.i);
	}
}
