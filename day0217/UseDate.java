package day0217;

import java.util.Date;

/**
 * 날짜 얻기.
 * @author user
 */
public class UseDate {
	
	public UseDate() {
		Date date = new Date();
		System.out.println(date); //toString()
	}

	public static void main(String[] args) {
		Date d = new Date();
		
		new UseDate();
		
//		System.out.println(System.currentTimeMillis());
//		int sum = 0;
//		long st = System.currentTimeMillis(),et = 0;
//		for(int i = 0; i<5000;i++) {
//			sum+=i;
//			System.out.println(i);
//		}
//		System.out.println(sum);
//		et = System.currentTimeMillis();
//		System.out.println(et-st + "ms");
		
	}

}
