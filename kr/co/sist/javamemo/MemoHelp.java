package kr.co.sist.javamemo;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JLabel;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MemoHelp extends JDialog {
	
	public MemoHelp(JavaMemo jm) {
		super(jm,"메모장정보",true);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(550,400);
		setLocationRelativeTo(jm);
		
		ImageIcon img = new ImageIcon("C:\\dev\\image\\mu1.jpg");
		JLabel jlImg = new JLabel();
		JLabel jlInfo = new JLabel();
		JButton jbtnClose= new JButton("닫기");
		
		jlImg.setIcon(img);
		jlInfo.setText("<html>자바 메모장정보<br>Version 1.0<br>제작자 : 이하늘<br>이 메모장은 JavaSE 14를 사용하여 개발한 버전이고, License는  KPL (KimDuckYoung Public License)입니다.<br>아무나 자유롭게 사용해 주세요.<br>향후 버전의 업그레이드는 계획되어있지 않습니다.<html>");
		
		JPanel jpBtn = new JPanel();
		jpBtn.add(jbtnClose);
		JPanel jpInfo = new JPanel();
		jpInfo.setLayout(new GridLayout(1,2));
		jpInfo.add(jlImg);
		jpInfo.add(jlInfo);
		add("Center",jpInfo);
		add("South",jpBtn);
		
		setVisible(true);
	}
}
