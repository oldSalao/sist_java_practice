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
		super("������ġ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(400,300);
		setLocation(300,300); // Window Component => monitor�� �»���� ������ǥ.
		
		JLabel jlblTitle = new JLabel("����");
		
		Vector<String> vec = new Vector<String>();
		
		vec.add("��ϼ���-�ѵ� ��");
		vec.add("���׵��-�ѵ� ��");
		vec.add("ź-�ѵ� �ڿ�");
		vec.add("�̽��ͱ��-�ѵ� �� �����忷");
		vec.add("��õ-�ѵ� ��");
		
		JComboBox<String> jcb = new JComboBox<String>(vec);//���� ���� �޺��ڽ� ��ü ����.
		JButton jbtn = new JButton("�Է�");
		
		//��ġ������ ���� : BorderLayout -> null
		
		setLayout(null);
		
		//��ġ,ũ�� ����
		
//		jlblTitle.setOpaque(true); //���� ����.
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
		
		//��ġ
		add(jlblTitle);
		add(jcb);
		add(jbtn);
		
		setVisible(true);
		
	}

	public static void main(String[] args) {
		new UseManualLayout();
	}

}
