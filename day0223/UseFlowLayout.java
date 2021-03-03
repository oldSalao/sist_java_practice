package day0223;

import java.awt.FlowLayout;
import java.awt.Font;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

import javax.swing.AbstractButton;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 * FlowLayout : ������Ʈ�� ���ٷ� ��ġ�Ǹ� �������� ũ�⿡ ���� ��ġ�� ����ȴ�.
 * @author user
 */
@SuppressWarnings("serial")
public class UseFlowLayout extends JFrame{

	public UseFlowLayout() {
		super("FlowLayout ����");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		List<AbstractButton> list = new ArrayList<AbstractButton>();
		Map<String, AbstractButton> map = new HashMap<String, AbstractButton>();
		
//		list.add(new JButton("��ư"));
//		list.add(new JCheckBox("Java"));
//		list.add(new JCheckBox("C/C++"));
//		list.add(new JCheckBox("Phython"));
//		list.add(new JCheckBox("Visual Basic"));
//		list.add(new JRadioButton("����"));
//		list.add(new JRadioButton("����"));
		
		map.put("jbtn", new JButton("��ư"));
		map.put("jcbLang1", new JCheckBox("Java"));
		map.put("jcbLang2", new JCheckBox("C/C++"));
		map.put("jcbLang3", new JCheckBox("Phython"));
		map.put("jcbLang4", new JCheckBox("Visual Basic"));
		map.put("jrbGen1", new JRadioButton("����"));
		map.put("jrbGen2", new JRadioButton("����"));
		JTextField jtf = new JTextField(10);
		jtf.setFont(new Font("�޸�����ü",Font.ITALIC|Font.BOLD,25));
		Font font=new Font("�ü�ü",Font.PLAIN,20);
		map.get("jcbLang1").setFont(font);
		map.get("jcbLang2").setFont(font);
		map.get("jcbLang3").setFont(font);
		map.get("jcbLang4").setFont(font);
		
		Set<String> keys = map.keySet();
		Iterator<String> iter = keys.iterator();
		
//		JButton jbtn = new JButton("��ư");
//		JCheckBox jcbLang1 = new JCheckBox("Java");
//		JCheckBox jcbLang2 = new JCheckBox("C/C++");
//		JCheckBox jcbLang3 = new JCheckBox("Phython");
//		JCheckBox jcbLang4 = new JCheckBox("Visual Basic");
//		JRadioButton jrbGen1 = new JRadioButton("����");
//		JRadioButton jrbGen2 = new JRadioButton("����");
		
		ButtonGroup bg = new ButtonGroup();
//		bg.add(jrbGen1);
//		bg.add(jrbGen2);
		bg.add(map.get("jrbGen1"));
		bg.add(map.get("jrbGen2"));
		
		setLayout(new FlowLayout());
		
		//������Ʈ ��ġ.
//		for(int i = 0; i<list.size();i++) {
//			add(list.get(i));
//		}
		while(iter.hasNext()) {
			add(map.get(iter.next()));
		}
		add(jtf);
//		add(jbtn);
//		add(jcbLang1);
//		add(jcbLang2);
//		add(jcbLang3);
//		add(jcbLang4);
//		add(jrbGen1);
//		add(jrbGen2);
		
		
		setSize(400,300);
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new UseFlowLayout();
	}

}
