package day0225;

import javax.swing.JFrame;

/**
 * Has a ���踦 �̿��� �̺�Ʈ ó��. (DesignŬ������ eventŬ������ �и�)<br>
 * @author user
 */
@SuppressWarnings("serial")
public class UseHasADesign extends JFrame{

	public UseHasADesign() {
		super("Has a ����");
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
