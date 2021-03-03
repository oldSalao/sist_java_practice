package day0126.sub;
import day0126.UseAccessModifier;

/**
 * 다른 패키지의 클래스에 존재하는 instance variable 사용
 * @author user
 */
public class UseInstanceVariable {
	public static void main(String[] args) {
		//1.객체화
		UseAccessModifier uam = new UseAccessModifier();
		//패키지가 다르고 상속관계가 없으면 public 접근지정자만 사용 가능.
		System.out.println("public : a " + uam.a);
//		System.out.println("protected : b " + uam.b);
//		System.out.println("default : c " + uam.c);
//		System.out.println("private : d " + uam.d);	
	}
}
