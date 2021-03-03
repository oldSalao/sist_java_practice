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
		return "HomeworkStudent [name=" + name + ", address=" + address + ", gender=" + gender + ", age=" + age
				+ ", score=" + score + "]";
	}

}
