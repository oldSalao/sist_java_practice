package day0204;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * Method Override (Overriding) 연습.<br>
 * Override : 부모클래스의 method가 자식클래스의 상황과 맞지 않는다면 자식 클래스에서 부모클래스의 method와 동일한
 * method를 정의하여 사용하는 것.
 * 
 * @author user
 */
public class OverrideSub extends OverrideSuper {

	public String toString() {
		return "주소가 싫어요!";
	}

//	public String superMethod() { // 반환형이 다르면 Override 규칙에 위배되므로 Error 발생.
//		System.out.println("자식클래스에서 변환!");
//		return "";
//	}

//	@Override
//	public void superMethod(int i) { //매개변수를 선언하면 method 호출이 다르게 되기 때문에 Override가 성립되지 않는다.
//		System.out.println("자식클래스에서 변환!");
//	}

	@Override
	// 부모:protected 자식:public
	public void superMethod1() { // Override된 method에서 접근지정자는 광의의 접근지정자로 변경가능.
		System.out.println("자식클래스에서 변환!");
	}

	/**
	 * 비추천메소드(Deprecated) : 요즘애들은 라떼와 달라서...
	 * 
	 */
	@Deprecated
	public void test() {
		System.out.println("HDD");
	}

	public void temp() {
//		@SuppressWarnings("unused") // method 안이나 위에서도 사용가능. 위는 method 전체, 내부는 아래 한줄만 적용.
		int i = 0;
		int j = 0;
		
		@SuppressWarnings({ "rawtypes", "unused" })
		List list = new ArrayList();
	}

	public static void main(String[] args) {
		OverrideSub os = new OverrideSub();
		System.out.println("-----------------------Object class의 toString() Override-----------------------");
		// Object 클래스에서 제공하는 toString() 호출. 원래는 주소를 반환하지만 Override로 인해 주소가 싫어요! 출력.
		System.out.println(os.toString());
//		System.out.println() 에 instance를 넣어 출력하면 그 안에서 toString()이 호출되어 주소가 출력된다. 하지만 Override로 인해서 주소가 싫어요! 출력.
		System.out.println(os);

		os.superMethod();
		os.superMethod1();
		System.out.println("--------------------------------------------------------------");

		Date date = new Date();
		System.out.println(date);
		System.out.println(date.getYear() + 1900);

		os.test();
	}
}
