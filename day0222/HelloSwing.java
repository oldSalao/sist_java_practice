package day0222;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * window Application �ۼ�.
 * @author user
 */
//1.Window component ���
@SuppressWarnings("serial")
public class HelloSwing extends JFrame {

	//2.�����ڿ��� ����� ������Ʈ�� ����.
	public HelloSwing() {
		super("��������");//�θ�Ŭ������ �����ڸ� ȣ��.
		JButton jbtn = new JButton("Hello Swing!!!");
		
		jbtn.addMouseListener(new MouseAdapter() {
			boolean flag = false;
			public void mouseClicked(MouseEvent e) {
				if(flag) {
				e.getComponent().setBackground(new Color(255,0,0));
				flag = false;
				}
				else {
					e.getComponent().setBackground(new Color(0,0,255));
					flag = true;
				}
			}
		});
		
		//3.������ ������Ʈ�� ��ġ.
		add(jbtn);
		//4.������ ������Ʈ ũ�� ����.
		setSize(400,300);
		//5.����ڿ��� �����ֱ�.
		setVisible(true);
		//6.����ó�� : anonymous inner class.
		//addWindowListner method�� java.awt.Window Ŭ������ �����ϴ� method��
		//Window, JWindowm JFrame, Frame Ŭ�������� ��� ����� �� �ִ�.(�ڵ��� ���뼺.)
		
//		addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				dispose();// Ư�� �����츸�� ���ᰡ���ϴ�. System.exit(0)�� ��� ���α׷��� ����.
//				//������ ����ó�� -> JVM ����. System.exit(0)�� ������ ����(��� JVM����).
//			}
//		});
	
		//�Ʒ� �ڵ尡 �� ������.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new HelloSwing();
	}
}
