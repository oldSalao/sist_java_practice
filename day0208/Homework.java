package day0208;

public class Homework extends Person {

	private int point;

	public Homework(String name) {
		setName(name);
	}

	public String basketBall() {
		String result = "";
		boolean flag = false;
		//���α׷��� "�ȴ�" ��� �������� ������ ������ ���� �ƴϰ�, �ȵȴ�. ��� �������� ��Ȳ���� �����մϴ�. "�ȵ����� �̻�Ȳ������ �Ǵ°��̾�"\
	//��� ¥�ּ���. �׷��� ������ �� �߻��ϰԵ˴ϴ�. 
		int shoot = (int) ((Math.random() * 4));
		while (!flag) {
			if (shoot == 1) {
				shoot = (int) ((Math.random() * 4));
			} else if ((shoot > 1) && (shoot < 4)) {
				result = shoot + "�� �� ����!";
				point += shoot;
				flag = true;
			} else {
				result = "�� ����";
				flag = true;
			}
		}
		return result;
	}
	public String point() {
		String result = "";
		result = "���� ������ " + point +"�� �Դϴ�.";
		return result;
	}
}
