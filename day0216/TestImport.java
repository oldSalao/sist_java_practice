package day0216;

//import java.util.*;//권장하지 않음.
import java.util.Date;//특정 클래스 하나만 사용하는 import.
import java.util.Calendar;
//import java.sql.Date;//패키지명이 다르고 클래스명이 같다면 그 중 하나만 import로 받을 수 있다.

/**
 * 외부패키지(현재 클래스가 존재하는 패키지가 아닌 패키지)에 존재하는 클래스 사용.
 * @author user
 */
public class TestImport {

	public static void main(String[] args) {
		Date d = new Date();//java.util.Date로 사용하고 싶고
		java.sql.Date d2 = new java.sql.Date(100000000);//java.sql.Date로 사용하고 싶다.
		
		Calendar c = Calendar.getInstance();
	}

}
