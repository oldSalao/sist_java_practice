package day0201;

public class UseHomework {

	public static void main(String[] args) {
		Homework h = new Homework("960302-1234567");
		if (h.numLengthChk()) {
			if (h.hypChk()) {
				System.out.println("입력주민번호 : " + h.getRegistNum());
				System.out.println("생년월일 : " + h.bornDate());
				System.out.println("나이 : " + h.getAge());
				System.out.println("성별 : " + h.getGender());
				System.out.println("띠 : " + h.getBelt());
			}
			else{
				System.out.println("-이 정상적인 위치에 없습니다.");
			}
		}
		else {
			System.out.println("주민번호의 글자수가 맞지 않습니다.");
		}
	}

}
