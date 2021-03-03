package day0222;

import java.awt.Color;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * window Application 작성.
 * @author user
 */
//1.Window component 상속
@SuppressWarnings("serial")
public class HelloSwing extends JFrame {

	//2.생성자에서 사용할 컴포넌트를 생성.
	public HelloSwing() {
		super("스윙연습");//부모클래스의 생성자를 호출.
		JButton jbtn = new JButton("Hello Swing!!!");
		
		jbtn.addMouseListener(new MouseAdapter() {
			boolean flag = false;
			public void mouseClicked(MouseEvent e) {
				if(flag) {
				e.getComponent().setBackground(new Color(255,0,0));
				flag = false;
				}
				else {
					e.getComponent().setBackground(new Color(0,0,255));
					flag = true;
				}
			}
		});
		
		//3.생성된 컴포넌트를 배치.
		add(jbtn);
		//4.윈도우 컴포넌트 크기 설정.
		setSize(400,300);
		//5.사용자에게 보여주기.
		setVisible(true);
		//6.종료처리 : anonymous inner class.
		//addWindowListner method는 java.awt.Window 클래스에 존재하는 method로
		//Window, JWindowm JFrame, Frame 클래스에서 모두 사용할 수 있다.(코드의 재사용성.)
		
//		addWindowListener(new WindowAdapter() {
//			public void windowClosing(WindowEvent e) {
//				dispose();// 특정 윈도우만도 종료가능하다. System.exit(0)은 모든 프로그램을 종료.
//				//윈도우 종료처리 -> JVM 종료. System.exit(0)은 비정상 종료(즉시 JVM종료).
//			}
//		});
	
		//아래 코드가 더 간단함.
		setDefaultCloseOperation(EXIT_ON_CLOSE);
	}
	public static void main(String[] args) {
		new HelloSwing();
	}
}
