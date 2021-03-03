package day0219;

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * 검색의 기능이 없으며, 중복데이터를 저장하지 않는 Set 사용.
 * @author user
 */
public class UseSet {
	
	public UseSet() {
		//1. 생성.
		Set<String> set = new HashSet<String>();
		
		//2.값할당 : 값은 순서대로 입력되지 않는다.
		
		set.add("1.자바");
		set.add("2.오라클");
		set.add("3.JDBC");
		set.add("4.HTML");
		set.add("5.CSS");
		set.add("6.JavaScript");
		set.add("7.Servlet");
		set.add("2.오라클");
		
		System.out.println(set + " / " + set.size());
		
		//배열로 복사.
		//set의 크기로 배열을 생성.
		String[] setArr= new String[set.size()];
		
		set.toArray(setArr);
		
		for(String str : setArr) {
			System.out.print(str + " ");
		}
		
		System.out.println();
		
		//3.값 삭제
		set.remove("6.JavaScript");
		
		System.out.println(set + " / " + set.size());
		
		//모든방 값 삭제.
		//set.clear();
		
		//4.검색. => Iterator를 사용
		Iterator<String> iter = set.iterator();
		
		while(iter.hasNext()) {
			System.out.print(iter.next() + " ");
		}
		System.out.println();
		System.out.println("----------------------------------------------");
		//set은 일반 for문으로는 출력이 불가능. (get method가 없어서 출력 불가능 한것임.)
		//개선된 포문으로 출력가능.
		for(String temp : set) {
			System.out.print(temp + " ");
		}
		
		
	}

	public static void main(String[] args) {
		new UseSet();
	}

}
