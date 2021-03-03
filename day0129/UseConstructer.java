package day0129;

public class UseConstructer {

	public UseConstructer() {
		System.out.println("기본생성자");
		//메소드는 정의된 영역이 같으면 그냥 호출 가능.
		test();
		//하지만 생성자는 영역이 같아도 그냥 호출할 수 없다. 꼭 new를 사용해야한다.
		new UseConstructer(45);
	}
	
	public UseConstructer(int i) {
		System.out.println("매개변수 있는 생성자. " + i);
	}
	
	public void test() {
		System.out.println("method");
	}
	
	public static void main(String[] args) {
		new UseConstructer();
		new UseConstructer(146);
//		UseConstructer uc = new UseConstructer();
//		uc.test();//영역이 다르면 객체를 만들고 객체를 통해서 호출해야한다.
	}
}
