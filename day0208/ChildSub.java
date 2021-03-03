package day0208;

/**
 * ParentSuper의 자식 클래스
 * @author user
 */
public class ChildSub extends ParentSuper{
	
	int i; // 부모클래스와 같은 이름의 변수 존재.
	int j; // 자식 클래스만 가지고 있는 이름의 변수.
	
	public void print() {
		super.i=100; // 이름이 같은 변수는 this와 super로 구분.
		k=50; // this.k=50; super.k=50;
		System.out.println("자식 i : " + i + ", j : " + j);
//		System.out.println("부모 i : " + super.i + ", k : " + this.k);
		super.print();
	}
	
	public static void main(String[] args) {
		ChildSub cs = new ChildSub();
		cs.print();
	}
}
