package day0208;

/**
 * Parent�� �ڽ� Ŭ����
 * 
 * @author user
 */
public class Child extends Parent {
	
	public Child() {
		super(100);
		System.out.print("�ڽ� �⺻������ ");
	}

	public Child(int i) {
		this();
		System.out.print("�ڽ� ���ڻ����� " + i+  " ");
	}

}
