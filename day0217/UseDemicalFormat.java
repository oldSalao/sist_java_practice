package day0217;

import java.text.DecimalFormat;

/**
 * 숫자포멧.
 * @author user
 */
public class UseDemicalFormat {

	public UseDemicalFormat() {
		int i = 1_000_000; // JDK1.7 부터 지원되는 기능. _로 정수상수의 자릿수 구분, 가독성 향상.
		System.out.println(i);//_는 출력되지 않는다.
		
		DecimalFormat df = new DecimalFormat("0,000,000");
		DecimalFormat df1 = new DecimalFormat("#,###,###");
		
		System.out.println(df.format(2021));
		System.out.println(df1.format(2021));
		
		DecimalFormat df2 = new DecimalFormat("#,###.000");
		System.out.println(df2.format(20212021.2021)); // 자릿수를 초과하는 숫자가 들어오면 3자리마다 ,를 자동으로 넣어준다. 소수점 자리 개수 설정도 가능.
		
		
		
	}
	
	public static void main(String[] args) {
		new UseDemicalFormat();
	}

}
