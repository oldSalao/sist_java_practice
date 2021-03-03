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
		super(jm,"�޸�������",true);
		
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		setSize(550,400);
		setLocationRelativeTo(jm);
		
		ImageIcon img = new ImageIcon("C:\\dev\\image\\mu1.jpg");
		JLabel jlImg = new JLabel();
		JLabel jlInfo = new JLabel();
		JButton jbtnClose= new JButton("�ݱ�");
		
		jlImg.setIcon(img);
		jlInfo.setText("<html>�ڹ� �޸�������<br>Version 1.0<br>������ : ���ϴ�<br>�� �޸����� JavaSE 14�� ����Ͽ� ������ �����̰�, License��  KPL (KimDuckYoung Public License)�Դϴ�.<br>�ƹ��� �����Ӱ� ����� �ּ���.<br>���� ������ ���׷��̵�� ��ȹ�Ǿ����� �ʽ��ϴ�.<html>");
		
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
