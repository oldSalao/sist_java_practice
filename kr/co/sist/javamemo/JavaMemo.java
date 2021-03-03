package kr.co.sist.javamemo;


import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JMenu;
import javax.swing.JMenuBar;
import javax.swing.JMenuItem;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

import kr.co.sist.javamemo.evt.JavaMemoEvt;

@SuppressWarnings("serial")
public class JavaMemo extends JFrame {

	// ����, ����, ����, ���̸�����, ����, �۲�, ����
	private JMenuItem jmiNew, jmiOpen, jmiSave, jmiNewSave, jmiEnd, jmiFont, jmiHelp;
	private JTextArea jtaNote;
	private JDialog jdiag;

	public JavaMemo() {
		super("�޸���");
		setSize(800,800);
		setLocationRelativeTo(null);
		
		JMenuBar jmb = new JMenuBar();
		
		JMenu jmFile = new JMenu("����");
		JMenu jmFormat = new JMenu("����");
		JMenu jmHelp = new JMenu("����");
		
		jmiNew = new JMenuItem("����");
		jmiOpen = new JMenuItem("����");
		jmiSave = new JMenuItem("����");
		jmiNewSave = new JMenuItem("���̸�����");
		jmiEnd = new JMenuItem("����");
		jmiFont = new JMenuItem("�۲�");
		jmiHelp = new JMenuItem("�޸�������");
		
		jtaNote = new JTextArea();
		JScrollPane jspNote = new JScrollPane(jtaNote);
		
		jdiag = new JDialog();
		jdiag.pack();
		jdiag.setSize(400,200);
		jdiag.setLocationRelativeTo(jdiag.getParent());
		jdiag.setAlwaysOnTop(true);
		
		//�̺�Ʈ ó�� Ŭ������ ��ü ����
		JavaMemoEvt jme = new JavaMemoEvt(this);
		
		jmiFont.addActionListener(jme);
		jmiNew.addActionListener(jme);
		jmiOpen.addActionListener(jme);
		jmiSave.addActionListener(jme);
		jmiNewSave.addActionListener(jme);
		jmiEnd.addActionListener(jme);
		jmiHelp.addActionListener(jme);
		addWindowListener(jme);
		
		jmFile.add(jmiNew);
		jmFile.addSeparator();
		jmFile.add(jmiOpen);
		jmFile.add(jmiSave);
		jmFile.add(jmiNewSave);
		jmFile.addSeparator();
		jmFile.add(jmiEnd);
		
		jmFormat.add(jmiFont);
		
		jmHelp.add(jmiHelp);
		
		
		jmb.add(jmFile);
		jmb.add(jmFormat);
		jmb.add(jmHelp);
		
		setJMenuBar(jmb);
		add("Center",jspNote);
		
		setVisible(true);
	}

	public JMenuItem getJmiNew() {
		return jmiNew;
	}

	public JMenuItem getJmiOpen() {
		return jmiOpen;
	}

	public JMenuItem getJmiSave() {
		return jmiSave;
	}

	public JMenuItem getJmiNewSave() {
		return jmiNewSave;
	}

	public JMenuItem getJmiEnd() {
		return jmiEnd;
	}

	public JMenuItem getJmiFont() {
		return jmiFont;
	}

	public JMenuItem getJmiHelp() {
		return jmiHelp;
	}

	public JTextArea getJtaNote() {
		return jtaNote;
	}
}