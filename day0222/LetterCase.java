package day0222;

public class LetterCase {

	public static char caseChange(char letter) {
		char answer=' ';
		//대문자인 경우.
		if(letter>64&&letter<91) {
			letter+=32;
		}
		//소문자인 경우
		else if(letter>96&&letter<123) {
			letter-=32;
		}
		answer = letter;
		return answer;
	}
	
	public static void main(String[] args) {
		System.out.println(caseChange('g'));
	}

}
