package day0223;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * 일반 컴포넌트 여러개를 한번에 배치할 때 사용하는 Container Component<br>
 * Panel : 투명 유리판.<br>
 * JScrollPane : 스크롤바를 제공하는 유리판.<br>
 * @author user
 */
@SuppressWarnings("serial")
public class UseContainerComponent extends JFrame{

	public UseContainerComponent() {
		super("Container Component 사용");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JLabel jlblName = new JLabel("입력");
		JTextField jtfName = new JTextField(12);
		JButton jbtnInput = new JButton("입력");
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
