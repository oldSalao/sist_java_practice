package kr.co.sist.javamemo.evt;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import kr.co.sist.javamemo.JavaMemo;
import kr.co.sist.javamemo.MemoFont;
import kr.co.sist.javamemo.MemoHelp;

/**
 * JavaMemo 디자인의 이벤트처리 클래스
 * @author user
 */
public class JavaMemoEvt extends WindowAdapter implements ActionListener {

	private JavaMemo jm;
	
	public JavaMemoEvt(JavaMemo jm) {
		this.jm = jm;
		
		
	}//JavaMemoevt

	@Override
	public void windowClosing(WindowEvent e) {
		jm.dispose();
	}//windowClosing
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		if(e.getSource()==jm.getJmiFont()) {//글꼴에서 이벤트를 발생시켰을때
			memoFont();
		}//end if
		if(e.getSource()==jm.getJmiNew()) {
			jm.getJtaNote().setText("");
		}
		if(e.getSource()==jm.getJmiOpen()) {
			FileDialog fd = new FileDialog(jm,"열기",FileDialog.LOAD);
			fd.setVisible(true);
			String fileName = fd.getFile();			
			if(fileName!=null) {
			jm.setTitle("열기-" + fileName);
			}
		}
		if(e.getSource()==jm.getJmiSave()) {
			FileDialog fd = new FileDialog(jm,"저장",FileDialog.SAVE);
			fd.setVisible(true);
			String fileName = fd.getFile();			
			if(fileName!=null) {
			jm.setTitle("저장-" + fileName);
			}
		}
		if(e.getSource()==jm.getJmiNewSave()) {
			FileDialog fd = new FileDialog(jm,"다른 이름으로 저장",FileDialog.SAVE);
			fd.setVisible(true);			
			String fileName = fd.getFile();			
			if(fileName!=null) {
				jm.setTitle("저장-" + fileName);
			}
		}
		if(e.getSource()==jm.getJmiEnd()) {
			jm.dispose();
		}
		if(e.getSource()==jm.getJmiHelp()) {
			memoHelp();
		}
		
		
		
	}//actionPerformed
	
	/**
	 * 글꼴설정
	 */
	public void memoFont() {
		new MemoFont(jm);
	}//memoFont
	
	public void memoHelp() {
		new MemoHelp(jm);
	}
	
}//JavaMemoEvt
