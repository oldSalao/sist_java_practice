package day0304;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

@SuppressWarnings("serial")
public class Homework2 extends JFrame {
	JButton jbtnLoad;
	JTextArea jta;
	
	public Homework2() {
		super("¼÷Á¦2");
		Homework2Evt hwe = new Homework2Evt(this);
		setSize(500,500);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(DISPOSE_ON_CLOSE);
		
		jbtnLoad = new JButton("Å¬¸¯");
		jta = new JTextArea();
		JScrollPane jsp = new JScrollPane(jta);
		
		jbtnLoad.addActionListener(hwe);
		
		add("North",jbtnLoad);
		add("Center",jsp);
		
		setVisible(true);
	}

	public JTextArea getJta() {
		return jta;
	}

	public JButton getJbtnLoad() {
		return jbtnLoad;
	}
}
