package day0118;
/**
 강제 형변환.<br/>
 값을 해당 행에서만 일시적으로 다른 값으로 변경해야할 때 사용.<br/>
 (변환할 데이터형)값
*/
class Casting{
	public static void main(String[] args) {
		char c = 'A';
		System.out.println(c + "의 Unicode 값 " + (int)c );

		float f = (float)2021.01;//실수 literal은 그대로 두고 할당할 때 값을 float으로 변경.
		System.out.println(f);

		int i = (int)f;//byte 수는 같지만 실수 변수가 정수 변수로 할당될 수 없다. 따라서 (int)로 casting을 해준다. (값 손실 발생)
		System.out.println("강제 형변환 된 값 : " + i + " 원본 값 : " + f);

		double d = 1.111111111111111;
		f = (float)d;//값 손실(올림) 발생.
		System.out.println("강제 형변환 된 값 : " + f + " 원본 값 : " + d);

		/////////////////////////////////casting error//////////////////////////////////////
		String s = "2021";
		i = Integer.parseInt(s); // String을 int로 casting은 불가능하지만 Integer.parseInt(string)을 사용하면 가능하다.
		System.out.println(i);

		boolean b = false;
		//i = (int)b; // boolean은 다른 형으로 변경할 수 없다.
		System.out.println(b);

		byte num1 = 10;
		byte num2 = 20;
		byte result = (byte)(num1+num2);

		System.out.println(num1 + " + " + num2 + " = " + result);

	}//main
}//class