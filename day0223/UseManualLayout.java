package day0223;

import java.awt.Color;
import java.util.Vector;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;

@SuppressWarnings("serial")
public class UseManualLayout extends JFrame {
	
	public UseManualLayout(){
		super("수동배치");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);
		setLocation(300,300); // Window Component => monitor의 좌상단이 시작좌표.
		
		JLabel jlblTitle = new JLabel("제목");
		
		Vector<String> vec = new Vector<String>();
		
		vec.add("백암순대-한독 뒤");
		vec.add("에그드랍-한독 뒤");
		vec.add("탄-한독 뒤옆");
		vec.add("미스터김밥-한독 뒤 주차장옆");
		vec.add("김천-한독 옆");
		
		JComboBox<String> jcb = new JComboBox<String>(vec);//값을 가진 콤보박스 객체 생성.
		JButton jbtn = new JButton("입력");
		
		//배치관리자 해제 : BorderLayout -> null
		
		setLayout(null);
		
		//위치,크기 설정
		
//		jlblTitle.setOpaque(true); //투명도 해제.
		jlblTitle.setBackground(Color.MAGENTA);
//		jlblTitle.setLocation(10,30);
//		jlblTitle.setSize(30,30);
		jlblTitle.setBounds(10,30,30,30);
		//jbtn.setBounds(10, 30, 80, 30);
		
//		jcb.setSize(200,30);
//		jcb.setLocation(jlblTitle.getX()+30,jlblTitle.getY());
		jcb.setBounds(jlblTitle.getX()+30,jlblTitle.getY(),200,30);
		
//		jbtn.setSize(70,30);
//		jbtn.setLocation(jcb.getX()+205,30);
		jbtn.setBounds(jcb.getX()+205,30,70,30);
		
		//배치
		add(jlblTitle);
		add(jcb);
		add(jbtn);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new UseManualLayout();
	}

}
