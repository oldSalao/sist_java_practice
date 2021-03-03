package day0225;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * 버튼을 클릭 했을 때 윈도우를 종료하는 기능을 구현.<br>
 * 버튼클릭 - ActionEvent가 발생.<br>
 * ActionEvent가 처리되려면 <br>
 * 1.이벤트를 처리할 코드를 정의.<br>
 * -XxxListener 구현.<br>
 * 2.이벤트에 등록.<br>
 * -컴포넌트객체명.addXxxListener(처리될 객체);
 * @author user
 */
@SuppressWarnings("serial")
public class UseActionEvent extends JFrame implements ActionListener{

	public UseActionEvent() {
		super();
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton jbtn = new JButton("종료");
		JPanel jp = new JPanel();
		jp.add(jbtn);
		
		//Anonymous inner class 활용.
//		jbtn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//			}
//		});
		
		//implements를 통한 구현.
		jbtn.addActionListener(this);
		
		add("Center",jp);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("버튼이 클릭되었습니다.");
		dispose();
	}
	
	public static void main(String[] args) {
		new UseActionEvent();
	}


}
