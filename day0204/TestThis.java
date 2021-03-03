package day0204;

/**
 * this 키워드 형식의 사용
 * @author user
 */
public class TestThis {
	private int i;
	
	public void useInstance(TestThis tt) {
		System.out.println("메소드를 호출한 객체의 주소 : " + tt);
	}
	
	public void useInstanceVariable(int i,TestThis tt) {
		System.out.println(i);
	}
	
	public void useInstanceVariable(int i) {
		this.i = i;
		System.out.println(this.i);
	}
	
	public static void main(String[] args) {
		TestThis tt1 = new TestThis();
		TestThis tt2 = new TestThis();
		System.out.println("tt1 instance의 주소 : " + tt1);
		System.out.println("tt1 instance의 주소 : " + tt2);
		System.out.println("-----------------------객체주소-------------------------");
		tt1.useInstance(tt1);
		tt2.useInstance(tt2);
		System.out.println("-----------------------값, 객체주소-----------------------");
		tt1.useInstanceVariable(50,tt1);
		tt2.useInstanceVariable(100,tt2);
		System.out.println(tt1.i);
		System.out.println(tt2.i);
		System.out.println("-----------------------this 사용-----------------------");
		tt1.useInstanceVariable(5);
		tt2.useInstanceVariable(5);
		System.out.println(tt1.i);
		System.out.println(tt2.i);
	}
}
