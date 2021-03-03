package day0126;

/**
 * method 작성 기준.<br>
 * method를 만들 때 instance variable을 사용하여 일처리를 하는 경우.<br>
 * => instance method 작성.<br>
 * method를 만들 때 instance variable을 사용하지 않고 일처리를 하는 경우.<br>
 * => static method 작성.<br>
 * @author user
 */
public class UseMethod {
	
	int i;//instance variable
	
	/**
	 * instance method
	 */
	public void instanceMethod() {
		System.out.println("instance method : i를 사용 " + i);
	}
	
	/**
	 * static method
	 */
	public static void staticMethod(int param) {
		System.out.println("static method : i 사용 불가능, 파라미터 사용 " + param);
	}
	
	
	
	public static void main(String[] args) {
		//instance method 호출.
		//instanceMethod(); //직접 호출 불가.
		UseMethod um = new UseMethod();
		um.i = 100;
		//instance method 호출
		um.instanceMethod();
		//static method 호출
		UseMethod.staticMethod(5);
		
	}

}
