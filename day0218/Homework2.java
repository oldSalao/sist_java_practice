package day0218;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

public class Homework2 {

	public static List<Integer> sundayList(int month) {
		Calendar cal = Calendar.getInstance();
		List<Integer> li = new ArrayList<Integer>();
		month-=1;
		
		cal.set(Calendar.MONTH, month);
		cal.set(Calendar.DAY_OF_WEEK, 1);
		cal.set(Calendar.WEEK_OF_MONTH, 1);
		
		if (cal.get(Calendar.MONTH) != month) {
			cal.set(Calendar.YEAR, 2021);
			cal.set(Calendar.MONTH, month);
			cal.set(Calendar.WEEK_OF_MONTH, 2);
		}
		
		while (cal.get(Calendar.MONTH)== month) {
			li.add(cal.get(Calendar.DAY_OF_MONTH));
			cal.set(Calendar.WEEK_OF_MONTH, cal.get(Calendar.WEEK_OF_MONTH)+1);
		}

		return li;
	}
	
	public static void printSunday(List<Integer> li) {
		for(int day : li) {
			System.out.println(day);
		}
	}
	

	public static void main(String[] args) {
		printSunday(sundayList(12));
	}

}
