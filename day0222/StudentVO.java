package day0222;

import java.util.StringTokenizer;

/**
 * 학생의 이름, 나이, 주소, 성별, 자바점수를 저장할 목적으로 만드는 클래스.<br>
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

	// 객체를 생성할 때 값을 넣어주고, 제시된 작업을 진행 중에 있어서 수정이 필요하지 않기 때문에 setter는 생략.
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
