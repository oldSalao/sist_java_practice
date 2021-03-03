package day0118;
/**
 Constant 활용.
*/

class Homework{
	public static final int TOTAL_MONEY = 10000;
	public static void main(String[] args) {
		int transCost = 1250;
		int roundCost = transCost * 2;
		int lunchCost = 5000;
		int myMoney = TOTAL_MONEY-roundCost-lunchCost;

		System.out.println("하루 용돈 " + TOTAL_MONEY + "원 교통비 " + transCost + "원 왕복차비 " + roundCost + "원 점심값 " + lunchCost + "원 남은 용돈 " + myMoney + "원 입니다.");
	}
}
