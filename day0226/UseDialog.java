package day0226;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class UseDialog extends JFrame implements ActionListener {

	public UseDialog() {
		super("다이얼로그 연습");
		JButton jbtn = new JButton("다이얼로그 열기");
		JPanel panel = new JPanel();
		setSize(500, 600);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		panel.add(jbtn);

		jbtn.addActionListener(this);

		add("Center", panel);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		JDialog jd = new JDialog(this, "정보 다이얼로그", true);
		jd.setSize(400, 400);
		jd.setLocationRelativeTo(this);
//		jd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JTextArea jta = new JTextArea("이것은 textarea 여러줄사용가능.");
		JButton btn = new JButton("닫기");

		JPanel jpbtn = new JPanel();
		jpbtn.add(btn);

		// 다이얼로그의 이벤트는 setVisible 전에 처리해야한다.
		btn.addActionListener(new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				jd.dispose();
			}
		});

		jd.add("Center", jta);
		jd.add("South", jpbtn);

		jd.setVisible(true);
	}

	public static void main(String[] args) {
		new UseDialog();
	}

}
