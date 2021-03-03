package day0303;

import java.util.Random;

public class UseDefineException {

	/**
	 * 담배를 피우는 것을 적발하면 일을 수행.
	 * 
	 * @return
	 */
	public String kibum() throws TobacoException {
		String result = null;
		String[] stuGrade = { "초딩", "중딩", "고딩", "대딩" };
		String temp = stuGrade[new Random().nextInt(stuGrade.length)];

		if (temp.equals("초딩")) {// 흡연자가 초딩이라면 예외를 발생.
			throw new TobacoException("초딩님 금연 좀!");
		}

		result = temp + "님이 흡연 중. 모른척 지나간다.('')";

		return result;
	}

	public void callKibum() {
		try {
			System.out.println(kibum());
		} catch (TobacoException e) {//발생된 예외를 명확하게 정의하여 처리할 수 있다.
			e.printStackTrace();
		}
	}

	public static void main(String[] args) {
		UseDefineException ude = new UseDefineException();
		ude.callKibum();
	}
}
