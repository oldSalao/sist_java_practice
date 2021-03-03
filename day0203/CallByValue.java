package day0203;

public class CallByValue {
	
	public void swap (int i, int j) {
		int temp = 0;
		temp = i;
		i = j;
		j = temp;
		System.out.println("swap 메소드 안 i : " + i + ", j : " + j);
	}

	public static void main(String[] args) {
		CallByValue cbv = new CallByValue();
		int i = 100;
		int j = 200;
		System.out.println("swap 전 i : " + i + ", j : " + j);
		cbv.swap(i, j);
		System.out.println("swap 후 i : " + i + ", j : " + j);
	}

}
