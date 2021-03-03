package day0225;

import javax.swing.JFrame;

/**
 * Has a 관계를 이용한 이벤트 처리. (Design클래스와 event클래스의 분리)<br>
 * @author user
 */
@SuppressWarnings("serial")
public class UseHasADesign extends JFrame{

	public UseHasADesign() {
		super("Has a 관계");
		setSize(400,400);
		setLocationRelativeTo(null);
		
		UseHasAEvt evt = new UseHasAEvt(this);
		
		addWindowListener(evt);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new UseHasADesign();
	}
}
