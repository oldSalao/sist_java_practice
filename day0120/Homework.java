package day0120;

public class Homework {
	public static void main(String[] args) {
		
		////////////////////// 1/////////////////////
		int i = 2, j = 5;
		boolean flag1 = false, flag2 = false, flag3 = (flag1 = i > 1) || (flag2 = j > 0);
		System.out.println("flag1 = " + flag1 + ", flag2 = " + flag2 + ", flag3 = " + flag3);

		///////////////////// 2//////////////////////
		j = -3;
		i = (j < 0) ? -j : j;
		System.out.println(i);
		
	}
}
