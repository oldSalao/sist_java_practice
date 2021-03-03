package day0204;

/**
 * 부모클래스 : 내 자식(Parent 클래스를 부모로 하는 클래스들)이 가져야 할 공통 특징을 정의.
 * @author user
 */
public class Parent {
	private int i;
	
	public Parent() {
		System.out.println("부모의 기본 생성자");
	}
	
	public void useI() {
		System.out.println("부모의 method : " + i);
	}
}
