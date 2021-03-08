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
		super("���� ����");
		setSize(500, 500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setLayout(new FlowLayout());

		jbtn16bitStream = new JButton("16��Ʈ ���ϼ���");
		jbtn8bitStream = new JButton("8��Ʈ ���ϼ���");
		jbtn16bitStream.addActionListener(this);
		jbtn8bitStream.addActionListener(this);
		add(jbtn16bitStream);
		add(jbtn8bitStream);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		FileDialog fd = new FileDialog(this, "����", FileDialog.LOAD);
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
	 * txt ������ �� ���� ������ �ٸ� ������ ������ �����Ͽ� �����ϸ� ������ �� ���� �ʴ´�.
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

			while (((temp = br.readLine()) != null)) { // 2byte�� �о�鿩
				// �о���� 2byte�� ��Ʈ���� ����.
				bw.write(temp + "\n");
			}

			bw.flush();
			JOptionPane.showMessageDialog(this, cpFileName + " ���Ϸ� ����Ǿ����ϴ�.");
		} finally {
			if (br != null) {
				br.close();
			}
			if (bw != null)
				bw.close();
		}
	}

	/**
	 * txt,jpg,ppxt�� �پ��� ������ ������ ���簡 �� �ǰ� ���൵ �����ϴ�.
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

///////////////////////////////////////////DISK IO�� ���� �߻��ϴ� �ڵ�/////////////////////////////////////////////
			
//			while (((temp = fis.read()) != -1)) { // HDD�� 512byte�� �о���̰� �ڹٿ����� 1byte�� ����. ���� �̸� �����ϱ� ���ؼ� byte �迭 ���.
//				�о���� 1byte�� ��Ʈ���� ����.
//				fos.write(temp);
//			}
			
///////////////////////////////////////////DISK IO�� ���� �߻��ϴ� �ڵ�/////////////////////////////////////////////
			
			while ((len = fis.read(readData)) != -1) { // 512���� ���� ���� �迭�� �����͸� ä��� ä���� ���� ������ ��ȯ. �� ������ �о���� ���� �ִٸ�.
//				byte �迭�� ����� ���. �����͸� ���� �迭�� ó������� �����Ͱ� ä���� ����� ����.
				fos.write(readData, 0, len);//�迭�� ó�� �濡�� �о���� ����� ���.
			}
			fos.flush();
			JOptionPane.showMessageDialog(this, cpFileName + " ���Ϸ� ����Ǿ����ϴ�.");
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
