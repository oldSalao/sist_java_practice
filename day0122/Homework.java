package day0122;

public class Homework {
	
	public static final int BUS = 1200;
	public static final int TRAIN = 1300;
	public static final int TAXI = 3800;
	
	public static void main(String[] args) {
		
		/////////////////////////////////1///////////////////////////
		int distance = Integer.parseInt(args[1]);
		int pay = 0;
		int totalPay = 0;
		
		if(args[0].equals("����")||args[0].equals("����ö")||args[0].equals("�ý�")) {
			if(args[0].equals("����")) {
				pay = BUS;
			}
			else if(args[0].equals("����ö")) {
				pay = TRAIN;
			}
			else {
				pay = TAXI;
			}
			if(distance>10) {
				totalPay = pay + ((distance-10)/5) * 100;
			}
			System.out.println("�Է±������ " + args[0] + "�̰�, �⺻��� " + pay + "�� �Դϴ�.");
			System.out.println("�̵��Ÿ� " + distance + "km �̰�, �� ����� " + totalPay + "�� �Դϴ�.");			
		}
		else {
			System.out.println("�Է��Ͻ� ��������� ���߱����� �ƴմϴ�.");
		}
		
		/////////////////////////////2//////////////////////////////////////
		
		System.out.println("\n");
		
		for(int i = 1; i<101; i++) {
			if((i%3)==0) {
				System.out.print("¦ ");
			}
			else {
				System.out.print(i + " ");
			}
		}
		
	}

}
