package day0217;

import java.text.DecimalFormat;

/**
 * ��������.
 * @author user
 */
public class UseDemicalFormat {

	public UseDemicalFormat() {
		int i = 1_000_000; // JDK1.7 ���� �����Ǵ� ���. _�� ��������� �ڸ��� ����, ������ ���.
		System.out.println(i);//_�� ��µ��� �ʴ´�.
		
		DecimalFormat df = new DecimalFormat("0,000,000");
		DecimalFormat df1 = new DecimalFormat("#,###,###");
		
		System.out.println(df.format(2021));
		System.out.println(df1.format(2021));
		
		DecimalFormat df2 = new DecimalFormat("#,###.000");
		System.out.println(df2.format(20212021.2021)); // �ڸ����� �ʰ��ϴ� ���ڰ� ������ 3�ڸ����� ,�� �ڵ����� �־��ش�. �Ҽ��� �ڸ� ���� ������ ����.
		
		
		
	}
	
	public static void main(String[] args) {
		new UseDemicalFormat();
	}

}
