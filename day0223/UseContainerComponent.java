package day0223;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * �Ϲ� ������Ʈ �������� �ѹ��� ��ġ�� �� ����ϴ� Container Component<br>
 * Panel : ���� ������.<br>
 * JScrollPane : ��ũ�ѹٸ� �����ϴ� ������.<br>
 * @author user
 */
@SuppressWarnings("serial")
public class UseContainerComponent extends JFrame{

	public UseContainerComponent() {
		super("Container Component ���");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel jlblName = new JLabel("�Է�");
		JTextField jtfName = new JTextField(12);
		JButton jbtnInput = new JButton("�Է�");
		JTextArea jtaOutput = new JTextArea();
		
		JPanel jp = new JPanel();
		JScrollPane jsp = new JScrollPane(jtaOutput);
		
		jp.add(jlblName);
		jp.add(jtfName);
		jp.add(jbtnInput);
		
		add("North",jp);
		add("Center",jsp);
		
		setSize(500,400);
		setVisible(true);
		
	}
	
	public static void main(String[] args) {
		new UseContainerComponent();
	}

}
