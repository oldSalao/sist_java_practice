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
		super(mw,"���̾�α�",true);
		
		setSize(400, 400);
		setLocationRelativeTo(mw);

		JTextArea jta = new JTextArea("�̰��� textarea �����ٻ�밡��.");
		JButton btn = new JButton("�ݱ�");

		JPanel jpbtn = new JPanel();
		jpbtn.add(btn);

		// ���̾�α��� �̺�Ʈ�� setVisible ���� ó���ؾ��Ѵ�.
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
