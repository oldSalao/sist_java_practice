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
		
		if(args[0].equals("버스")||args[0].equals("지하철")||args[0].equals("택시")) {
			if(args[0].equals("버스")) {
				pay = BUS;
			}
			else if(args[0].equals("지하철")) {
				pay = TRAIN;
			}
			else {
				pay = TAXI;
			}
			if(distance>10) {
				totalPay = pay + ((distance-10)/5) * 100;
			}
			System.out.println("입력교통수단 " + args[0] + "이고, 기본요금 " + pay + "원 입니다.");
			System.out.println("이동거리 " + distance + "km 이고, 총 요금은 " + totalPay + "원 입니다.");			
		}
		else {
			System.out.println("입력하신 교통수단은 대중교통이 아닙니다.");
		}
		
		/////////////////////////////2//////////////////////////////////////
		
		System.out.println("\n");
		
		for(int i = 1; i<101; i++) {
			if((i%3)==0) {
				System.out.print("짝 ");
			}
			else {
				System.out.print(i + " ");
			}
		}
		
	}

}
