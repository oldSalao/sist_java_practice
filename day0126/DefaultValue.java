package day0126;

/**
 * instance variable의 기본값(default value).
 * @author user
 */
public class DefaultValue {

	//instance variable : 클래스안의 instance 영역에서는 그냥 사용할 수 있는 변수.
	
	// primitive type.
	int a;// 정수형 0으로 자동 초기화.
	char b;// 문자형 \u0000 으로 자동 초기화(Unicode는 코딩창에서 직접 사용할 수는 없다.
	float c;// 실수형 0.0f 로 자동 초기화.
	boolean d;// 불린형 false로 자동 초기화.

	// reference type
	DefaultValue dv; // class : null로 자동초기화.
	String s; // String : null로 자동초기화.
	int[] arr; // array : null로 자동초기화.
	
	/**
	 * instance method
	 */
	public void methodA() { //instance 영역에서는 instance variable을 객체명 없이 사용할 수 있다.
		System.out.println(a);
	}
	
	/**
	 * static method
	 */
	public static void methodB() {//static method 안에서는 객체화를 하여야 instance variable을 사용할 수 있다.
		DefaultValue dv = new DefaultValue();
		System.out.println(dv.a);
	}

	public static void main(String[] args) {
		// java DefaultValue로 클래스를 실행하면 main method가 가장 처음 실행된다.
		// class field를 실행하지 않는다. - 인스턴스 변수가 메모리에 올라가지 않는다. - 사용불가)
		// System.out.println(dfv.dv);
		//객체화 : 클래스명 객체명 = new 클래스명(); - 인스턴스 변수가 메모리에 로드된다. - 사용가능)
		DefaultValue dv = new DefaultValue();
		System.out.println("정수형 : " + dv.a);
		System.out.println("문자형 : " + dv.b);// 공백이 나타나는데 이것이 \u0000임.
		System.out.println("실수형 : " + dv.c);
		System.out.println("불린형 : " + dv.d);
		
		System.out.println("Class : " + dv.dv);
		System.out.println("String : " + dv.s);
		System.out.println("Array : " + dv.arr);
		System.out.println("==================================================================");
		//instance 변수는 객체마다 생성되고 사용되는 변수.
		
		DefaultValue dv1 = new DefaultValue();
		DefaultValue dv2 = new DefaultValue();
		
		dv1.a = 10;
		
		System.out.println("dv1.a : " + dv1.a);
		System.out.println("dv2.a : " + dv2.a);
	}

}
