package kr.co.sist.javamemo.evt;

import java.awt.Choice;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.util.ArrayList;
import java.util.List;

import javax.swing.DefaultListModel;
import javax.swing.JList;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;

import kr.co.sist.javamemo.MemoFont;

/**
 * �۲� �������� �̺�Ʈ ó�� Ŭ����.
 * 
 * @author user
 */
public class MemoFontEvt extends WindowAdapter implements ListSelectionListener, ActionListener, ItemListener {

	private MemoFont mf;

	private String[] formatArr;
	private String[] styleArr;
	private List<String> formatList,styleList,sizeList;

	private DefaultListModel<String> dlmFormat;
	private DefaultListModel<String> dlmStyle;
	private DefaultListModel<String> dlmSize;

	private JList<String> jlFormat, jlStyle, jlSize;

	private Choice chPreview;

	private String fFormat;
	private int fStyle, fSize;
	private Font font;
	private Font noteFont;

	/**
	 * ��ü�� ��������� �⺻������ �������־�� �� ���� ����.<br>
	 * ���� �۲� : "Dialog", "DialogInput", "Monospaced", "Serif", "SansSerif", "���� ���",
	 * "�ü�ü"<br>
	 * ���� ��Ÿ�� : "����", "����", "����Ӳ�", "���� ����Ӳ�"
	 * 
	 * @param mf
	 */
	public MemoFontEvt(MemoFont mf) {
		this.mf = mf;

		formatArr = new String[] { "Dialog", "DialogInput", "Monospaced", "Serif", "SansSerif", "���� ���", "�ü�ü" };
		styleArr = new String[] { "����", "����", "����Ӳ�", "���� ����Ӳ�" };
		formatList = new ArrayList<String>();
		styleList = new ArrayList<String>();
		sizeList = new ArrayList<String>();
		for(String str : formatArr) {
			formatList.add(str);
			}
		for(String str : styleArr) {
			styleList.add(str);
		}
		
		dlmFormat = mf.getDlmFormat();
		dlmStyle = mf.getDlmStyle();
		dlmSize = mf.getDlmSize();

		jlFormat = mf.getJlFormat();
		jlStyle = mf.getJlStyle();
		jlSize = mf.getJlSize();

		chPreview = mf.getChPreview();

		for (int i = 0; i < formatArr.length; i++) {
			dlmFormat.addElement(formatArr[i]);
		}
		for (int i = 0; i < styleArr.length; i++) {
			dlmStyle.addElement(styleArr[i]);
		}

		dlmSize.addElement("7");
		dlmSize.addElement("8");
		dlmSize.addElement("9");
		sizeList.add("7");
		sizeList.add("8");
		sizeList.add("9");

		for (int i = 10; i < 81; i += 2) {
			dlmSize.addElement(String.valueOf(i));
			sizeList.add(String.valueOf(i));
		}

		chPreview.add("�ѱ�");
		chPreview.add("����");

		noteFont = mf.getJtaNote().getFont();
		
		fFormat = noteFont.getName();
		fStyle = noteFont.getStyle();
		fSize = noteFont.getSize();
		
		mf.getJlbPreview().setFont(noteFont);

		mf.getJtfFormat().setText(fFormat);
		mf.getJtfStyle().setText(styleArr[fStyle]);
		mf.getJtfSize().setText(String.valueOf(fSize));
		
		jlFormat.setSelectedIndex(formatList.indexOf(fFormat));
		jlStyle.setSelectedIndex(styleList.indexOf(styleArr[fStyle]));
		jlSize.setSelectedIndex(sizeList.indexOf(String.valueOf(fSize)));
	}

	@Override
	public void actionPerformed(ActionEvent ae) {
		if (ae.getSource() == mf.getJbtnConfirm()) {
			noteFont = font;
			mf.getJtaNote().setFont(noteFont);
			mf.dispose();
		}
		if (ae.getSource() == mf.getJbtnCancel()) {
			mf.dispose();
		}
	}

	@Override
	public void valueChanged(ListSelectionEvent lse) {
		if (lse.getValueIsAdjusting()) {
			if (lse.getSource() == jlFormat) {
				fFormat = dlmFormat.getElementAt(jlFormat.getSelectedIndex());
				mf.getJtfFormat().setText(fFormat);
			}
			if (lse.getSource() == jlStyle) {
				String selY = dlmStyle.getElementAt(jlStyle.getSelectedIndex());
				fStyle = jlStyle.getSelectedIndex();
				mf.getJtfStyle().setText(selY);
			}
			if (lse.getSource() == jlSize) {
				String selS = dlmSize.getElementAt(jlSize.getSelectedIndex());
				mf.getJtfSize().setText(selS);
				fSize = Integer.parseInt(selS);
			}

			font = new Font(fFormat, fStyle, fSize);
			mf.getJlbPreview().setFont(font);
		}
	}

	@Override
	public void itemStateChanged(ItemEvent ie) {
		if (chPreview.getSelectedItem().equals("�ѱ�")) {
			mf.getJlbPreview().setText("������AaBbYyZz");
		}
		if (chPreview.getSelectedItem().equals("����")) {
			mf.getJlbPreview().setText("AaBbYyZz");
		}
	}
	@Override
	public void windowClosing(WindowEvent e) {
		mf.dispose();
	}
}
// class
