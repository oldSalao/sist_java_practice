package day0217;

public class Homework2 {

	public static int[] lotto() {
		int[] lottoNum = new int[6];
		int ran = 0;
		boolean isNumOverlap = false;

		for (int i = 0; i < lottoNum.length; i++) {

			ran = (int) ((Math.random() * 45) + 1);

			if (i == 0) {
				lottoNum[i] = ran;
			} else {
				for (int j = 0; j < i; j++) {
					if (ran == lottoNum[j]) {
						isNumOverlap = true;
						break;
					}
				}
				if (isNumOverlap) {
					i--;
					isNumOverlap = false;
				} else {
					lottoNum[i] = ran;
				}
			}
		}
		

		return lottoNum;
	}

	public static void main(String[] args) {
		int[] lotto = lotto();
		for (int num : lotto) {
			System.out.print(num + " ");
		}
	}

}
