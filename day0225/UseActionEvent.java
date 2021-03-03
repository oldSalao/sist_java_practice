package day0225;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;

/**
 * ��ư�� Ŭ�� ���� �� �����츦 �����ϴ� ����� ����.<br>
 * ��ưŬ�� - ActionEvent�� �߻�.<br>
 * ActionEvent�� ó���Ƿ��� <br>
 * 1.�̺�Ʈ�� ó���� �ڵ带 ����.<br>
 * -XxxListener ����.<br>
 * 2.�̺�Ʈ�� ���.<br>
 * -������Ʈ��ü��.addXxxListener(ó���� ��ü);
 * @author user
 */
@SuppressWarnings("serial")
public class UseActionEvent extends JFrame implements ActionListener{

	public UseActionEvent() {
		super();
		setSize(400,400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		JButton jbtn = new JButton("����");
		JPanel jp = new JPanel();
		jp.add(jbtn);
		
		//Anonymous inner class Ȱ��.
//		jbtn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//			}
//		});
		
		//implements�� ���� ����.
		jbtn.addActionListener(this);
		
		add("Center",jp);
		
		setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		System.out.println("��ư�� Ŭ���Ǿ����ϴ�.");
		dispose();
	}
	
	public static void main(String[] args) {
		new UseActionEvent();
	}


}
