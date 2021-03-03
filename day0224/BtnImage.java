package day0224;

import java.awt.GridLayout;

import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;

/**
 * 이미지가 들어간 버튼.
 * @author user
 */
@SuppressWarnings("serial")
public class BtnImage extends JFrame {
	
	public BtnImage() {
		super();
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(2000,1000);
		setLayout(new GridLayout(1,4));
		
		JButton[] jbtnImg = new JButton[3];
		ImageIcon[] imgArr = new ImageIcon[3];
		
		for(int i = 0; i < jbtnImg.length; i++) {
			imgArr[i] = new ImageIcon("C:\\dev\\image\\mu"+ (i+1)+".jpg");
			jbtnImg[i] = new JButton("무야호 ver."+(i+1),imgArr[i]);
			//jbtnImg[i].setIcon(imgArr[i]);
			
			//풍선 도움말 설정.
			jbtnImg[i].setToolTipText("무야호 ver."+(i+1));
			
			//버튼 텍스트의 수직위치 변경.TOP,CENTER,BOTTOM
			jbtnImg[i].setVerticalTextPosition(JButton.BOTTOM);
			
			//버튼 텍스트의 수평위치 변경.LEFT,CENTER,RIGHT
			jbtnImg[i].setHorizontalTextPosition(JButton.CENTER);
			
			add(jbtnImg[i]);
		}
		
		jbtnImg[0].setRolloverIcon(new ImageIcon("C:\\dev\\workspace\\javase_prj2\\src\\day0224\\images\\mu4.jpg"));
		
		setVisible(true);
	}
	
	public static void main(String[] args) {
		new BtnImage();
	}
}
