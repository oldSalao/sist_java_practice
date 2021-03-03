package day0216;

/**
 * 사용자정의 데이터형으로 만든 클래스를 사용.
 * 
 * @author user
 */
public class UseStudentVo {

	public static void main(String[] args) {
		// 번호 : 1, 이름 : 이하늘, 나이 : 20, 키 : 185.8 => 매개변수 있는 생성자.
		StudentVo sv = new StudentVo(1,"이하늘",20,185.8);

		// 번호 : 2, 이름 : 박기범(모든 데이터를 알지 못하는 상황) => 기본생성자.
		StudentVo sv2 = new StudentVo();
		sv2.setReginum(2);
		sv2.setName("박기범");
		
		System.out.println(sv.toString());
		System.out.println(sv2.toString());
		
		//여러학생의 정보를 저장하고 처리하려면 사용자정의 데이터형으로 배열을 생성하면 된다.
		
		//1,이하늘,20,185.8
		//2,박기범,25,170.3
		//3,강인섭,26,178
		
		StudentVo[] svArr = new StudentVo[3];
		
		svArr[0] = sv;
		svArr[1] = sv2;
		svArr[1].setAge(25);
		svArr[1].setHeight(170.3);
		//아래와 같이 해도 문제 x.
//		sv2.setAge(25);
//		sv2.setHeight(170.3);
		svArr[2] = new StudentVo(3,"강인섭",26,178);
		
		for(StudentVo element : svArr) {
			System.out.printf("번호 : %d, 이름 : %s, 나이 : %d, 키 : %.1f \n",element.getReginum(),element.getName(),element.getAge(),element.getHeight());
		}
	}

}
