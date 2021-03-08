package project1;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static final int CODE = 0;
	public static final int KEY = 1;
	public static final int QUERY = 2;
	public static final int BROWSER = 3;
	public static final int TIME = 4;

	public static void main(String[] args) {
		String str = "[200][http://sist.co.kr/find/img?key=java&query=sist][ie][2020-08-05 09:07:54]";
		String key = "";
		String query = "";
		String[] tempArr = null;
		String[] logArr = new String[5];
		List<String[]> logList = new ArrayList<String[]>();

		tempArr = str.substring(1, str.length() - 1).split("\\]\\[");

		key = tempArr[1].substring(tempArr[1].indexOf("=") + 1, tempArr[1].indexOf("&"));
		query = tempArr[1].substring(tempArr[1].lastIndexOf("=") + 1);

		logArr[CODE] = tempArr[0];
		logArr[KEY] = key;
		logArr[QUERY] = query;
		logArr[BROWSER] = tempArr[2];
		logArr[TIME] = tempArr[3];

		for (String temp : logArr) {
			System.out.print(temp + "\t");
		}

		System.out.println("\n--------------------------------------------------------------------");

		logList.add(logArr);
		for(String temp : logList.get(0)) {
		System.out.print(temp+"\t");
		}
	}

}
