import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.FlowLayout;

import javax.swing.JButton;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class View_textFrame extends JPanel {
	
	JTextArea ta = new JTextArea("text test",35,50);
	JScrollPane jsp;
	
	JPanel panel_btn;
	JButton btn_save;
	JButton btn_load;
	JButton btn_edit;

	boolean isTwo;
	
	public View_textFrame(boolean isTwo) {
		this.isTwo = isTwo;
		init();
	}
	
	public void init() {
		ta.setBackground(Color.WHITE);
		jsp = new JScrollPane(ta);
		
		if(isTwo) {
			btn_save = new JButton("Left_Save");		
			btn_load = new JButton("Left_Load");
			btn_edit = new JButton("Left_Edit");
		}else {
			btn_save = new JButton("Right_Save");		
			btn_load = new JButton("Right_Load");
			btn_edit = new JButton("Right_Edit");
		}
		
		panel_btn = new JPanel(new FlowLayout());
		panel_btn.add(btn_save);
		panel_btn.add(btn_load);
		panel_btn.add(btn_edit);

		this.setLayout(new BorderLayout());
		this.add(panel_btn, "North");
		this.add(jsp,"Center");
	}
	
	public void setUIText(String text) {
		ta.setText(text);
	}
	
	public String getUIText() {
		return ta.getText();
	}
	
	public void addListnerController(SM_Controller ctrl) {
		btn_save.addActionListener(ctrl);
		btn_load.addActionListener(ctrl);
		btn_edit.addActionListener(ctrl);
	}
}


