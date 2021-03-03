package day0128.sub;

import day0128.Test; // package가 달라도 import 된다.

//import day0128.Test2;//package가 달라서 import 되지 않는다.

public class UseTest {

	public static void main(String[] args) {
		//public 접근지정자가 설정된 클래스 사용.
		Test t = new Test();
		System.out.println(t);
		
		//package 접근지정자가 설정된 클래스 사용.
//		Test2 t2 = new Test2(); //package가 달라서 사용할 수 없다.
		
	}

}
