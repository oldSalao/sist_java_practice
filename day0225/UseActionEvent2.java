package day0225;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 
 * @author user
 */
@SuppressWarnings("serial")
public class UseActionEvent2 extends JFrame implements ActionListener {

	private JLabel jlblName;
	private JTextField jtfName;
	private JButton jbtnInput;
	private JTextArea jtaOutput;

	public UseActionEvent2() {
		super("Action Event 처리.");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);

		jtaOutput = new JTextArea();
		jbtnInput = new JButton("입력");
		jtfName = new JTextField(12);
		jlblName = new JLabel("입력");

		JPanel jp = new JPanel();
		JScrollPane jsp = new JScrollPane(jtaOutput);

		jbtnInput.addActionListener(this);
		jtfName.addActionListener(this);

		jp.add(jlblName);
		jp.add(jtfName);
		jp.add(jbtnInput);

		add("North", jp);
		add("Center", jsp);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (!jtfName.getText().equals("")) {
//		jtaOutput.setText(jtaOutput.getText()+jtfName.getText()+"\n");
			jtaOutput.append(jtfName.getText() + "\n");
		}
		jtfName.setText("");
		jtfName.requestFocus();
	}

	public static void main(String[] args) {
		new UseActionEvent2();
	}
}
