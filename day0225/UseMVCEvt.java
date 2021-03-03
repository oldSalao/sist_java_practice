package day0225;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.DefaultListModel;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JList;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextField;
import javax.swing.border.TitledBorder;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

/**
 * 이름을 JTextField에 입력하고 버튼을 클릭(Action)하면 입력된 이름이 JList에 추가되고,
 * JList의 item을 선택(ListSelectionEvent)하면 해당 아이템의 값이 JTextField에 설정되는 일
 * @author user
 */
@SuppressWarnings("serial")
public class UseMVCEvt extends JFrame implements ActionListener,ListSelectionListener {

	private JLabel jlblName;
	private JTextField jtfName;
	private JButton jbtnInput;
	private JList<String> jlName;//MVC Pattern을 도입하여 제작된 컴포넌트,View 객체(값을 보여주는 일).
	
	private DefaultListModel<String> dlmName;//Model 객체(값을 가짐.)

	public UseMVCEvt() {
		super("Action Event 처리.");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);

		jbtnInput = new JButton("입력");
		jtfName = new JTextField(12);
		jlblName = new JLabel("입력");
		
		dlmName = new DefaultListModel<String>();//Model객체 생성.
		jlName = new JList<String>(dlmName);

		JPanel jp = new JPanel();
		JScrollPane jsp = new JScrollPane(jlName);
		jsp.setBorder(new TitledBorder("입력이름"));

		jbtnInput.addActionListener(this);
		jtfName.addActionListener(this);
		jlName.addListSelectionListener(this);

		jp.add(jlblName);
		jp.add(jtfName);
		jp.add(jbtnInput);

		add("North", jp);
		add("Center", jsp);

		
		setVisible(true);
	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (!jtfName.getText().equals("")) {
			dlmName.addElement(jtfName.getText());
		}
		jtfName.setText("");
		jtfName.requestFocus();
	}
	
	@Override
	public void valueChanged(ListSelectionEvent e) {
		if(e.getValueIsAdjusting()) {
//			System.out.println("선택한 Index : " + jlName.getSelectedIndex());
//			System.out.println("선택한 Index의 값 : " + jlName.getSelectedValue());
			jtfName.setText(dlmName.get(jlName.getSelectedIndex()));
		}
	}

	public static void main(String[] args) {
		new UseMVCEvt();
	}

}
