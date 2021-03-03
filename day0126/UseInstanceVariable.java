package day0126;

/**
 * 
 * @author user
 */
public class UseInstanceVariable {
	public static void main(String[] args) {
		//1.객체화
		UseAccessModifier uam = new UseAccessModifier();
		//같은 패키지의 다른클래스에서 public, protected, default 접근지정자는 사용 가능.
		System.out.println("public : a " + uam.a);
		System.out.println("protected : b " + uam.b);
		System.out.println("default : c " + uam.c);
//		System.out.println("private : d " + uam.d);	
	}
}
