package day0222;

import java.util.ArrayList;
import java.util.Calendar;
import java.util.List;

/**
 * 학생정보를 저장하는 클래스를 사용하여, 학생정보를 처리하는 일을 구현한 클래스.<br>
 * 
 * @author user
 */
public class ProcessStudent {

	/**
	 * 학생의 정보를 리스트에 담아서 반환.
	 * 
	 * @return
	 */
	public List<StudentVO> setStudentInfo() {

		List<StudentVO> list = new ArrayList<StudentVO>();

		// 리스트에 데이터를 추가.
		list.add(new StudentVO("강인섭,25,서울시 강남구 역삼동,남,97"));
		list.add(new StudentVO("곽범수,27,서울시 강남구 논현동,남,81"));
		list.add(new StudentVO("권예원,26,서울시 동작구 상도동,여,90"));
		list.add(new StudentVO("김덕영,30,경기도 수원시 영통구,남,82"));
		list.add(new StudentVO("석지원,25,인천광역시 부평구 부평동,여,88"));

		return list;
	}

	/**
	 * 학생의 정보를 사용하여 출력하는 일. (단순번호,태어난해를 출력.)
	 * 
	 * @param list
	 */
	public void printStudentInfo(List<StudentVO> list) {
		System.out.println("번호\t이름\t나이\t태어난해\t\t주소\t\t자바점수");
		System.out.println("----------------------------------------------------------------------");

		Calendar cal = Calendar.getInstance();// 추상클래스이므로 new 로 객체화하지 않는다.
		int nowYear = cal.get(Calendar.YEAR);

		StudentVO sVO = null;// 리스트의 Element 값을 저장하기 위한 객체.

		if (list.isEmpty()) {
			System.out.println("데이터가 없습니다.");
		}
		for (int i = 0; i < list.size(); i++) {
			sVO = list.get(i);// index에 해당하는 학생정보 하나 얻기.
			System.out.printf("%d\t%s\t%d\t%d\t%13s\t%d \n", i + 1, sVO.getName(), sVO.getAge(),
					nowYear - sVO.getAge() + 1, sVO.getAddress(), sVO.getScore());
		}
	}

	/**
	 * 학생의 정보를 사용하여 성별에 대한 구분 출력을 하는 일.
	 * 
	 * @param list   학생의 정보를 담은 리스트.
	 * @param gender 출력할 성별.
	 */
	public void printStudentGenderType(List<StudentVO> list, String gender) {
		System.out.println("-------------------------------------------------------------");
		System.out.println("이름\t나이\t\t주소\t\t성별\t점수");
		System.out.println("-------------------------------------------------------------");
		//입력된 성별이 남 또는 여가 아니라면 기본값으로 남을 넣어준다.
		if(!(gender.equals("남")||gender.equals("여"))) {
			gender="남";
		}
		
		for(StudentVO sVO : list) {
			if(sVO.getGender().equals(gender)) {
				System.out.printf("%s\t%d\t%13s\t%s\t%d\n", sVO.getName(), sVO.getAge(),
						sVO.getAddress(), sVO.getGender(),sVO.getScore());
			}
		}
		if(list.isEmpty()) {
			System.out.println("데이터가 없습니다.");
		}
	}

	public static void main(String[] args) {
		ProcessStudent ps = new ProcessStudent();
		List <StudentVO> list = ps.setStudentInfo();
		ps.printStudentInfo(list);
		ps.printStudentGenderType(list, "여");
	}

}
