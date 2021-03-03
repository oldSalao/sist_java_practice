package day0218;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;
import java.util.Vector;

/**
 * java.util.List의 사용.<br>
 * 1차원 배열처럼 생성. 가변길이형(데이터를 추가하면 길이가 늘어나고, 데이터를 삭제하면 길이가 줄어든다.)<br>
 * 모든 데이터형을 저장할 수 있으나, Generic을 사용하면 입력 데이터의 제한을 설정할 수 있다.<br>
 * 검색의 기능이 있으며, 중복데이터를 저장할 수 있다.<br>
 * 추가된 데이터는 가장 뒤에 붙는다.<br>
 * 기존의 데이터사이에 데이터를 추가할 때에는 LinkedList를 사용하는 것이 좋다.
 * 
 * @author user
 */
public class UseList {

	/**
	 * Multi thread에서 동시접근 가능.
	 */
	public void useArrayList() {
		// 1.생성
		List<String> list = new ArrayList<String>(30);
		// 2.크기 : size() => 방에 값이 있는 것만 크기에 포함시킨다.
		System.out.println(list.size());
		// 3.값 할당 : 값은 항상 뒤로 추가된다. 중복값을 저장할 수 있다.

		list.add("자바");
		list.add("오라클");
		list.add("JDBC");
		list.add("HTML");
		list.add("오라클"); // 중복값 저장 허용.
		list.add("CSS");
		list.add("JavaScript");

		System.out.println(list + " / " + list.size());
		// 4. 배열로 복사
		// Generic과 동일한 데이터형, 리스트의 크기대로 배열을 생성한다.

		String[] subjectArr = new String[list.size()];

		list.toArray(subjectArr);

		// 4.값 삭제 : 방의 크기가 줄어든다.

		// 인덱스로 삭제

		list.remove(3);

		System.out.println(list + " / " + list.size());

		// 방의 값과 같은 객체를 넣어 삭제 : 가장 먼저 일치하는 방의 값 하나만 삭제.

		list.remove("오라클");

		System.out.println(list + " / " + list.size());

		// 5.일괄처리 : list는 인덱스를 사용할 수 있고, 검색의 기능이 있으므로 일괄처리를 할 수 있다.

		String temp = "";

		for (int i = 0; i < list.size(); i++) {
			temp = list.get(i);
			System.out.println(temp);
		}

		// 개선된 for

		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("----------------------------복사된 값 출력 -------------------------------");
		for (String str : subjectArr) {
			System.out.printf("%s ", str);
		}
		System.out.println();

	}

	/**
	 * Multi thread에서 동시접근 불가능.
	 */
	public void useVector() {
		// 1.생성
		List<String> list = new Vector<String>(30);
		// 2.크기 : size() => 방에 값이 있는 것만 크기에 포함시킨다.
		System.out.println(list.size());
		// 3.값 할당 : 값은 항상 뒤로 추가된다. 중복값을 저장할 수 있다.

		list.add("자바");
		list.add("오라클");
		list.add("JDBC");
		list.add("HTML");
		list.add("오라클"); // 중복값 저장 허용.
		list.add("CSS");
		list.add("JavaScript");

		System.out.println(list + " / " + list.size());
		// 4. 배열로 복사
		// Generic과 동일한 데이터형, 리스트의 크기대로 배열을 생성한다.

		String[] subjectArr = new String[list.size()];

		list.toArray(subjectArr);

		// 4.값 삭제 : 방의 크기가 줄어든다.

		// 인덱스로 삭제

		list.remove(3);

		System.out.println(list + " / " + list.size());

		// 방의 값과 같은 객체를 넣어 삭제 : 가장 먼저 일치하는 방의 값 하나만 삭제.

		list.remove("오라클");

		System.out.println(list + " / " + list.size());

		// 5.일괄처리 : list는 인덱스를 사용할 수 있고, 검색의 기능이 있으므로 일괄처리를 할 수 있다.

		String temp = "";

		for (int i = 0; i < list.size(); i++) {
			temp = list.get(i);
			System.out.println(temp);
		}

		// 개선된 for

		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("----------------------------복사된 값 출력 -------------------------------");
		for (String str : subjectArr) {
			System.out.printf("%s ", str);
		}
		System.out.println();

	}

	public void useLinkedList() {
		// 1.생성 LinkedList는 capacity 설정 불가.
		List<String> list = new LinkedList<String>();
		// 2.크기 : size() => 방에 값이 있는 것만 크기에 포함시킨다.
		System.out.println(list.size());
		// 3.값 할당 : 값은 항상 뒤로 추가될 수도 있고 중간에 삽입될 수도 있다. 중복값을 저장할 수 있다.

		list.add("자바");
		list.add("오라클");
		list.add("JDBC");
		list.add(1,"HTML");
		list.add("오라클"); // 중복값 저장 허용.
		list.add(4,"CSS");
		list.add("JavaScript");

		System.out.println(list + " / " + list.size());
		// 4. 배열로 복사
		// Generic과 동일한 데이터형, 리스트의 크기대로 배열을 생성한다.

		String[] subjectArr = new String[list.size()];

		list.toArray(subjectArr);

		// 4.값 삭제 : 방의 크기가 줄어든다.

		// 인덱스로 삭제

		list.remove(3);

		System.out.println(list + " / " + list.size());

		// 방의 값과 같은 객체를 넣어 삭제 : 가장 먼저 일치하는 방의 값 하나만 삭제.

		list.remove("오라클");

		System.out.println(list + " / " + list.size());

		// 5.일괄처리 : list는 인덱스를 사용할 수 있고, 검색의 기능이 있으므로 일괄처리를 할 수 있다.

		String temp = "";

		for (int i = 0; i < list.size(); i++) {
			temp = list.get(i);
			System.out.println(temp);
		}

		// 개선된 for

		for (String str : list) {
			System.out.println(str);
		}

		System.out.println("----------------------------복사된 값 출력 -------------------------------");
		for (String str : subjectArr) {
			System.out.printf("%s ", str);
		}
		System.out.println();

	}

	public static void main(String[] args) {
		UseList ul = new UseList();

		System.out.println("------------------ArrayList-----------------------");

		ul.useArrayList();

		System.out.println("------------------Vector-----------------------");

		ul.useVector();

		System.out.println("------------------LinkedList-----------------------");

		ul.useLinkedList();
	}

}
