package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Design ������ �и��� �̺�Ʈó�� Ŭ����. has a ����� ���.<br>
 * 
 * @author user
 */
public class UseHasAEvt extends WindowAdapter {

	private UseHasADesign d;

	public UseHasAEvt(UseHasADesign d) {
		this.d = d;
	}

	@Override
	public void windowClosing(WindowEvent e) {
		System.out.println("Has a ����.");
		d.dispose();
	}
}
