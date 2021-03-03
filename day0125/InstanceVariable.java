package day0125;

/**
 * 객체화 후 사용할 수 있는 instance variable의 사용. <br>
 * 객체화 : 클래스명 객체면 = new 클래스명(); <br>
 * 사용 : 객체명.변수명 <br>
 * @author user
 */
public class InstanceVariable {
	int i;//클래스가 실행 되었다고 메모리에 로딩되는 것이 아니다.
	int j;//instance 변수는 자동초기화 된다. (정수형 = 0, 실수형은 0.0 문자형은 \u0000 참조형은 null)
	public static void main(String[] args) {
		//인스턴스 변수는 static 영역에서 직접 사용불가.(static 영역은 클래스를 실행하면 가장 먼저 로딩되기 때문에
		//메모리에 로딩 될지 되지 않을지 알 수 없는 인스턴스 변수를 사용할 수 없다.)
		
		//객체화 : instance 변수를 사용하기위해 첫번째로 해야 할 작업이다.
		InstanceVariable me = new InstanceVariable(); //instance 변수들이 heap 메모리에 load 된다.
		
		//사용 : 객체명.변수명
		me.i = 5;
		me.j = 10;
		
		System.out.println(me.i+me.j);
	}

}
