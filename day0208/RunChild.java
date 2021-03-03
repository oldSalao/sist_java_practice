package day0208;

/**
 * 자식 클래스를 생성하여, 부모클래스의 생성자 호출관계를 살펴보기 위한 클래스.
 * 
 * @author user
 */
public class RunChild {

	public static void main(String[] args) {
		new Child();
		System.out.println("-------------------------------------------------");
		new Child(100);
	}

}
