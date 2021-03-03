package day0219;

import java.util.StringTokenizer;

public class HomeworkStudent {
	private String name,address,gender;
	private int age,score;
	
	public HomeworkStudent() {
		
	}
	
	public HomeworkStudent(String info) {
		StringTokenizer st = new StringTokenizer(info, ",");
		String[] temp = new String[st.countTokens()];
		int cnt = 0;
		
		while(st.hasMoreTokens()) {
			temp[cnt] = st.nextToken();
			cnt++;
		}
		
		this.name = temp[0];
		this.age = Integer.parseInt(temp[1]);
		this.address = temp[2];
		this.gender = temp[3];
		this.score = Integer.parseInt(temp[4]);
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
		return "HomeworkStudent [name=" + name + ", address=" + address + ", gender=" + gender + ", age=" + age
				+ ", score=" + score + "]";
	}

}
