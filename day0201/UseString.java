package day0201;

/**
 * java.lang.String class 사용
 * 
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
//		기본형 형식의 사용. new 사용 x.
		String str = "AbcdEfAbz";
//		참조형 형식의 사용. new 사용.
		String str1 = new String("haneul656@gmail.com");

		System.out.println(str + "의 길이 : " + str.length());
		System.out.println(str1 + "의 길이 : " + str1.length());

		System.out.println(str + "을 모두 대문자로 : " + str.toUpperCase());
		System.out.println(str1 + "을 모두 대문자로 : " + str1.toUpperCase());

		System.out.println(str + "을 모두 소문자로 : " + str.toLowerCase());
		System.out.println(str1 + "을 모두 소문자로 : " + str1.toLowerCase());

		System.out.println(str.indexOf("A"));
		System.out.println(str.lastIndexOf("A"));

		str = "AbcdAbcdAbcd";
		System.out.println("indexOf -> 'c' : " + str.indexOf("c"));
		System.out.println("lastIndexOf -> 'c' : " + str.lastIndexOf("c"));

		str = "haneul656@google.com";
		if ((str.indexOf("@") != -1) && (str.indexOf(".") != -1)) {
			System.out.println("유효");
		} else {
			System.out.println("무효");
		}

		System.out.println(str.charAt(9));

		str1 = "abcdef";

		System.out.println(str1.substring(2, 5));

		System.out.println(str.substring(0, str.indexOf("@")));
		System.out.println(str.substring(str.indexOf("@") + 1));

		str1 = str.concat(" added");
		System.out.println(str1);

		str = "    A BC    ";
		System.out.println(str.trim());
		System.out.println("[" + str + "][" + str.trim() + "]");

		str = "Abcdef";
		String key = "Abc";

		System.out.println(str.startsWith(key));

		key = "cd";
		System.out.println(str.endsWith(key));

		System.out.println(str.contains(key));

		System.out.println(str.replaceAll(key, "kkk"));

		int i = 2021;
		str = String.valueOf(i);
		System.out.println(str);

		UseString s = new UseString();
		String name = null;
		System.out.println(s.initCap(name));
	}

	/**
	 * 첫글자를 대문자로 바꾼다.
	 * 
	 * @param str 첫글자만 대문자, 나머지는 소문자로 변경할 문자열.
	 * @return 변경된 문자열.
	 */
	public String initCap(String str) {
		if ((str!=null) && (!str.isEmpty())) {
			// method chain
			// method가 반환형이 있다면 .을 사용하여 메소드를 계속 연결하여 호출할 수 있다. 가장 마지막에 쓴 method가 반환값이 된다.
			String front = str.substring(0, 1).toUpperCase();
			String back = "";
			if (str.length() > 1) {
				back = str.substring(1, str.length()).toLowerCase();
				return (front + back);
			} else {
				return front;
			}
		} else {
			return str;
		}
	}
}
