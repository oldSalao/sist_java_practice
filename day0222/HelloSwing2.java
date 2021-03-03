package day0222;

import java.awt.Button;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * Swing�� Component�� AWT�� Component�� ȣȯ�ȴ�.
 * 
 * @author user
 */
//1.������ ������Ʈ ���.
@SuppressWarnings("serial")
public class HelloSwing2 extends JFrame {
	
	//2.�����ڸ� �ۼ��ϰ�, ������Ʈ�� ����.
	public HelloSwing2() {
		super("������Ʈ�� ȣȯ.");
		JButton jbtn = new JButton("Swing Button");
		Button btn = new Button("AWT Button");
		
		//3.������Ʈ�� ��ġ
		setLayout(new GridLayout(1,2));
		
		add(jbtn);//Swing Button -> JFrame ��ġ
		add(btn);// AWT Button -> JFrame ��ġ(ȣȯ)
		
		//4.ũ�� ����.
		setSize(400,200);
		
		//5.����ȭ
		setVisible(true);
		
		//6.���� ó��
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	
	public static void main(String[] args) {
		new HelloSwing2();
	}

}
