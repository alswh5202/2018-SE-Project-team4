import java.awt.BorderLayout;
import java.awt.FlowLayout;
import javax.swing.JButton;
import javax.swing.JFileChooser;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.filechooser.FileNameExtensionFilter;

public class View_mainFrame extends JFrame{
	
	final int WIDTH=1200, HEIGHT=800;

	JPanel panel_ta;
	View_textFrame text1 = new View_textFrame(true);
	View_textFrame text2 = new View_textFrame(false);
	
	JPanel panel_btn;
	JButton btn_merge;
	JButton btn_diff;
	
	JFileChooser jfc;
	
	public View_mainFrame() {
		init();
	}
	
	
	public void init() {
		this.setTitle("Simple Merge");
		
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(WIDTH, HEIGHT);
		this.setResizable(false);
		this.setVisible(true);
		// Frame Init

		panelInit();

		this.setLayout(new BorderLayout());
		this.add(panel_btn, "North");
		this.add(panel_ta, "Center");
		// Frame Layout Controll
		
		jfc = new JFileChooser();
        jfc.setFileFilter(new FileNameExtensionFilter("txt", "txt"));
        jfc.setMultiSelectionEnabled(false);
	}
	
	public void panelInit() {
		panel_ta = new JPanel(new FlowLayout());
		panel_ta.add(text1);
		panel_ta.add(text2);
		///textFrame panel Init
		
		btn_merge = new JButton("Merge");
		btn_diff = new JButton("Diff");
		
		panel_btn = new JPanel(new FlowLayout());
		panel_btn.add(btn_diff);
		panel_btn.add(btn_merge);
	}
	
	public void setUIText(String text, boolean isTwo) {
		if(isTwo) {
			text1.setUIText(text);
		}else {
			text2.setUIText(text);
		}
	}
	
	public String getUIText(boolean isTwo) {
		if(isTwo) {
			return text1.getUIText();
		}else {
			return text2.getUIText();
		}
	}
	
	public void addListnerController(SM_Controller ctrl) {
		btn_diff.addActionListener(ctrl);
		btn_merge.addActionListener(ctrl);
		
		text1.addListnerController(ctrl);
		text2.addListnerController(ctrl);
	}
	
	public String getFileOpen() {
		if(jfc.showOpenDialog(this) == JFileChooser.APPROVE_OPTION) {
			return jfc.getSelectedFile().toString() + '.' + jfc.getFileFilter().getDescription();
		}
		return null;
	}
	
	public String getFileSave() {
		if(jfc.showSaveDialog(this) == JFileChooser.APPROVE_OPTION) {
			return jfc.getSelectedFile().toString() + '.' + jfc.getFileFilter().getDescription();
		}
		return null;
	}
}
