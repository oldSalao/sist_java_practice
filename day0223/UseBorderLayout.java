package day0223;

import java.awt.BorderLayout;

import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPasswordField;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.JTextField;

/**
 * BorderLayout�� component. <br>
 * @author user
 */
@SuppressWarnings("serial")
public class UseBorderLayout extends JFrame{

	public UseBorderLayout() {
		super("BorderLayout ����");//title bar�� �̸��� ����.
		JTextField jtf = new JTextField("North");
		JPasswordField jpf = new JPasswordField("South");
		JLabel jlEast = new JLabel("East");
		JLabel jlWest= new JLabel("West");
		JTextArea jta = new JTextArea();
		
		//��ġ������ ����.
		setLayout(new BorderLayout());// JFrame�� default Layout�� BorderLayout�̹Ƿ� ��ǻ� ���� ���ص� ��� x.
//		setLayout(new FlowLayout()); // ���� BorderLayout�� �ƴ� �ٸ� Layout�� ����ϰ� �ʹٸ� �̿Ͱ��� ����.
		
		//��ġ String ��� ���.
//		add("North",jtf);
//		add("South",jpf);
//		add("East",jlEast);
//		add("West",jlWest);
//		add("Center",jta);
		
		JScrollPane jsp = new JScrollPane(jta);
		
		//��ġ Constant ���.
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

