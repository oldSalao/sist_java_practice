package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * Adaptor Ŭ������ ����Ͽ� �̺�Ʈ ó��.=>anonymous inner class.<br>
 * @author user
 */
@SuppressWarnings("serial")
public class UseInnerClassEvt extends JFrame{

	public UseInnerClassEvt() {
		super("anonymous inner class");
		setSize(400,400);
		setLocationRelativeTo(null);
		
		addWindowListener(new UseEvent());
		
		setVisible(true);
	}
	
	public class UseEvent extends WindowAdapter{
		@Override
		public void windowClosing(WindowEvent e) {
			System.out.println("�̳�Ŭ���� �޼ҵ� ����.");
			dispose();
		}
	}
	
	public static void main(String[] args) {
		new UseInnerClassEvt();
	}

}
