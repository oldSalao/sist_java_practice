package day0126.sub;
import day0126.UseAccessModifier;

/**
 * 다른 패키지의 클래스를 상속받고 부모클래스에 존재하는 instance variable 사용<br>
 * 부모클래스 (UseAccessModifier),자식클래스 (UseInstanceValue2)<br>
 * 상속관계일때는 자식클래스로 객체화를 해야 부모클래스의 변수나 method를 모두 다 사용할 수 있다.<br>
 * @author user
 */
public class UseInstanceVariable2 extends UseAccessModifier {
	public static void main(String[] args) {
		//1.자식 클래스를 객체화
		UseInstanceVariable2 uiv = new UseInstanceVariable2();
		//패키지가 다른 자식클래스에서는 public,protected 접근지정자는 사용 가능.
		System.out.println("public : a " + uiv.a);
		System.out.println("protected : b " + uiv.b);
//		System.out.println("default : c " + uiv.c);
//		System.out.println("private : d " + uiv.d);	
	}
}
