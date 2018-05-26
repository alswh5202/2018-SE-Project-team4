import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SM_Controller implements ActionListener {
	private SM_Model model;
	private SM_View view;
	private boolean isEdit;
	
	public SM_Controller(SM_Model _model,SM_View _view){
		model = _model;
		view = _view;
	}
	
	private void diff(){
		
	}
	
	private void merge(boolean isTwo){ //isTwo가 트루면 두번째(오른쪽)텍스트를 의미함
		
	}
	
	private void save(){
		
	}
	
	private void load(String path, boolean isTwo){
		
	}
	
	private void edit(){
		
	}
	
	
	
	public void actionPerformed(ActionEvent e){

	}

}
