package day0203;

public class UseArray {

	public void max() {
		int[] temp = {87,74,99,45,69};
		int max = temp[0];
		for(int i = 0; i < temp.length; i++) {
			System.out.println();
			if(max < temp[i]) {
				max = temp[i];
			}
		}
		System.out.println("최고점수 : " + max);
	}
	
	public void min() {
		int[] temp = {87,74,99,45,69};
		int min = temp[0];
		for(int i = 0; i<temp.length;i++) {
			if(min>temp[i]) {
				min = temp[i];
			}
		}
		System.out.println("최저점수 : "+min);
	}
	
	public void sort() {
		int[] score = {87,74,99,45,69};
		
		int temp = 0;
		for(int i = 0; i < score.length; i++) {
			for(int j = i+1; j < score.length; j++) {
				System.out.print(i + " " + j + " ");
				if(score[i] < score[j]) {
					temp = score[i];
					score[i] = score[j];
					score[j] = temp;
				}
			}
			System.out.println();
		}
		
		for(int i = 0; i<score.length; i++) {
			System.out.print(score[i] + " ");
		}
	}
	
	public static void main(String[] args) {
		UseArray ua = new UseArray();
		ua.max();
		ua.min();
		ua.sort();
	}

}
