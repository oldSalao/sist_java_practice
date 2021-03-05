package day0305;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.NotSerializableException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

/**
 * Object Stream을 사용하여 객체를 JVM 외부로 내보내거나,(ObjectOutputStream - marshaling)<br>
 * JVM외부에 존재하는 객체를 JVM 내부로 읽어들이기 위한 일(ObjectInputStream - unmarshaling)
 * 
 * @author user
 */
public class UseMarshalStream {

	public UseMarshalStream() {
	}

	/**
	 * 객체를 생성하여 스트림으로 내보내기
	 */
	public void useObjectOutputStream() throws FileNotFoundException, NotSerializableException, IOException {
		// IOExeption이 상위 Exception이기 때문에 IOException만 throws 해줘도 됨.
		MyData md = new MyData("이하늘", 185, 89.5);
		ObjectOutputStream oos = null;
		try {
			// 1.스트림 생성
			oos = new ObjectOutputStream(new FileOutputStream("C:\\dev\\temp1\\obj.dat"));
			// 2.객체를 스트림에 쓴다.
			oos.writeObject(md);
			// 3.스트림에 기록된 내용을 목적지로 분출.
			oos.flush();
			System.out.println("객체가 JVM외부로 나갔음.");
		} finally {
			if (oos != null) {
				oos.close();
			}
		}
	}

	/**
	 * 스트림을 사용하여 객체를 읽어들이기.
	 */
	public void useObjectInputStream()
			throws FileNotFoundException, NotSerializableException, IOException, ClassNotFoundException {
		ObjectInputStream ois = null;

		try {
			// 1.객체를 읽어들일 수 있는 스트림 생성
			ois = new ObjectInputStream(new FileInputStream("C:\\dev\\temp1\\obj.dat"));
			// 2.객체 읽기
			MyData md = (MyData) ois.readObject();
			System.out.println(md);
		} finally {
			if (ois != null) {
				ois.close();
			}
		}

	}

	public static void main(String[] args) {
		UseMarshalStream ums = new UseMarshalStream();
		try {
//			ums.useObjectOutputStream();
			ums.useObjectInputStream();
		} catch (NotSerializableException e) {
			System.err.println("직렬화 안됨.");
			e.printStackTrace();
		} catch (FileNotFoundException e) {
			System.err.println("경로가 잘못됨.");
			e.printStackTrace();
		} catch (ClassNotFoundException e) {
			System.err.println("클래스를 찾을 수 없음.");
			e.printStackTrace();
		}catch (IOException e) {
			System.err.println("쓰는 도중에 문제 발생.");
			e.printStackTrace();
		}
	}

}
