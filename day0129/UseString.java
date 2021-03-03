package day0129;

/**
 * 문자열(String)의 주소를 저장하고 사용할 수 있는 java.lang.String 클래스의 사용.<br>
 * 문자열 저장소에 동일 문자열은 하나만 생성되고 그 주소를 사용함.
 * @author user
 *
 */
public class UseString {

	public static void main(String[] args) {
		//기본형 형식. (new를 사용하지 않고 java.lang.String 클래스를 사용.)
		String str = "AbcdEf";
		System.out.println(str);
		System.out.println("기본형 형식 == 비교 "+(str == "AbcdEf"));
		System.out.println("기본형 형식 equals 비교 "+(str.equals("AbcdEf")));
		
		//참조형 형식 (new를 사용하여 java.lang.String 클래스를 사용.)
		String str1 = new String("AbcdEf");
		System.out.println(str1);
		System.out.println("참조형 형식 == 비교 " + (str1 == "AbcdEf"));
		System.out.println("참조형 형식 equals 비교 " + (str1.equals("AbcdEf")));
	}
}