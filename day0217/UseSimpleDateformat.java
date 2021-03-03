package day0217;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;

/**
 * Formatter class
 * @author user
 */
public class UseSimpleDateformat {
	
	public UseSimpleDateformat() {
		Date date = new Date();
		
		//생성 : M - 1~9까지 1자리로 출력. MM - 1~9월까지 0이붙어 출력된다.
		//d - 1~9까지 1자리로 출력, dd - 1~9일까지 0이 붙어서 출력된다.
		//h,K - 1~9까지 1자리로 출력, hh,KK - 1~9일까지 0이 붙어 출력된다.
		//H,k - 24시간으로 출력. HH,kk - 동일.
		//m분 mm, s 초 ss
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E요일 a HH:mm:ss");
		
		System.out.println(sdf);
		System.out.println(sdf.format(date));
		System.out.println(sdf.toPattern());
		
		sdf.applyPattern("MM-dd-yyyy");
		
		System.out.println(sdf.format(date));
		
		//Locale 클래스와 같이 사용되면 다른 나라의 날짜 형식으로 출력이 가능
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd EEEE a HH:mm:ss",Locale.JAPAN);
		System.out.println(sdf1.format(date));
	}
	
	public static void main(String[] args) {
		new UseSimpleDateformat();
	}
}
