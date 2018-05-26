import javax.swing.*;

public class SM_View extends JFrame {
	// UI 정의
	
	public SM_View (){
		//UI set
	}
	
	public void setUIText(String text, boolean isTwo) {
		//UI 상의 텍스트를 업데이트함
	}
	
	public String getUIText(String text, boolean isTwo) {
		return text;
		//UI 상의 텍스트를 가져옴
	}
	
	public void canEdit(boolean isEdit) {
		
	}
	
	public void addListnerController(SM_Controller ctrl) {
		//버튼들의 액션리스너를 ctrl로 등록시킴
	}
}
