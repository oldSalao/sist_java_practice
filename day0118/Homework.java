package day0118;
/**
 Constant Ȱ��.
*/

class Homework{
	public static final int TOTAL_MONEY = 10000;
	public static void main(String[] args) {
		int transCost = 1250;
		int roundCost = transCost * 2;
		int lunchCost = 5000;
		int myMoney = TOTAL_MONEY-roundCost-lunchCost;

		System.out.println("�Ϸ� �뵷 " + TOTAL_MONEY + "�� ����� " + transCost + "�� �պ����� " + roundCost + "�� ���ɰ� " + lunchCost + "�� ���� �뵷 " + myMoney + "�� �Դϴ�.");
	}
}
