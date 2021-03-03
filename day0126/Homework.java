package day0126;

/**
 *
 * @author user
 */
public class Homework {

	public void name(){
		System.out.println("이하늘");
	}
	
	public char firstInitial() {
		return 'L';
	}
	
	public void pointChk(int point) {
		if((point>0)&&(point<100)) {
			if(point>59) {
				System.out.println("합격");
			}
			else if(point>39) {
				System.out.println("다른 과목 참조");
			}
			else {
				System.out.println("과락");
			}
		}
		else {
			System.out.println("잘못된 점수");
		}
	}
	
	
	public void capChk(char c) {
		int temp = (int)c;
		if((temp>64)&&(temp<91)) {
			System.out.println("대문자");
		}
		else if((temp>96)&&(temp<123)) {
			System.out.println("소문자");
		}
		else if((temp>47)&&(temp<58)) {
			System.out.println("숫자");
		}
	}
	
	public int age(int year) {
		return((2021-year)+1);
	}
	
	public int numChk(int a, int b) {
		int big = 0;
		if(a>b) {
			big = a;
		}
		else {
			big = b;
		}
		return big;
	}
	//잘하셨어요
	public static void main(String[] args) {
		Homework hw = new Homework();
		hw.name();
		System.out.println(hw.firstInitial());
		hw.pointChk(40);
		hw.capChk('6');
		System.out.println(hw.age(1996));
		System.out.println(hw.numChk(2, 8));
	}

}
