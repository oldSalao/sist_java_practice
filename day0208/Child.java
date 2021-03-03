package day0208;

/**
 * Parent의 자식 클래스
 * 
 * @author user
 */
public class Child extends Parent {
	
	public Child() {
		super(100);
		System.out.print("자식 기본생성자 ");
	}

	public Child(int i) {
		this();
		System.out.print("자식 인자생성자 " + i+  " ");
	}

}
