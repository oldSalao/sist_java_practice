package day0225;

import java.awt.event.WindowEvent;
import java.awt.event.WindowListener;

import javax.swing.JFrame;

@SuppressWarnings("serial")
public class UseWindowEvent extends JFrame implements WindowListener{

	public UseWindowEvent() {
		super("WindowEvent Ã³¸®");
		setSize(600,400);
		setLocationRelativeTo(null);
		
		addWindowListener(this);
		
		
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new UseWindowEvent();
	}

	@Override
	public void windowOpened(WindowEvent e) {
		System.out.println("WindowOpened");
	}

	@Override
	public void windowClosing(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("WindowClosing");
		System.exit(0);
//		dispose();
		
	}

	@Override
	public void windowClosed(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("WindowClosed");
		
	}

	@Override
	public void windowIconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("WindowIconified");
		
	}

	@Override
	public void windowDeiconified(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("WindowDeiconified");
		
	}

	@Override
	public void windowActivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("WindowActivated");
		
	}

	@Override
	public void windowDeactivated(WindowEvent e) {
		// TODO Auto-generated method stub
		System.out.println("WindowDeactivated");
		
	}

}
