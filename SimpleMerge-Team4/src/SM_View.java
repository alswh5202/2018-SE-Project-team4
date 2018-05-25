import javax.swing.*;

public class SM_View extends JFrame {
	// UI 정의
	
	public SM_View (){
		//UI set
	}
	
	public SM_View (String text1, String text2){
		this(); //기본생성자를 먼저 호출
		//UI set
	}
	
	public void setUIText(String text, boolean isTwo) {
		//UI 상의 텍스트를 업데이트함
	}
	
	public void getUIText(String text, boolean isTwo) {
		//UI 상의 텍스트를 가져옴
	}
	
	public void addListnerController(SM_Controller ctrl) {
		//버튼들의 액션리스너를 ctrl로 등록시킴
	}
}
