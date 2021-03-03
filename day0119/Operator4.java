package day0119;
/**
관계 연산자
>, <, >=, <=, ==, !=
*/
class Operator4{
	public static void main(String[] args){
		int i = 10, j = 5, k = 10;
		System.out.println(i + " == " + j + " = " + (i == j)); // false
		System.out.println(i + " == " + k + " = " + (i == k)); // true

		System.out.println(i + " != " + j + " = " + (i != j)); // true
		System.out.println(i + " != " + k + " = " + (i != k)); // false
	}//main
}//class
