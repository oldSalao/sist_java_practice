package day0222;

import java.util.ArrayList;
import java.util.List;

public class ArrayListEx {

	public static void main(String[] args) {
		List<Integer> list = new ArrayList<Integer>();
		for(int i = 1; i<21; i++) {
			list.add(i);
		}
		
		for(int i = 0; i<list.size(); i++) {
			if(list.get(i)%2!=0) {
				System.out.println(list.get(i));
			}
		}
		
//		for(int i = 0; i<list.size(); i++) {
//			if(list.get(i)%2==0) {
//				list.remove(i);
//			}
//		}
//		for(int temp : list) {
//			System.out.println(temp);
//		}
	}

}
