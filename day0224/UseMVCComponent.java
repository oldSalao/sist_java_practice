package day0224;

import java.awt.FlowLayout;
import java.util.Vector;

import javax.swing.DefaultComboBoxModel;
import javax.swing.DefaultListModel;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JList;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.table.DefaultTableModel;

/**
 * MVC������ ���ԵǾ� ���۵� Ŭ����.<br>
 * 
 * @author user
 */
@SuppressWarnings("serial")
public class UseMVCComponent extends JFrame {

	public UseMVCComponent() {
		super("MVC Pattern�� ���Ե� Component�� ���.");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 700);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		// 1. DefaultComboBoxModel ����.
		DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<String>();
		// 2. ������ �߰�.
		dcbm.addElement("�ڹ�");
		dcbm.addElement("����Ŭ");
		dcbm.addElement("JDBC");
		dcbm.addElement("HTML");
		dcbm.addElement("CSS");
		dcbm.addElement("JavaScript");
		dcbm.addElement("Servlet/JSP");
		dcbm.addElement("XML/JSON");
		dcbm.addElement("Mybatis/Spring");

		// 3. DefaultComboBoxModel�� �Ű��������ϴ� ������ ȣ���Ͽ� ComboBox ����.
		JComboBox<String> jcb = new JComboBox<String>(dcbm);

		///////////////////////////////List ����///////////////////////////////////////////

		// 1.���� ���� Model ��ü�� ����.

		DefaultListModel<String> dlm = new DefaultListModel<String>();

		// 2.Model ��ü�� ����Ͽ� View ��ü ����.

		JList<String> jli = new JList<String>(dlm);

		dlm.addElement("������");
		dlm.addElement("�ڱ��");
		dlm.addElement("�ǿ���");
		dlm.addElement("������");
		dlm.addElement("���μ�");
		dlm.addElement("������");
		dlm.addElement("�����");

		JScrollPane jspList = new JScrollPane(jli);
		
		///////////////////////////////////JTable ����//////////////////////////////////////
		
		//�迭�� ����.
		Vector<String> vec = new Vector<String>();
		
		vec.add("��ȣ");
		vec.add("�̸�");
		vec.add("����");
		
		DefaultTableModel dtm = new DefaultTableModel(vec,0);
		
		//���ڵ� �߰�. �迭 �Ǵ� ���� ���.
		String[] data = {"1","�����","25��"};
		Vector<String> vecRow = new Vector<String>();
		
		vecRow.add("2");
		vecRow.add("���ϴ�");
		vecRow.add("26��");
		
		dtm.addRow(data);
		dtm.addRow(vecRow);
		
		JTable jt = new JTable(dtm);
		
		//��ũ�� �г��� ���� ������ column���� ��Ÿ���� �ʴ´�.
		JScrollPane jspTable = new JScrollPane(jt);

		add(jcb);
		add(jspList);
		add(jspTable);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		new UseMVCComponent();
	}
}