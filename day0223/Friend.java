package day0223;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.StringTokenizer;

public class Friend {
	private String name, phoneNum, school;
	public static int NAME = 0, PHONE = 1, SCHOOL = 2;

	public Friend() {

	}

	public Friend(String info) {
		StringTokenizer st = new StringTokenizer(info, " ");
		int len = st.countTokens();
		String[] infoArr = new String[3];
		for (int i = 0; i < len; i++) {
			infoArr[i] = st.nextToken();
		}
		this.name = infoArr[NAME];
		this.phoneNum = infoArr[PHONE];
		this.school = infoArr[SCHOOL];
	}

	public String printList() {
		String result = "이름:" + name + " 핸드폰:" + phoneNum + " 학교:" + school;
		return result;
	}

	public static void main(String[] args) {
		List<Friend> friendList = new ArrayList<Friend>();
		@SuppressWarnings("resource")
		Scanner sc = new Scanner(System.in);

		for (int i = 0; i < 3; i++) {
			friendList.add(new Friend(sc.nextLine()));
		}

		for (Friend temp : friendList) {
			System.out.println(temp.printList());
		}

	}

}
