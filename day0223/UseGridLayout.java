package day0223;

import java.awt.Font;
import java.awt.GridLayout;

import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * GridLayout : ��� ���� ��� ������Ʈ ũ�Ⱑ ���� �����Ǵ� ���̾ƿ� �Ŵ���.<br>
 * @author user
 */
@SuppressWarnings("serial")
public class UseGridLayout extends JFrame{
	
	public UseGridLayout(){
		super("GridLayout �׽�Ʈ");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setLayout(new GridLayout(4,3));
		
		String[] btnTitle = "1,2,3,4,5,6,7,8,9,#,0,*".split(",");
		
		JButton[] jbtn = new JButton[btnTitle.length];
		
		Font font = new Font("Serif",Font.BOLD,20);
		
		for(int i = 0; i<jbtn.length;i++) {
			jbtn[i]=new JButton(btnTitle[i]);
			jbtn[i].setFont(font);
			add(jbtn[i]);
		}
		
		setSize(300,500);
		setVisible(true);
	}

	public static void main(String[] args) {
		new UseGridLayout();
	}
}
