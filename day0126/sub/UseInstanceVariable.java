package day0126.sub;
import day0126.UseAccessModifier;

/**
 * �ٸ� ��Ű���� Ŭ������ �����ϴ� instance variable ���
 * @author user
 */
public class UseInstanceVariable {
	public static void main(String[] args) {
		//1.��üȭ
		UseAccessModifier uam = new UseAccessModifier();
		//��Ű���� �ٸ��� ��Ӱ��谡 ������ public ���������ڸ� ��� ����.
		System.out.println("public : a " + uam.a);
//		System.out.println("protected : b " + uam.b);
//		System.out.println("default : c " + uam.c);
//		System.out.println("private : d " + uam.d);	
	}
}
