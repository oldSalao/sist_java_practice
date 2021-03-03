package day0127;

public class Homework {

	public int hw1(int num) {
		int sum = 0;
		for (int i = 1; i < num + 1; i++) {
			sum += i;
		}
		return sum;
	}

	public void hw2(int num) {
		int sum = 0;
		if (num > 10) {
			for (int i = 1; i < num + 1; i++) {
				if (i % 3 == 0) {
					sum += i;
				}
			}
			System.out.println(sum);
		} else {
			System.out.println("10보다 큰 값을 입력해주세요");
		}
		System.out.println();
	}

	public int hw3(int age) {
		return (2021 - age + 1);
	}

	public void hw4() {
		for (int i = 1; i < 10; i++) {
			for (int j = 2; j < 10; j++) {
				System.out.print(j + " * " + i + " = " + (j * i) + "\t");
			}
			System.out.println();
		}
		System.out.println();
	}
	
	public void hw4(int num) {
		for (int i = 1; i<10; i++) {
			System.out.println(num + " * " + i + " = " + (num*i));
		}
	}
	

	public static void main(String[] args) {
		Homework hw = new Homework();
		System.out.println(hw.hw1(5));
		System.out.println();
		hw.hw2(15);
		System.out.println(hw.hw3(26));
		System.out.println();
		hw.hw4();
		hw.hw4(5);
	}

}
