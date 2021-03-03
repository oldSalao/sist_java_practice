package day0118;
/**
코딩창에서 다양한 진수의 사용<br/>
8진수 : 0을 붙여 사용.<br/>
16진수 : 0x를 붙여 사용.<br/>
*/

class Radix{
	public static void main(String[] args) {
		//코딩창에서 어떤 진수를 사용하더라도 2진수로 저장되고 사용되기 때문에 다른 진수끼리 연산 가능.
		int i = 10;// 10진수 (Decimal) 
		int j = 012;// 8진수 (Octal) 
		int k = 0xa;// 16진수 (Hex) 

		//진수가 달라도 연산 가능. 저장된 2진수를 10진수로 출력.
		System.out.println("10진수 : " + i + ", 8진수 : " + j + ", 16진수 : " + k + ", 합 : " + (i + j + k));

	}//main
}//class