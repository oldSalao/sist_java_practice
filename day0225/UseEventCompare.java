package day0225;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.border.TitledBorder;

/**
 * 동일한 이벤트를 다른 객체에서 발생시킬때 이벤트가 발생한 객체의 비교를 위한 getSource()
 * 
 * @author user
 */
@SuppressWarnings("serial")
public class UseEventCompare extends JFrame implements ActionListener {
	private JButton jbtn1, jbtn2;
	private FileDialog fdL, fdS;
	private JLabel jlblOutput;

	public UseEventCompare() {
		super();
		setSize(400, 400);
		setLocationRelativeTo(null);
		setDefaultCloseOperation(EXIT_ON_CLOSE);

		JPanel jp = new JPanel();

		jbtn1 = new JButton("열기");
		jbtn2 = new JButton("저장");

		jlblOutput = new JLabel();
		jlblOutput.setBorder(new TitledBorder("선택경로"));

		fdL = new FileDialog(this, "열기", FileDialog.LOAD);
		fdS = new FileDialog(this, "저장", FileDialog.SAVE);
		fdL.pack();
		fdL.setLocationRelativeTo(fdL.getParent());
		fdS.pack();
		fdS.setLocationRelativeTo(fdL.getParent());

		jp.add(jbtn1);
		jp.add(jbtn2);

		// Anonymous inner class 활용.
//		jbtn.addActionListener(new ActionListener() {
//			@Override
//			public void actionPerformed(ActionEvent e) {
//				dispose();
//			}
//		});

		// implements를 통한 구현.
		jbtn1.addActionListener(this);
		jbtn2.addActionListener(this);

		add("Center", jp);
		add("South", jlblOutput);

		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == jbtn1) {
			System.out.println("열기");
			fdL.setVisible(true);

			// directory와 filename 얻기
			String path = fdL.getDirectory();
			String fileName = fdL.getFile();
			
			// JLabel의 내용 변경.
			if(fileName!=null) {
			jlblOutput.setText("경로 : " + path + fileName);
			// TitleBar의 내용 변경.
			this.setTitle("파일명 : " + fileName);
			}
		}
		if (e.getSource() == jbtn2) {
			System.out.println("저장");
			fdS.setVisible(true);

			// directory와 filename 얻기.
			String path = fdS.getDirectory();
			String fileName = fdS.getFile();
			
			// JLabel의 내용 변경.
			jlblOutput.setText("경로 : " + path + fileName);
			
			// TitleBar의 내용 변경.
			this.setTitle("저장 파일명 : " + fileName);
		}
	}

	public static void main(String[] args) {
		new UseEventCompare();
	}

}
