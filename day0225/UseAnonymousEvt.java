package day0225;

import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JFrame;

/**
 * Adaptor Ŭ������ ����Ͽ� �̺�Ʈ ó��.=>anonymous inner class.<br>
 * @author user
 */
@SuppressWarnings("serial")
public class UseAnonymousEvt extends JFrame{

	public UseAnonymousEvt() {
		super("anonymous inner class");
		setSize(400,400);
		setLocationRelativeTo(null);
		
		//Adaptor Ŭ������ ����� ����ó��.
		//Adaptor���� �߻�޼ҵ尡 ����.(listener�� �����Ͽ� ���ϴ� method�� �������̵��Ͽ� ����� �� �ֵ��� �Ѵ�.)
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
