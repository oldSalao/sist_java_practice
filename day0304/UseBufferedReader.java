package day0304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * 키보드에 입력된 데이터를 JVM내부로 읽어들이기<br>
 * @author user
 */
public class UseBufferedReader {
	
	public UseBufferedReader() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputText = null;
		System.out.printf("입력 : ");
		inputText = br.readLine();
		System.out.println("출력 : " + inputText);
		br.close();
	}

	public static void main(String[] args){
		try {
			new UseBufferedReader();
		}
		catch(IOException e) {
			e.printStackTrace();
		}
		
	}
}
