package day0215;

/**
 * 중첩클래스
 * 
 * @author user
 */
public class TestNested {
	int insI;
	static int staI;

	public TestNested() {
		System.out.println("바깥 클래스의 생성자.");
	}// TestNested

	public void outInsMethod() {
		System.out.println("바깥클래스의 instance method");
	}// outInsMethod

	public static void outStaMethod() {
		System.out.println("바깥클래스의 static method");
	}// outStaMethod

	////////////////////////////////////// nested class
	////////////////////////////////////// 시작///////////////////////////////////////

	public static class Nested {
		//class의 접근 지정자를 static으로 사용하나 클래스 영역이 static으로 변경되지는 않는다.
		static int inI;
		
		//생성자를 가질 수 있지만 객체화하여 사용할 목적으로 만드는 클래스가 아니므로 생성자를 만들지 않는다.
		
		//instance method를 만들 수 있지만 만들면 객체화하여 사용해야 하므로 만들지 않는다.
		
		public static void inMethod() {
			System.out.println("안쪽 클래스의 method : " + inI);
			//안쪽클래스의 method에서는 바깥 클래스의 자원을 직접 사용할 수 있다.
			//하지만 static 영역의 자원이어야한다.
//			insI=100; // instance 영역의 변수는 사용 불가.
			staI=100;
			System.out.println("바깥 클래스의 변수 : " + staI);
//			outInsMethod(); // instance 영역의 method 사용 불가.
			outStaMethod();
		}
	}

	////////////////////////////////////// nested class
	////////////////////////////////////// 끝///////////////////////////////////////////
	
	public static void main(String[] args) {
		//클래스 영역안에 static 클래스로 업무를 구분하여 만들어 사용하는 것이므로, 객체화 없이 클래스명.method명으로 사용.
		Nested.inMethod();
	}

}
