package day0126;

/**
 * 
 * @author user
 */
public class UseInstanceVariable {
	public static void main(String[] args) {
		//1.��üȭ
		UseAccessModifier uam = new UseAccessModifier();
		//���� ��Ű���� �ٸ�Ŭ�������� public, protected, default ���������ڴ� ��� ����.
		System.out.println("public : a " + uam.a);
		System.out.println("protected : b " + uam.b);
		System.out.println("default : c " + uam.c);
//		System.out.println("private : d " + uam.d);	
	}
}
