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
		
		//���� : M - 1~9���� 1�ڸ��� ���. MM - 1~9������ 0�̺پ� ��µȴ�.
		//d - 1~9���� 1�ڸ��� ���, dd - 1~9�ϱ��� 0�� �پ ��µȴ�.
		//h,K - 1~9���� 1�ڸ��� ���, hh,KK - 1~9�ϱ��� 0�� �پ� ��µȴ�.
		//H,k - 24�ð����� ���. HH,kk - ����.
		//m�� mm, s �� ss
		
		SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd E���� a HH:mm:ss");
		
		System.out.println(sdf);
		System.out.println(sdf.format(date));
		System.out.println(sdf.toPattern());
		
		sdf.applyPattern("MM-dd-yyyy");
		
		System.out.println(sdf.format(date));
		
		//Locale Ŭ������ ���� ���Ǹ� �ٸ� ������ ��¥ �������� ����� ����
		SimpleDateFormat sdf1 = new SimpleDateFormat("yyyy-MM-dd EEEE a HH:mm:ss",Locale.JAPAN);
		System.out.println(sdf1.format(date));
	}
	
	public static void main(String[] args) {
		new UseSimpleDateformat();
	}
}
