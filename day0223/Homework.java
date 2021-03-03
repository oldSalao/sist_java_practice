package day0223;

import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

@SuppressWarnings("serial")
public class Homework extends JFrame {

	public Homework() {
		super("숙제");
		int jlblLocX = 10, jlblLocY = 10, jtfLocY = 10, jbtLocX = 0;
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 250);
		setLayout(null);

		JTextArea jta = new JTextArea();
		jta.setLocation(250, 10);
		jta.setSize(200, 160);

		JLabel[] jlblTitle = new JLabel[4];
		jlblTitle[0] = new JLabel("이름");
		jlblTitle[1] = new JLabel("나이");
		jlblTitle[2] = new JLabel("주소");
		jlblTitle[3] = new JLabel("이메일");

		JLabel jlblAt = new JLabel("@");

		JTextField[] jtfInfo = new JTextField[3];
		jtfInfo[0] = new JTextField();
		jtfInfo[1] = new JTextField();
		jtfInfo[2] = new JTextField();

		JTextField jtfEmail = new JTextField();

		Vector<String> vec = new Vector<String>();
		vec.add("naver.com");
		vec.add("gmail.com");
		vec.add("daum.net");
		JComboBox<String> jcbAt = new JComboBox<String>(vec);

		JButton[] jbt = new JButton[4];
		jbt[0] = new JButton("입력");
		jbt[1] = new JButton("수정");
		jbt[2] = new JButton("삭제");
		jbt[3] = new JButton("종료");

		jbt[3].addMouseListener(new MouseAdapter() {
			@Override
			public void mouseClicked(MouseEvent e) {
				super.mouseClicked(e);
				dispose();
			}

		});

		for (int i = 0; i < jtfInfo.length; i++) {
			jtfInfo[i].setBounds(jlblLocX + 50, jtfLocY, 180, 20);
			jtfLocY += 45;
			add(jtfInfo[i]);
		}

		for (int i = 0; i < jlblTitle.length; i++) {
			jlblTitle[i].setBounds(jlblLocX, jlblLocY, 40, 20);
			jlblLocY += 45;
			add(jlblTitle[i]);
		}

		jtfEmail.setBounds(60, jlblTitle[3].getY(), 60, 20);
		jlblAt.setBounds(jtfEmail.getX() + 70, jlblTitle[3].getY(), 20, 20);
		jcbAt.setBounds(jlblAt.getX() + 25, jlblTitle[3].getY(), 90, 20);

		jbtLocX = jtfEmail.getX();

		for (int i = 0; i < jbt.length; i++) {
			jbt[i].setBounds(jbtLocX, jcbAt.getY() + 35, 80, 20);
			jbtLocX += 95;
			add(jbt[i]);

		}

		add(jtfEmail);
		add(jlblAt);
		add(jcbAt);
		add(jta);

		setVisible(true);
	}

	public static void main(String[] args) {
		new Homework();
	}

}
