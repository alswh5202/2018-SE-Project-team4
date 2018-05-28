import java.awt.event.ActionListener;
import java.util.List;

import javax.swing.*;

public class SM_View extends JFrame {
	// UI 정의
	View_mainFrame vmf = new View_mainFrame();
	
	public SM_View (){
		//UI set
	}
	
	public void setUIText(List<String> str, boolean isTwo) {
		vmf.setUIText(str, isTwo);
	}
	
	public String getUIText(boolean isTwo) {
		return vmf.getUIText(isTwo);
		//UI 상의 텍스트를 가져옴
	}
	
	public void canEdit(boolean isEdit) {
		
	}
	
	public void addListnerController(SM_Controller ctrl) {
		vmf.addListnerController(ctrl);
	}
	
	public String getFileOpen() {
		return vmf.getFileOpen();
	}
	
	public String getFileSave() {
		return vmf.getFileSave();
	}

}
