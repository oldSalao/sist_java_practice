package day0304;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;


/**
 * Ű���忡 �Էµ� �����͸� JVM���η� �о���̱�<br>
 * @author user
 */
public class UseBufferedReader {
	
	public UseBufferedReader() throws IOException{
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String inputText = null;
		System.out.printf("�Է� : ");
		inputText = br.readLine();
		System.out.println("��� : " + inputText);
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
