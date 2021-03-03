package day0225;

import java.awt.Choice;
import java.awt.Font;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

@SuppressWarnings("serial")
public class test extends JFrame implements ListSelectionListener {
	private JLabel jlView;

	private JTextField jtfF, jtfY, jtfS;

	//////////////////////////////////////////////////////////////////
	private String fName = "�������";
	private int fStyle = Font.PLAIN;
	private int fSize = 12;
	private Font font = new Font(fName, fStyle, fSize);

	private DefaultListModel<String> dlmF = new DefaultListModel<String>();
	private DefaultListModel<String> dlmY = new DefaultListModel<String>();
	private DefaultListModel<String> dlmS = new DefaultListModel<String>();

	private JList<String> jlF;
	private JList<String> jlY;
	private JList<String> jlS;

	public test() {
		super("�۲�");

		JLabel jlFont = new JLabel("�۲�(f):");
		JLabel jlFontType = new JLabel("�۲� ��Ÿ��(Y):");
		JLabel jlSize = new JLabel("ũ��(S):");

		jlView = new JLabel("�����ٶ�AaBbYyZz");

		jlView.setFont(font);

		JLabel jlScript = new JLabel("��ũ��Ʈ(R):");

		jtfF = new JTextField();
		jtfY = new JTextField();
		jtfS = new JTextField();
		///////////////////////////////////////////////////////////////////
		jtfF.setText(fName);
		jtfY.setText("����");
		jtfS.setText(String.valueOf(fSize));

		JButton jbtnOk = new JButton("Ȯ��");
		JButton jbtnCancel = new JButton("���");

		jlView.setBorder(new TitledBorder("����"));
		///////
		dlmF = new DefaultListModel<String>();

		dlmF.addElement("Dialog");
		dlmF.addElement("DialogInput");
		dlmF.addElement("Monospaced");
		dlmF.addElement("Serif");
		dlmF.addElement("SansSerif");
		dlmF.addElement("���� ���");
		dlmF.addElement("�ü�ü");

		jlF = new JList<String>(dlmF);

		JScrollPane jspF = new JScrollPane(jlF);
		///////
		dlmY = new DefaultListModel<String>();

		dlmY.addElement("����");
		dlmY.addElement("����");
		dlmY.addElement("����Ӳ�");
		dlmY.addElement("���� ����Ӳ�");

		jlY = new JList<String>(dlmY);

		JScrollPane jspY = new JScrollPane(jlY);

		///////
		dlmS = new DefaultListModel<String>();

		dlmS.addElement("7");
		dlmS.addElement("8");
		dlmS.addElement("9");
		dlmS.addElement("10");
		for (int i = 12; i < 81; i += 2) {
			dlmS.addElement(Integer.toString(i));
		}
		jlS = new JList<String>(dlmS);

		JScrollPane jspS = new JScrollPane(jlS);

		///////////////////////////////////////////////////////////////////////////////
		jlF.setSelectedIndex(5);
		jlY.setSelectedIndex(0);
		jlS.setSelectedIndex(4);

		//////////////////////////////////////////
		Choice cho = new Choice();
		cho.add("�ѱ�");
		cho.add("����");
		//////////////////////////////////////////
		setLayout(null);
		//
		jlFont.setBounds(10, 30, 40, 20);
		jtfF.setBounds(10, 50, 160, 20);
		jspF.setBounds(10, 70, 160, 120);

		jlFontType.setBounds(180, 30, 130, 20);
		jtfY.setBounds(180, 50, 140, 20);
		jspY.setBounds(180, 70, 140, 120);

		jlView.setBounds(180, 200, 220, 70);

		jlScript.setBounds(180, 280, 130, 20);
		cho.setBounds(180, 300, 220, 20);

		jlSize.setBounds(330, 30, 45, 20);
		jtfS.setBounds(330, 50, 70, 20);
		jspS.setBounds(330, 70, 70, 120);

		jbtnOk.setBounds(230, 380, 80, 20);
		jbtnCancel.setBounds(320, 380, 80, 20);
		//
		add(jlFont);
		add(jtfF);
		add(jspF);

		add(jlFontType);
		add(jtfY);
		add(jspY);

		add(jlView);

		add(jlScript);
		add(cho);

		add(jlSize);
		add(jtfS);
		add(jspS);

		add(jbtnOk);
		add(jbtnCancel);
		//
		//// ��ư �̺�Ʈ ����
		jlF.addListSelectionListener(this);
		jlY.addListSelectionListener(this);
		jlS.addListSelectionListener(this);
		//
		setSize(430, 500);
		// s
		setVisible(true);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	}// Homework0224

	@Override
	public void valueChanged(ListSelectionEvent lse) {
		if (lse.getValueIsAdjusting()) {
			if (lse.getSource() == jlF) {
				fName = dlmF.getElementAt(jlF.getSelectedIndex());
				jtfF.setText(fName);
			} // end if

			if (lse.getSource() == jlY) {
				String selY = dlmY.getElementAt(jlY.getSelectedIndex());
				switch (selY) {
				case "����":
					fStyle = Font.PLAIN;
					break;
				case "����":
					fStyle = Font.BOLD;
					break;
				case "����Ӳ�":
					fStyle = Font.ITALIC;
					break;
				case "���� ����Ӳ�":
					fStyle = Font.BOLD | Font.ITALIC;
					break;
				}
				jtfY.setText(selY);
			} // end if

			if (lse.getSource() == jlS) {
				String selS = dlmS.getElementAt(jlS.getSelectedIndex());
				jtfS.setText(selS);
				fSize = Integer.parseInt(selS);
			} // end if
			font = new Font(fName, fStyle, fSize);
			jlView.setFont(font);
		}

	}// valueChanged

	public static void main(String[] args) {
		new test();
	}// main

}// class
