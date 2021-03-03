package day0218;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

public class Homework1 {

	public static String nDate(String country) {
		Date date = new Date();
		String dateFormat = "";
		SimpleDateFormat sd = null;
		Locale tempLoc = Locale.KOREA;

		switch (country) {
		case "�̱�":
			tempLoc = Locale.US;
			break;
		case "�Ϻ�":
			tempLoc = Locale.JAPAN;
			break;
		case "�߱�":
			tempLoc = Locale.CHINA;
			break;
		}
		
		sd = new SimpleDateFormat("MM-dd-yyyy EEEE HH:mm", tempLoc);
		dateFormat = sd.format(date);

		return dateFormat;
	}

	public static void printDate(String date) {
		System.out.println(date);
	}

	public static void main(String[] args) {
		printDate(nDate("�߱�"));
	}

}
