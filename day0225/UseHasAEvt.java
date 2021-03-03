package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

/**
 * Design 업무와 분리된 이벤트처리 클래스. has a 관계로 사용.<br>
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
		System.out.println("Has a 동작.");
		d.dispose();
	}
}
