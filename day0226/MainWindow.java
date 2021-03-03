package day0226;

import java.awt.event.ActionEvent; 
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

@SuppressWarnings("serial")
public class MainWindow extends JFrame implements ActionListener {

	public MainWindow() {
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
		new SubWindow(this);
	}

	public static void main(String[] args) {
		new MainWindow();
	}

}
