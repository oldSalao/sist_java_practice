package day0225;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * ������ �̺�Ʈ�� �ٸ� ��ü���� �߻���ų�� �̺�Ʈ�� �߻��� ��ü�� �񱳸� ���� getSource()
 * 
 * @author user
 */
@SuppressWarnings("serial")
public class UseEventCompare extends JFrame implements ActionListener {
	private JButton jbtn1, jbtn2;
	private FileDialog fdL, fdS;
	private JLabel jlblOutput;

	public UseEventCompare() {
		super();
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel jp = new JPanel();

		jbtn1 = new JButton("����");
		jbtn2 = new JButton("����");

		jlblOutput = new JLabel();
		jlblOutput.setBorder(new TitledBorder("���ð��"));

		fdL = new FileDialog(this, "����", FileDialog.LOAD);
		fdS = new FileDialog(this, "����", FileDialog.SAVE);
		fdL.pack();
		fdL.setLocationRelativeTo(fdL.getParent());
		fdS.pack();
		fdS.setLocationRelativeTo(fdL.getParent());

		jp.add(jbtn1);
		jp.add(jbtn2);

		// Anonymous inner class Ȱ��.
//		jbtn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//			}
//		});

		// implements�� ���� ����.
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);

		add("Center", jp);
		add("South", jlblOutput);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbtn1) {
			System.out.println("����");
			fdL.setVisible(true);

			// directory�� filename ���
			String path = fdL.getDirectory();
			String fileName = fdL.getFile();
			
			// JLabel�� ���� ����.
			if(fileName!=null) {
			jlblOutput.setText("��� : " + path + fileName);
			// TitleBar�� ���� ����.
			this.setTitle("���ϸ� : " + fileName);
			}
		}
		if (e.getSource() == jbtn2) {
			System.out.println("����");
			fdS.setVisible(true);

			// directory�� filename ���.
			String path = fdS.getDirectory();
			String fileName = fdS.getFile();
			
			// JLabel�� ���� ����.
			jlblOutput.setText("��� : " + path + fileName);
			
			// TitleBar�� ���� ����.
			this.setTitle("���� ���ϸ� : " + fileName);
		}
	}

	public static void main(String[] args) {
		new UseEventCompare();
	}

}
