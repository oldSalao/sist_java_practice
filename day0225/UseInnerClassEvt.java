package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * Adaptor 클래스를 사용하여 이벤트 처리.=>anonymous inner class.<br>
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
			System.out.println("이너클래스 메소드 동작.");
			dispose();
		}
	}
	
	public static void main(String[] args) {
		new UseInnerClassEvt();
	}

}
