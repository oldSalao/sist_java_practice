package day0204;

import java.awt.Frame;

/**
 *
 * @author user
 */
public class Child extends Parent{

	private int j;
	
	public Child() {
		System.out.println("�ڽ�Ŭ������ �⺻ ������");
	}
	
	public void useJ() {
		System.out.println("�ڽ��� method : " + j);
	}
	
	public static void main(String[] args) {
		//�ڽ� Ŭ������ ��üȭ
		Child c = new Child();
		//�ڽ�Ŭ������ ��ü�� ���� �θ� Ŭ������ �ڿ� ��� ����.
		//�ڵ��� ���뼺 : �θ�Ŭ������ �ڿ�(����,method)
		c.useJ();
		c.useI();
		//object �޼ҵ� ȣ�� : toString() -> ��ü�� �ּҸ� ���ڿ��� ��ȯ�ϴ� ��.
		System.out.println(c.toString());
		//java.lang.Object Ŭ�������� �����ϴ� ��� method�� ��� Ŭ�������� ��� �����ϴ�.
		//�ڵ��� ���뼺.
		//Integer,String,Frame ��ü�� toString�� override �Ǿ� �ּҰ� �ƴ� ���� ���´�.
		Integer i = new Integer(10);
		System.out.println(i.toString());
		String s = new String("Hello");
		System.out.println(s.toString());
		Frame f = new Frame();
		System.out.println(f.toString());
	}
}
