package day0217;

public class Homework1 {

	public static final int NUM = 0;
	public static final int UP = 1;
//	public static final int LOW = 2;

	public static char[] createPwd() {

		char[] pwd = new char[8];
		int sel = 0;

		for (int i = 0; i < pwd.length; i++) {

			sel = (int) (Math.random() * 3);

			if (sel == NUM) {
				pwd[i] = (char) ((int) (Math.random() * 10 + 48));
			} else if (sel == UP) {
				pwd[i] = (char) ((int) (Math.random() * 26 + 65));
			} else {
				pwd[i] = (char) ((int) (Math.random() * 26 + 97));
			}
		}

		return pwd;
	}
	
	public static char[] createPwd1() {
		char[] tempPass = new char[8];
		char[] password = {'A','B','C','D','E','F','G','H','I','J','K','L','M','N'
,'O','P','Q','R','S','T','U','V','W','X','Y','Z','a','b','c','d','e','f','g','h','i','j','k','l','m','n'
,'o','p','q','r','s','t','u','v','w','x','y','z'};
		
		for(int i = 0; i<tempPass.length;i++) {
			tempPass[i]=password[(int)(Math.random()*password.length)];
		}
		
		return tempPass;
	}
	
	public static char[] createPwd2() {
		char[] tempPass = new char[8];
		String passwordSet = "1234567890-=\\qwertyuiop[]asdfghjkl;'zxcvbnm,./!@#$%^&*()_+|QWERTYUIOP{}ASDFGHJKL:\"ZXCVBNM<>?";
		for(int i = 0; i<tempPass.length;i++) {
			tempPass[i]=passwordSet.charAt((int)(Math.random()*passwordSet.length()));
		}
		
		return tempPass;
	}

	public static void main(String[] args) {
		char[] pwd = createPwd();

		for (char c : pwd) {
			System.out.print(c);
		}
		System.out.println("\n-------------------------------------------------");
		pwd = createPwd1();
		for (char c : pwd) {
			System.out.print(c);
		}
		
		System.out.println("\n-------------------------------------------------");
		pwd = createPwd2();
		for (char c : pwd) {
			System.out.print(c);
		}
	}

}
