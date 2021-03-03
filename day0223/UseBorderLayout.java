package day0223;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * BorderLayout과 component. <br>
 * @author user
 */
@SuppressWarnings("serial")
public class UseBorderLayout extends JFrame{

	public UseBorderLayout() {
		super("BorderLayout 연습");//title bar에 이름을 설정.
		JTextField jtf = new JTextField("North");
		JPasswordField jpf = new JPasswordField("South");
		JLabel jlEast = new JLabel("East");
		JLabel jlWest= new JLabel("West");
		JTextArea jta = new JTextArea();
		
		//배치관리자 설정.
		setLayout(new BorderLayout());// JFrame의 default Layout이 BorderLayout이므로 사실상 설정 안해도 상관 x.
//		setLayout(new FlowLayout()); // 만약 BorderLayout이 아닌 다른 Layout을 사용하고 싶다면 이와같이 설정.
		
		//배치 String 상수 사용.
//		add("North",jtf);
//		add("South",jpf);
//		add("East",jlEast);
//		add("West",jlWest);
//		add("Center",jta);
		
		JScrollPane jsp = new JScrollPane(jta);
		
		//배치 Constant 사용.
		add(BorderLayout.NORTH,jtf);
		add(BorderLayout.SOUTH,jpf);
		add(BorderLayout.EAST,jlEast);
		add(BorderLayout.WEST,jlWest);
		add(BorderLayout.CENTER,jsp);
		
		setSize(400,350);
		
		setVisible(true);
		
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
	}
	
	public static void main(String[] args) {
		new UseBorderLayout();
	}
}

