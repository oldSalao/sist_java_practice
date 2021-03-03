package day0217;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author user
 */
public class UseCalendar {

	public UseCalendar() {
		// Calendar c = new Calendar(); //추상클래스이므로 객체화가 되지 않는다.

		Calendar cal = new GregorianCalendar();// 자식 클래스를 활용한 is a 관계의 객0체화.

		Calendar cal1 = Calendar.getInstance();// getInstance()를 활용한 객체화.

		System.out.println(cal);
		System.out.println(cal1); // 둘다 GregorianCalendar를 이용한 객체이다.

		// MONTH는 1을 더해주어야 한다.
		// 요일은 일요일(1)부터 1씩 증가하여 나온다.
		int weekChk = cal1.get(Calendar.DAY_OF_WEEK);
		int am = cal1.get(Calendar.AM_PM);
		String[] amTitle = { "오전", "오후" };
		String[] week = { "일", "월", "화", "수", "목", "금", "토" };
//		String week = "";
//		
//		switch (weekChk) {
//		case 1:
//			week = "일요일";
//			break;
//		case 2:
//			week = "월요일";
//			break;
//		case 3:
//			week = "화요일";
//			break;
//		case 4:
//			week = "수요일";
//			break;
//		case 5:
//			week = "목요일";
//			break;
//		case 6:
//			week = "금요일";
//			break;
//		case 7:
//			week = "토요일";
//			break;
//		}

		String output = cal1.get(Calendar.YEAR) + " " + (cal1.get(Calendar.MONTH) + 1) + " "
				+ cal1.get(Calendar.DAY_OF_MONTH) + " " + cal1.get(Calendar.DAY_OF_WEEK) + " " + week[weekChk - 1] + " "
				+ amTitle[am] + " " + cal1.get(Calendar.HOUR) + " " + cal1.get(Calendar.HOUR_OF_DAY) + " "
				+ cal1.get(Calendar.MINUTE) + " " + cal1.get(Calendar.SECOND);

		System.out.println(output);
		
		System.out.println("---------------------------날짜 정보 변경--------------------------------");
		System.out.println(cal);//현재날짜정보
		//년 변경
		cal.set(Calendar.YEAR, 2015);
		//월 변경 (생각하는 월-1)
		cal.set(Calendar.MONTH, 11);
		//일 변경
		cal.set(Calendar.DAY_OF_MONTH, 30);
		
		System.out.printf("%d-%d-%d %s",cal.get(Calendar.YEAR),cal.get(Calendar.MONTH)+1,cal.get(Calendar.DAY_OF_MONTH),cal.get(Calendar.DAY_OF_WEEK));
		
		
		
	}

	public static void main(String[] args) {
		new UseCalendar();
	}

}
