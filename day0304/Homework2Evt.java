package day0304;

import java.awt.FileDialog;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStreamReader;

public class Homework2Evt implements ActionListener {

	private Homework2 hw;
	private BufferedReader br;

	public Homework2Evt(Homework2 hw) {
		this.hw = hw;

	}

	@Override
	public void actionPerformed(ActionEvent e) {
		if (e.getSource() == hw.getJbtnLoad()) {
			StringBuilder sb = new StringBuilder();
			String temp = "";
			FileDialog fd = new FileDialog(hw, "¿­±â", FileDialog.LOAD);
			fd.setVisible(true);
			File text = new File(fd.getDirectory() + fd.getFile());
			
			try {
				br = new BufferedReader(new InputStreamReader(new FileInputStream(text), "UTF-8"));
				while ((temp = br.readLine()) != null) {
					sb.append(temp + "\n");
				}
				if (br != null) {
					br.close();
				}
			} catch (IOException e1) {
				e1.printStackTrace();
			}
			
			hw.getJta().setText(sb.toString());
			hw.getJta().setEditable(false);
		}
	}

}
