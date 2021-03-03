package day0209;

/**
 * Parent의 자식 클래스
 * @author user
 */
public class Child1 extends Parent{
	int child1;
	
	@Override
	public void printName() {
		System.out.println("Child1 클래스가 Override 한 method");
	}
}
