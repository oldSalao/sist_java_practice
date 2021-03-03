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
 * MVC패턴이 도입되어 제작된 클래스.<br>
 * 
 * @author user
 */
@SuppressWarnings("serial")
public class UseMVCComponent extends JFrame {

	public UseMVCComponent() {
		super("MVC Pattern이 도입된 Component의 사용.");
		setDefaultCloseOperation(EXIT_ON_CLOSE);
		setSize(600, 700);
		setLayout(new FlowLayout());
		setLocationRelativeTo(null);

		// 1. DefaultComboBoxModel 생성.
		DefaultComboBoxModel<String> dcbm = new DefaultComboBoxModel<String>();
		// 2. 데이터 추가.
		dcbm.addElement("자바");
		dcbm.addElement("오라클");
		dcbm.addElement("JDBC");
		dcbm.addElement("HTML");
		dcbm.addElement("CSS");
		dcbm.addElement("JavaScript");
		dcbm.addElement("Servlet/JSP");
		dcbm.addElement("XML/JSON");
		dcbm.addElement("Mybatis/Spring");

		// 3. DefaultComboBoxModel을 매개변수로하는 생성자 호출하여 ComboBox 생성.
		JComboBox<String> jcb = new JComboBox<String>(dcbm);

		///////////////////////////////List 생성///////////////////////////////////////////

		// 1.값을 가진 Model 객체를 생성.

		DefaultListModel<String> dlm = new DefaultListModel<String>();

		// 2.Model 객체를 사용하여 View 객체 생성.

		JList<String> jli = new JList<String>(dlm);

		dlm.addElement("정은아");
		dlm.addElement("박기범");
		dlm.addElement("권예원");
		dlm.addElement("석지원");
		dlm.addElement("강인섭");
		dlm.addElement("송준희");
		dlm.addElement("김덕영");

		JScrollPane jspList = new JScrollPane(jli);
		
		///////////////////////////////////JTable 생성//////////////////////////////////////
		
		//배열도 가능.
		Vector<String> vec = new Vector<String>();
		
		vec.add("번호");
		vec.add("이름");
		vec.add("나이");
		
		DefaultTableModel dtm = new DefaultTableModel(vec,0);
		
		//레코드 추가. 배열 또는 벡터 사용.
		String[] data = {"1","유경우","25살"};
		Vector<String> vecRow = new Vector<String>();
		
		vecRow.add("2");
		vecRow.add("이하늘");
		vecRow.add("26살");
		
		dtm.addRow(data);
		dtm.addRow(vecRow);
		
		JTable jt = new JTable(dtm);
		
		//스크롤 패널을 쓰지 않으면 column명이 나타나지 않는다.
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