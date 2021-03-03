package day0303;

import java.util.Random;

/**
 * 예외 강제발생.
 * 
 * @author user
 */
public class UseThrow {
	/**
	 * 발생된 예외는 대부분은 던져서 처리한다.
	 * 던지는 예외는 발생된 예외는 그대로 던져도 되고, 부모 예외처리 클래스를 던져도 된다.
	 * @throws Exception
	 */
	public void useThrow() throws Exception {
		System.out.println("예외 발생전.");
		if (new Random().nextBoolean()) {
			throw new Exception("예외를 생산하였다!");
		}
		System.out.println("예외 발생후.");
	}

	public void callUseThrow(){
		try {
		useThrow();
		}
		catch(Exception e) {//throws된 예외처리클래스를 그대로 써도 되고, 부모예외처리 클래스를 써도 된다.
			System.err.println("에러발생.");
		}
	}

	public static void main(String[] args) {
		UseThrow ut = new UseThrow();
//		try {
			ut.callUseThrow();
			ut.callUseThrow();
			ut.callUseThrow();
//		} catch (Exception e) {
//			System.err.println("에러발생");
//		}
	}
}
