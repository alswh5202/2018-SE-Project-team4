import java.awt.event.ActionListener;
import javax.swing.*;

public class SM_View extends JFrame {
	// UI 정의
	View_mainFrame vmf = new View_mainFrame();
	
	public SM_View (){
		//UI set
	}
	
	public void setUIText(String text, boolean isTwo) {
		vmf.setUIText(text, isTwo);
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
}
