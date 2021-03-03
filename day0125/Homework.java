package day0125;

/**
 * @author user
 *
 */
public class Homework {
	public static void main(String[] args) {
		////////////////////////////////////1//////////////////////////////////////////
		
		int i = 1, j = 2;
		while (i < 10) {
			System.out.print(j + " * " + i + " = " + (i * j) + "\t");
			j++;
			if (j == 10) {
				j = 2;
				i++;
				System.out.println();
			}
		}
		System.out.println();
		
		////////////////////////////////////2//////////////////////////////////////////
		
		int sum = 0;
		i = 1;
		while(i<101) {
			sum+=i;
			i++;
		}
		System.out.println(sum);
		
		System.out.println();
		
		////////////////////////////////////3//////////////////////////////////////////
		i=1;
		do {
			if(i==51) {
				break;
			}
			else if(i%2!=0) {
				i++;
				continue;
			}
			System.out.print(i + " ");
			i++;
		}while(i<101);
		
		System.out.println("\n");
		
		//////////////////////////////////////4/////////////////////////////////////////
		
		for(i = 0; i<5;i++) {
			for(j = 0; j < 5; j++) {
				if(((i>0)&&(i<4))&&((j>0)&&(j<4))) {
					System.out.print(0);
				}
				else {
					System.out.print(1);
				}
			}
			System.out.println();
		}
		
	}

}
