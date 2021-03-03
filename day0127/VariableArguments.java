package day0127;

/**
 * 하나의 매개변수에 여러개의 값을 넣어서 사용하는 Variable Arguments.<br>
 * 
 * @author user
 */
public class VariableArguments {

	public void year(int... a) {
		for (int num : a) {
			System.out.println(num);
		}
	}

	public void variable(int a, int b, double... value) {// 매캐변수가 여러개 정의 될 때 V.A는 가장 마지막에만 만들 수 있다.
		for (double num : value) {
			System.out.println(num);
		}
	}


	public static void main(String[] args) {
		VariableArguments va = new VariableArguments();
		va.year(5, 6, 7, 8, 9);//year(), year(1), year(1,2,45,63,4)처럼 다양한 갯수의 입력값을 넣을 수 있다.
		
		System.out.println("\"안녕하세요\"");
	}

}
