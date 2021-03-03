package day0226;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainWindow extends JFrame implements ActionListener {

	public MainWindow() {
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
		new SubWindow(this);
	}

	public static void main(String[] args) {
		new MainWindow();
	}

}
