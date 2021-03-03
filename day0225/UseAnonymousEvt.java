package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * Adaptor 클래스를 사용하여 이벤트 처리.=>anonymous inner class.<br>
 * @author user
 */
@SuppressWarnings("serial")
public class UseAnonymousEvt extends JFrame{

	public UseAnonymousEvt() {
		super("anonymous inner class");
		setSize(400,400);
		setLocationRelativeTo(null);
		
		//Adaptor 클래스를 사용한 종료처리.
		//Adaptor에는 추상메소드가 없다.(listener를 구현하여 원하는 method만 오버라이딩하여 사용할 수 있도록 한다.)
		addWindowListener(new WindowAdapter() {
			public void windowClosing(WindowEvent e) {
				dispose();
			}
		});
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new UseAnonymousEvt();
	}

}
