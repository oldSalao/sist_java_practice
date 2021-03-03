package day0224;

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

@SuppressWarnings("serial")
public class Homework extends JFrame {

	public Homework() {
		super("�۲�");
		String[] formatArr = { "Dialog", "DialogInput", "Monospaced", "Serif", "SansSerif", "���� ���", "�ü�ü" };
		String[] styleArr = { "����", "����", "����Ӳ�", "���� ����Ӳ�" };

		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 600);
		setLocationRelativeTo(null);
		setLayout(null);
		
		JButton jbtnL = new JButton("Ȯ��");
		JButton jbtnR = new JButton("���");

		JLabel jlbFormat = new JLabel("�۲�(F):");
		JLabel jlbStyle = new JLabel("�۲� ��Ÿ��(Y):");
		JLabel jlbSize = new JLabel("ũ��(S):");
		JLabel jlbEx = new JLabel("������AaBbYyZz");
		JLabel jlbSctipt = new JLabel("��ũ��Ʈ(R):");
		jlbEx.setFont(new Font("Dialog",Font.BOLD,25));
		jlbEx.setBorder(new TitledBorder("����"));

		JTextField jtfFormat = new JTextField(20);
		JTextField jtfStyle = new JTextField(15);
		JTextField jtfSize = new JTextField(5);

		DefaultListModel<String> dlmFormat = new DefaultListModel<String>();
		DefaultListModel<String> dlmStyle = new DefaultListModel<String>();
		DefaultListModel<Integer> dlmSize = new DefaultListModel<Integer>();

		for (int i = 0; i < formatArr.length; i++) {
			dlmFormat.addElement(formatArr[i]);
		}
		for (int i = 0; i < styleArr.length; i++) {
			dlmStyle.addElement(styleArr[i]);
		}
		
		for (int i = 7; i < 81; i++) {
			if (i > 10) {
				i++;
				dlmSize.addElement(i);
			} else {
				dlmSize.addElement(i);
			}
		}

		JList<String> jlFormat = new JList<String>(dlmFormat);
		JList<String> jlStyle = new JList<String>(dlmStyle);
		JList<Integer> jlSize = new JList<Integer>(dlmSize);

		JScrollPane jspJlFormat = new JScrollPane(jlFormat);
		JScrollPane jspJlStyle = new JScrollPane(jlStyle);
		JScrollPane jspJlSize = new JScrollPane(jlSize);
		
		Choice ch = new Choice();
		ch.add("�ѱ�");
		ch.add("����");

		jlbFormat.setBounds(20, 15, 50, 30);
		jlbStyle.setBounds(220, 15, 100, 30);
		jlbSize.setBounds(380, 15, 50, 30);
		jlbEx.setBounds(220,250,250,100);
		jlbSctipt.setBounds(220,360,100,30);
		
		jbtnL.setBounds(300, 500 ,60 ,30 );
		jbtnR.setBounds(400, 500 ,60 ,30 );

		jtfFormat.setBounds(20, 50, 190, 30);
		jtfStyle.setBounds(220, 50, 150, 30);
		jtfSize.setBounds(380, 50, 90, 30);

		jspJlFormat.setBounds(20, 90, 190, 150);
		jspJlStyle.setBounds(220, 90, 150, 150);
		jspJlSize.setBounds(380, 90, 90, 150);
		
		ch.setBounds(220, 400, 250, 50);

		add(jlbFormat);
		add(jlbStyle);
		add(jlbSize);
		add(jtfFormat);
		add(jtfStyle);
		add(jtfSize);
		add(jspJlFormat);
		add(jspJlStyle);
		add(jspJlSize);
		add(jlbEx);
		add(jlbSctipt);
		add(ch);
		add(jbtnL);
		add(jbtnR);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Homework();
	}

}
