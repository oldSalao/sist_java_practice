package day0222;

import java.util.StringTokenizer;

/**
 * �л��� �̸�, ����, �ּ�, ����, �ڹ������� ������ �������� ����� Ŭ����.<br>
 * VO(Value object)
 * 
 * @author user
 */
public class StudentVO {
	public static final int NAME = 0, AGE = 1, ADDRESS = 2, GENDER = 3, SCORE = 4;
	private String name, address, gender;
	private int age, score;

	public StudentVO() {
	}

	public StudentVO(String info) {
		StringTokenizer st = new StringTokenizer(info, ",");
		String[] temp = new String[st.countTokens()];
		int cnt = 0;

		while (st.hasMoreTokens()) {
			temp[cnt] = st.nextToken();
			cnt++;
		}

		this.name = temp[NAME];
		this.age = Integer.parseInt(temp[AGE]);
		this.address = temp[ADDRESS];
		this.gender = temp[GENDER];
		this.score = Integer.parseInt(temp[SCORE]);
	}

	// ��ü�� ������ �� ���� �־��ְ�, ���õ� �۾��� ���� �߿� �־ ������ �ʿ����� �ʱ� ������ setter�� ����.
	public String getAddress() {
		return address;
	}

	public String getGender() {
		return gender;
	}

	public int getAge() {
		return age;
	}

	public int getScore() {
		return score;
	}

	public String getName() {
		return name;
	}

	@Override
	public String toString() {
		return "StudentVO [name=" + name + ", address=" + address + ", gender=" + gender + ", age=" + age + ", score="
				+ score + "]";
	}
}
