package day0201;

/**
 * java.lang.String class ���
 * 
 * @author user
 */
public class UseString {

	public static void main(String[] args) {
//		�⺻�� ������ ���. new ��� x.
		String str = "AbcdEfAbz";
//		������ ������ ���. new ���.
		String str1 = new String("haneul656@gmail.com");

		System.out.println(str + "�� ���� : " + str.length());
		System.out.println(str1 + "�� ���� : " + str1.length());

		System.out.println(str + "�� ��� �빮�ڷ� : " + str.toUpperCase());
		System.out.println(str1 + "�� ��� �빮�ڷ� : " + str1.toUpperCase());

		System.out.println(str + "�� ��� �ҹ��ڷ� : " + str.toLowerCase());
		System.out.println(str1 + "�� ��� �ҹ��ڷ� : " + str1.toLowerCase());

		System.out.println(str.indexOf("A"));
		System.out.println(str.lastIndexOf("A"));

		str = "AbcdAbcdAbcd";
		System.out.println("indexOf -> 'c' : " + str.indexOf("c"));
		System.out.println("lastIndexOf -> 'c' : " + str.lastIndexOf("c"));

		str = "haneul656@google.com";
		if ((str.indexOf("@") != -1) && (str.indexOf(".") != -1)) {
			System.out.println("��ȿ");
		} else {
			System.out.println("��ȿ");
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
	 * ù���ڸ� �빮�ڷ� �ٲ۴�.
	 * 
	 * @param str ù���ڸ� �빮��, �������� �ҹ��ڷ� ������ ���ڿ�.
	 * @return ����� ���ڿ�.
	 */
	public String initCap(String str) {
		if ((str!=null) && (!str.isEmpty())) {
			// method chain
			// method�� ��ȯ���� �ִٸ� .�� ����Ͽ� �޼ҵ带 ��� �����Ͽ� ȣ���� �� �ִ�. ���� �������� �� method�� ��ȯ���� �ȴ�.
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
