package day0122;

/**
 * 반복문 : 특정 코드를 여러번 실행 시키는 문장.<br>
 * for : 시작과 끝을 알때 사용하는 반복문. <br>
 * 문법)<br>
 * 	for(초기값 ; 조건식 ; 증,감소식){<br>
 * 		반복수행문장들..<br>
 * 	}
 * @author user
 */
public class TesrFor {

	public static void main(String[] args) {
		for(int i = 0; i<10; i++) {
		System.out.println("안녕하세요?");
		}
		
		for(int i = 1; i<101; i++) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i = 100; i > 0; i--) {
			System.out.print(i+" ");
		}
		
		System.out.println();
		
		for(int i = 1; i < 101; i++) {
			if(i%2!=0) {
				System.out.print(i+" ");
			}
		}
		
		System.out.println();
		
		for(int i = 1; i<10; i++) {
			System.out.println("2 * " + i + " = " + (i * 2));
		}
		
		for(int i = 65; i<91; i++) {
			System.out.println((char)i);
		}
		
		System.out.println();
		
		for(int i = 1; i < 65536; i++) {
			if((i>47&&i<58)||(i>64&&i<91)||(i>96&&i<123)) {
				System.out.print((char)i+" ");
			}
		}
		
		System.out.println("\n");
		
		int sum = 0;
		
		for(int i = 1; i<101; i++) {
			sum+=i;
		}
		
		System.out.println(sum);
	}

}
