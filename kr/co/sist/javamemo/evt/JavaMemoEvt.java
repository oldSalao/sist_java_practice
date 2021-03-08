package kr.co.sist.javamemo.evt;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JOptionPane;
import javax.swing.JTextArea;

import kr.co.sist.javamemo.JavaMemo;
import kr.co.sist.javamemo.MemoFont;
import kr.co.sist.javamemo.MemoHelp;

/**
 * JavaMemo �������� �̺�Ʈó�� Ŭ����
 * 
 * @author user
 */
public class JavaMemoEvt extends WindowAdapter implements ActionListener {

	private JavaMemo jm;
	private String prevText;
	private String curFileName;

	public JavaMemoEvt(JavaMemo jm) {
		this.jm = jm;

	}// JavaMemoevt

	@Override
	public void windowClosing(WindowEvent e) {
		jm.dispose();
	}// windowClosing

	@Override
	public void actionPerformed(ActionEvent e) {

		if (e.getSource() == jm.getJmiFont()) {// �۲ÿ��� �̺�Ʈ�� �߻���������
			memoFont();
		} // end if
		if (e.getSource() == jm.getJmiNew()) {
			newMemo();
		}
		if (e.getSource() == jm.getJmiOpen()) {
			FileDialog fd = new FileDialog(jm, "����", FileDialog.LOAD);
			fd.setVisible(true);
			String fileName = fd.getFile();
			if (fileName != null) {
				jm.setTitle("����-" + fileName);
			}
		}
		if (e.getSource() == jm.getJmiSave()) {
			FileDialog fd = new FileDialog(jm, "����", FileDialog.SAVE);
			fd.setVisible(true);
			String fileName = fd.getFile();
			if (fileName != null) {
				jm.setTitle("����-" + fileName);
			}
		}
		if (e.getSource() == jm.getJmiNewSave()) {
			FileDialog fd = new FileDialog(jm, "�ٸ� �̸����� ����", FileDialog.SAVE);
			fd.setVisible(true);
			String fileName = fd.getFile();
			if (fileName != null) {
				jm.setTitle("����-" + fileName);
			}
		}
		if (e.getSource() == jm.getJmiEnd()) {
			jm.dispose();
		}
		if (e.getSource() == jm.getJmiHelp()) {
			memoHelp();
		}

	}// actionPerformed

	/**
	 * �۲ü���
	 */
	public void memoFont() {
		new MemoFont(jm);
	}// memoFont

	public void memoHelp() {
		new MemoHelp(jm);
	}

	/**
	 * ����
	 */
	public void newMemo() {
		JTextArea jtaMemo = jm.getJtaNote();
		
		if(!jtaMemo.getText().equals("")) {
			JOptionPane.showConfirmDialog(jm,"�����Ͻðڽ��ϱ�?");
		}
		
		jtaMemo.setText("");
		jm.setTitle("����");
	}

	/**
	 * ����
	 */
	public void openMemo() {
		FileDialog fdOpen = new FileDialog(jm,"���� - �ڹٸ޸���",FileDialog.LOAD);
	}

	/**
	 * ����
	 */
	public void saveMemo() {

	}

	/**
	 * ���̸����� ����
	 */
	public void newSaveMemo() {

	}

	/**
	 * ����
	 */
	public void end() {

	}

	/**
	 * �ؽ�Ʈ �� �Լ�
	 */
	public void compareText() {
	}

}// JavaMemoEvt
