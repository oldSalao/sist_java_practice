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
		super("���̾�α� ����");
		JButton jbtn = new JButton("���̾�α� ����");
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
		JDialog jd = new JDialog(this, "���� ���̾�α�", true);
		jd.setSize(400, 400);
		jd.setLocationRelativeTo(this);
//		jd.setDefaultCloseOperation(DISPOSE_ON_CLOSE);

		JTextArea jta = new JTextArea("�̰��� textarea �����ٻ�밡��.");
		JButton btn = new JButton("�ݱ�");

		JPanel jpbtn = new JPanel();
		jpbtn.add(btn);

		// ���̾�α��� �̺�Ʈ�� setVisible ���� ó���ؾ��Ѵ�.
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
