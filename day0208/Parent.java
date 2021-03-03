package day0208;

/**
 * 부모클래스
 * 
 * @author user
 */
public class Parent {
	public Parent() {
		System.out.print("부모 기본생성자 ");
	}

	public Parent(int i) {
		this();
		System.out.print("부모 인자생성자 " + i +  " ");
	}
}
