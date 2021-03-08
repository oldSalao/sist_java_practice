package day0308;

import java.awt.FileDialog;
import java.awt.FlowLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;

@SuppressWarnings("serial")
public class FileCopy extends JFrame implements ActionListener {

	private JButton jbtn16bitStream, jbtn8bitStream;

	public FileCopy() {
		super("파일 복사");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());

		jbtn16bitStream = new JButton("16비트 파일선택");
		jbtn8bitStream = new JButton("8비트 파일선택");
		jbtn16bitStream.addActionListener(this);
		jbtn8bitStream.addActionListener(this);
		add(jbtn16bitStream);
		add(jbtn8bitStream);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		FileDialog fd = new FileDialog(this, "열기", FileDialog.LOAD);
		fd.setLocationRelativeTo(this);
		fd.setVisible(true);
		if (fd.getFile() != null) {
			String fileName = fd.getDirectory() + fd.getFile();

			if (ae.getSource() == jbtn16bitStream) {
				try {
					use16bit(fileName);
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
			if (ae.getSource() == jbtn8bitStream) {
				try {
					use8bit(fileName);
				} catch (IOException ioe) {
					ioe.printStackTrace();
				}
			}
		}
	}

	/**
	 * txt 파일은 잘 복사 되지만 다른 형식의 파일을 복사하여 실행하면 실행이 잘 되지 않는다.
	 * 
	 * @param fileName
	 * @throws IOException
	 */
	public void use16bit(String fileName) throws IOException {
		File file = new File(fileName);
		String cpFileName = fileName.substring(0, fileName.indexOf('.')) + "_cp.txt";
		FileReader fr = null;
		FileWriter fw = null;
		BufferedReader br = null;
		BufferedWriter bw = null;
		String temp = "";
		try {
			fr = new FileReader(file);
			fw = new FileWriter(cpFileName);
			br = new BufferedReader(fr);
			bw = new BufferedWriter(fw);

			while (((temp = br.readLine()) != null)) { // 2byte씩 읽어들여
				// 읽어들인 2byte를 스트림에 쓴다.
				bw.write(temp + "\n");
			}

			bw.flush();
			JOptionPane.showMessageDialog(this, cpFileName + " 파일로 복사되었습니다.");
		} finally {
			if (br != null) {
				br.close();
			}
			if (bw != null)
				bw.close();
		}
	}

	/**
	 * txt,jpg,ppxt등 다양한 형식의 파일의 복사가 잘 되고 실행도 가능하다.
	 * 
	 * @param fileName
	 * @throws IOException
	 */
	public void use8bit(String fileName) throws IOException {
		FileInputStream fis = null;
		FileOutputStream fos = null;
		File file = new File(fileName);
		String cpFileName = fileName.substring(0, fileName.indexOf('.')) + "_cp.txt";
		int temp = 0, len = 0;
		byte[] readData = new byte[512];

		try {
			fis = new FileInputStream(file);
			fos = new FileOutputStream(cpFileName);

///////////////////////////////////////////DISK IO가 많이 발생하는 코드/////////////////////////////////////////////
			
//			while (((temp = fis.read()) != -1)) { // HDD는 512byte를 읽어들이고 자바에서는 1byte씩 쓴다. 보통 이를 개선하기 위해서 byte 배열 사용.
//				읽어들인 1byte를 스트림에 쓴다.
//				fos.write(temp);
//			}
			
///////////////////////////////////////////DISK IO가 적게 발생하는 코드/////////////////////////////////////////////
			
			while ((len = fis.read(readData)) != -1) { // 512개의 방을 가진 배열에 데이터를 채우고 채워진 방의 갯수를 반환. 즉 조건은 읽어들인 방이 있다면.
//				byte 배열을 사용한 방식. 데이터를 가진 배열의 처음방부터 데이터가 채워진 방까지 쓴다.
				fos.write(readData, 0, len);//배열의 처음 방에서 읽어들인 방까지 기록.
			}
			fos.flush();
			JOptionPane.showMessageDialog(this, cpFileName + " 파일로 복사되었습니다.");
		} finally {
			if (fis != null) {
				fis.close();
			}
			if (fos != null) {
				fos.close();
			}
		}
	}

	public static void main(String[] args) {
		new FileCopy();
	}

}
