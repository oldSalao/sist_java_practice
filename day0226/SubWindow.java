package day0226;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JDialog;
import javax.swing.JPanel;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class SubWindow extends JDialog implements ActionListener{

	public SubWindow(MainWindow mw) {
		super(mw,"다이얼로그",true);
		
		setSize(400, 400);
		setLocationRelativeTo(mw);

		JTextArea jta = new JTextArea("이것은 textarea 여러줄사용가능.");
		JButton btn = new JButton("닫기");

		JPanel jpbtn = new JPanel();
		jpbtn.add(btn);

		// 다이얼로그의 이벤트는 setVisible 전에 처리해야한다.
		btn.addActionListener(this);

		add("Center", jta);
		add("South", jpbtn);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		dispose();
	}
}
