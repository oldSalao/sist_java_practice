package day0119;
/**
시프트 연산자.
<<, >>, >>>
*/
class Operator3{
	public static void main(String[] args){
		int i = 6;

		System.out.println(i + " << 3 = " + (i << 3));
		
		i = 39;
		
		System.out.println(i + " >> 2 = " + (i >> 2));
		
		i = 45;
		
		System.out.println(i + " >>> 3 = " + (i >>> 3));

		System.out.println("1를 << 31 = " + (1<<31)); //부호비트가 1로 바뀌기 때문에 음수가 출력된다.

		i = -12;

		System.out.println(i + " 를 >>100 = " + (i >> 100)); //빈칸이 1로 채워지기 때문에 결국 -1 출력
        
		i=-1;
		System.out.println(i + " 를 >>>1 = " + (i >>>1 ));
		
	}//main
}//class