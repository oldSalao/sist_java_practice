package day0126.sub;
import day0126.UseAccessModifier;

/**
 * �ٸ� ��Ű���� Ŭ������ ��ӹް� �θ�Ŭ������ �����ϴ� instance variable ���<br>
 * �θ�Ŭ���� (UseAccessModifier),�ڽ�Ŭ���� (UseInstanceValue2)<br>
 * ��Ӱ����϶��� �ڽ�Ŭ������ ��üȭ�� �ؾ� �θ�Ŭ������ ������ method�� ��� �� ����� �� �ִ�.<br>
 * @author user
 */
public class UseInstanceVariable2 extends UseAccessModifier {
	public static void main(String[] args) {
		//1.�ڽ� Ŭ������ ��üȭ
		UseInstanceVariable2 uiv = new UseInstanceVariable2();
		//��Ű���� �ٸ� �ڽ�Ŭ���������� public,protected ���������ڴ� ��� ����.
		System.out.println("public : a " + uiv.a);
		System.out.println("protected : b " + uiv.b);
//		System.out.println("default : c " + uiv.c);
//		System.out.println("private : d " + uiv.d);	
	}
}
