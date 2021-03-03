package day0302;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class UseJOptionPane extends JFrame implements ActionListener {

	private JButton jbtnInput, jbtnMessage, jbtnConfirm;

	public UseJOptionPane() {
		super("JOptionPane ���.");
		setSize(500, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		jbtnInput = new JButton("�Է´��̾�α�");
		jbtnMessage = new JButton("�޽��� ���̾�α�");
		jbtnConfirm = new JButton("���� ���̾�α�");

		jbtnInput.addActionListener(this);
		jbtnMessage.addActionListener(this);
		jbtnConfirm.addActionListener(this);

		JPanel panel = new JPanel();

		panel.add(jbtnInput);
		panel.add(jbtnMessage);
		panel.add(jbtnConfirm);

		add(panel);

		setVisible(true);
	}

	public void useInput() {
		String name = JOptionPane.showInputDialog(this, "�̸��� �Է��ϼ���.");
		setTitle("JOptionPane ���. - �Է��̸� : " + name);
	}

	public void useMessage() {
//		JOptionPane.showMessageDialog(this, "Message dialog");
		// ���������� �������� ����.(JOption�� Constant ���)
		// ERROR_MESSAGE, INFORMATION_MESSAGE, PLAIN_MESSAGE, QUESTION_MESSAGE

		ImageIcon imgIcon = new ImageIcon("C:\\\\dev\\\\image\\\\mu1.jpg");

//		JOptionPane.showMessageDialog(this, "Error Message", "ERROR", JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(this, "Information Message", "Information", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(this, "Question Message", "Question", JOptionPane.QUESTION_MESSAGE);

		// �������� ���� message
//		JOptionPane.showMessageDialog(this, "Plain Message", "Plain", JOptionPane.PLAIN_MESSAGE);

		// �������� ������ message
		JOptionPane.showMessageDialog(this, "Plain Message", "Plain", JOptionPane.PLAIN_MESSAGE, imgIcon);

	}

	public void useConfirm() {
//		int flag = JOptionPane.showConfirmDialog(this, "��,�ƴϿ� �Ǵ� ���");
		int flag = JOptionPane.showConfirmDialog(this, "���� �߻�! ��� ���� �Ͻðڽ��ϱ�?","����",JOptionPane.ERROR_MESSAGE);
		String answer = "";
		switch (flag) {
		case JOptionPane.OK_OPTION:
			answer = "��";
			break;
		case JOptionPane.NO_OPTION:
			answer = "�ƴϿ�";
			break;
		case JOptionPane.CANCEL_OPTION:
			answer = "���";
			break;
		}
		setTitle("JOptionPane ���. - Confirm : " + answer);
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == jbtnInput) {
			useInput();
		}
		if (ae.getSource() == jbtnMessage) {
			useMessage();
		}
		if (ae.getSource() == jbtnConfirm) {
			useConfirm();
		}
	}

	public static void main(String[] args) {
		new UseJOptionPane();
	}
}
