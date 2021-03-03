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
 * �̸��� JTextField�� �Է��ϰ� ��ư�� Ŭ��(Action)�ϸ� �Էµ� �̸��� JList�� �߰��ǰ�,
 * JList�� item�� ����(ListSelectionEvent)�ϸ� �ش� �������� ���� JTextField�� �����Ǵ� ��
 * @author user
 */
@SuppressWarnings("serial")
public class UseMVCEvt extends JFrame implements ActionListener,ListSelectionListener {

	private JLabel jlblName;
	private JTextField jtfName;
	private JButton jbtnInput;
	private JList<String> jlName;//MVC Pattern�� �����Ͽ� ���۵� ������Ʈ,View ��ü(���� �����ִ� ��).
	
	private DefaultListModel<String> dlmName;//Model ��ü(���� ����.)

	public UseMVCEvt() {
		super("Action Event ó��.");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(500, 400);
		setLocationRelativeTo(null);

		jbtnInput = new JButton("�Է�");
		jtfName = new JTextField(12);
		jlblName = new JLabel("�Է�");
		
		dlmName = new DefaultListModel<String>();//Model��ü ����.
		jlName = new JList<String>(dlmName);

		JPanel jp = new JPanel();
		JScrollPane jsp = new JScrollPane(jlName);
		jsp.setBorder(new TitledBorder("�Է��̸�"));

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
//			System.out.println("������ Index : " + jlName.getSelectedIndex());
//			System.out.println("������ Index�� �� : " + jlName.getSelectedValue());
			jtfName.setText(dlmName.get(jlName.getSelectedIndex()));
		}
	}

	public static void main(String[] args) {
		new UseMVCEvt();
	}

}
