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
		super("JOptionPane 사용.");
		setSize(500, 250);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		jbtnInput = new JButton("입력다이얼로그");
		jbtnMessage = new JButton("메시지 다이얼로그");
		jbtnConfirm = new JButton("컨펌 다이얼로그");

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
		String name = JOptionPane.showInputDialog(this, "이름을 입력하세요.");
		setTitle("JOptionPane 사용. - 입력이름 : " + name);
	}

	public void useMessage() {
//		JOptionPane.showMessageDialog(this, "Message dialog");
		// 정보제공용 아이콘을 변경.(JOption의 Constant 사용)
		// ERROR_MESSAGE, INFORMATION_MESSAGE, PLAIN_MESSAGE, QUESTION_MESSAGE

		ImageIcon imgIcon = new ImageIcon("C:\\\\dev\\\\image\\\\mu1.jpg");

//		JOptionPane.showMessageDialog(this, "Error Message", "ERROR", JOptionPane.ERROR_MESSAGE);
//		JOptionPane.showMessageDialog(this, "Information Message", "Information", JOptionPane.INFORMATION_MESSAGE);
//		JOptionPane.showMessageDialog(this, "Question Message", "Question", JOptionPane.QUESTION_MESSAGE);

		// 아이콘이 없는 message
//		JOptionPane.showMessageDialog(this, "Plain Message", "Plain", JOptionPane.PLAIN_MESSAGE);

		// 아이콘을 설정한 message
		JOptionPane.showMessageDialog(this, "Plain Message", "Plain", JOptionPane.PLAIN_MESSAGE, imgIcon);

	}

	public void useConfirm() {
//		int flag = JOptionPane.showConfirmDialog(this, "예,아니오 또는 취소");
		int flag = JOptionPane.showConfirmDialog(this, "에러 발생! 계속 진행 하시겠습니까?","에러",JOptionPane.ERROR_MESSAGE);
		String answer = "";
		switch (flag) {
		case JOptionPane.OK_OPTION:
			answer = "예";
			break;
		case JOptionPane.NO_OPTION:
			answer = "아니오";
			break;
		case JOptionPane.CANCEL_OPTION:
			answer = "취소";
			break;
		}
		setTitle("JOptionPane 사용. - Confirm : " + answer);
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
