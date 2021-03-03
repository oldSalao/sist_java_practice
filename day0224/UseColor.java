package day0224;

import java.awt.Color;
import java.awt.Font;
import java.awt.HeadlessException;
import java.awt.event.KeyEvent;
import java.awt.event.KeyListener;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;

@SuppressWarnings("serial")
public class UseColor extends JFrame implements KeyListener {
	
	private JTextField jtf = new JTextField(15);
	private JTextArea jta = new JTextArea();

	public UseColor() throws HeadlessException {
		super("색 설정");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 500);
		setLocationRelativeTo(null);
		
		JLabel jlb = new JLabel("전화번호");
		
		JPanel jp = new JPanel();
		jp.setBorder(new TitledBorder("보더"));
		
		JScrollPane jsp = new JScrollPane(jta);

		Font font = new Font("궁서체", Font.BOLD, 25);

		jtf.setBackground(new Color(0x1F51B7));
		jtf.setForeground(new Color(0x00004B));
		jta.setBackground(Color.CYAN);
		jta.setForeground(Color.GRAY);
		jlb.setForeground(Color.RED);
		jlb.setBackground(Color.YELLOW);
		jp.setBackground(Color.GREEN);

		jtf.setFont(font);
		jta.setFont(font);

		jlb.setOpaque(true);

		jtf.addKeyListener(this);

		jp.add(jlb);
		jp.add(jtf);

		add("North", jp);
		add("Center", jsp);

		setVisible(true);
	}

	public static void main(String[] args) {
		new UseColor();
	}

	@Override
	public void keyTyped(KeyEvent e) {
	}

	@Override
	public void keyPressed(KeyEvent e) {
		if (e.getKeyCode() == KeyEvent.VK_ENTER) {
			if (!(jtf.getText().equals(""))) {
				jta.setText(jta.getText()+jtf.getText()+"\n");
				jtf.setText(null);
			}
		}
	}

	@Override
	public void keyReleased(KeyEvent e) {
	}

}
