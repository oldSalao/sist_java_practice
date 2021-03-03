package day0218;

import java.util.Random;

public class UseRandom {

	public UseRandom() {
		// 1. 객체화
//		Random random = new Random((int)(Math.random()*100));//seedRandom.
		Random random = new Random();
		// 2. 일
		// 정수난수 얻기
		int i = random.nextInt();
		System.out.println("발생된 난수 : " + i);
		System.out.println("범위를 지닌 난수 : " + Math.abs(i % 10));

		int j = random.nextInt(10);
		System.out.println("발생된 난수 : " + j);

		// 실수난수 얻기
		double d = random.nextDouble();
		System.out.println("발생된 실수 : " + d);
		System.out.println("범위를 지닌 실수 : " + (int) ((d * 5) + 1));
		
		//불리언난수 얻기
		boolean b = random.nextBoolean();
		System.out.println("발생된 불리언 : " + b);
	}

	public static void main(String[] args) {
		new UseRandom();
	}

}
