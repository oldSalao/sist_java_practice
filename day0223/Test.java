package day0223;

import java.util.ArrayList;
import java.util.List;

public class Test {

	public static void main(String[] args) {
		List<String> slist = new ArrayList<String>();
	      for (int i = 97; i < 123; i++) { //아스키코드 관련 참고
	         slist.add(Character.toString((char)i));
	      }
	      for(int i =0; i<slist.size();i++) {
	    	  System.out.println(slist.get(i));
	      }
	}
}
