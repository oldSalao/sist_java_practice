package day0208;

public class Homework extends Person {

	private int point;

	public Homework(String name) {
		setName(name);
	}

	public String basketBall() {
		String result = "";
		boolean flag = false;
		//프로그램은 "된다" 라는 긍정적인 생각을 가지고 것이 아니고, 안된다. 라는 부정적인 상황에서 시작합니다. "안되지만 이상황에서는 되는것이야"\
	//라고 짜주세요. 그래야 오류가 더 발생하게됩니다. 
		int shoot = (int) ((Math.random() * 4));
		while (!flag) {
			if (shoot == 1) {
				shoot = (int) ((Math.random() * 4));
			} else if ((shoot > 1) && (shoot < 4)) {
				result = shoot + "점 슛 성공!";
				point += shoot;
				flag = true;
			} else {
				result = "슛 실패";
				flag = true;
			}
		}
		return result;
	}
	public String point() {
		String result = "";
		result = "현재 점수는 " + point +"점 입니다.";
		return result;
	}
}
