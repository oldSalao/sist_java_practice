package day0201;

public class Homework {

	private String registNum;

	public Homework(String registNum) {
		this.registNum = registNum;
	}

	public String getRegistNum() {
		return registNum;
	}

	public void setRegistNum(String registNum) {
		this.registNum = registNum;
	}

	public boolean numLengthChk() {
		boolean flag = false;
		if (this.registNum.length() == 14) {
			flag = true;
		}
		return flag;
	}

	public boolean hypChk() {
		boolean flag = false;
		if (this.registNum.indexOf("-") == 6) {
			flag = true;
		}
		return flag;
	}

	public String bornDate() {
		String year = this.registNum.substring(0, 2);
		String month = this.registNum.substring(2, 3).replace("0", "") + this.registNum.substring(3, 4);
		String day = this.registNum.substring(4, 5).replace("0", "") + this.registNum.substring(5, 6);
		String point = this.registNum.substring(7, 8);

		if (point.equals("1") || point.equals("2") || point.equals("5") || point.equals("6")) {
			year = "19" + year;
		} else if (point.equals("3") || point.equals("4") || point.equals("7") || point.equals("8")) {
			year = "20" + year;
		} else {
			year = "18" + year;
		}

		return (year + "³â " + month + "¿ù " + day + "ÀÏ");
	}

	public int getAge() {
		int age = 0;
		String year = this.registNum.substring(0, 2);
		String point = this.registNum.substring(7, 8);

		if (point.equals("1") || point.equals("2") || point.equals("5") || point.equals("6")) {
			year = "19" + year;
		} else if (point.equals("3") || point.equals("4") || point.equals("7") || point.equals("8")) {
			year = "20" + year;
		} else {
			year = "18" + year;
		}

		age = 2021 - Integer.parseInt(year) + 1;

		return (age);
	}

	public String getGender() {
		int point = Integer.parseInt(this.registNum.substring(7, 8));
		String gender = "";

		if ((point==0)||(point%2==1)) {
			gender = "male";
		} else {
			gender = "female";
		}

		return gender;
	}

	public String getBelt() {
		String belt = "";
		String year = this.registNum.substring(0, 2);
		String point = this.registNum.substring(7, 8);

		if (point.equals("1") || point.equals("2") || point.equals("5") || point.equals("6")) {
			year = "19" + year;
		} else if (point.equals("3") || point.equals("4") || point.equals("7") || point.equals("8")) {
			year = "20" + year;
		} else {
			year = "18" + year;
		}

		switch (Integer.parseInt(year) % 12) {
		case 0:
			belt = "¿ø¼þÀÌ";
			break;
		case 1:
			belt = "´ß";
			break;
		case 2:
			belt = "°³";
			break;
		case 3:
			belt = "µÅÁö";
			break;
		case 4:
			belt = "Áã";
			break;
		case 5:
			belt = "¼Ò";
			break;
		case 6:
			belt = "È£¶ûÀÌ";
			break;
		case 7:
			belt = "Åä³¢";
			break;
		case 8:
			belt = "¿ë";
			break;
		case 9:
			belt = "¹ì";
			break;
		case 10:
			belt = "¸»";
			break;
		case 11:
			belt = "¾ç";
			break;
		}

		return belt;
	}

}
