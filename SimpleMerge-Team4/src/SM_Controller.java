import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class SM_Controller implements ActionListener {
	private SM_Model model;
	private SM_View view;
	private boolean isEdit;
	
	public SM_Controller(SM_Model _model,SM_View _view){
		model = _model;
		view = _view;
		_view.addListnerController(this);
	}
	
	private void diff(){
		
	}
	
	private void merge(boolean isTwo){ //isTwo가 트루면 두번째(오른쪽)텍스트를 의미함
		
	}
	
	private void save(boolean isTwo){
		if(isTwo) {
			System.out.println("Left_Save : " + view.getFileSave());
		}else{
			System.out.println("Right_Save : " + view.getFileSave());
		}
	}
	
	private void load(boolean isTwo){
		if(isTwo) {
			System.out.println("Left_Load : " + view.getFileOpen());
		}else{
			System.out.println("Right_Load : " + view.getFileOpen());
		}	}
	
	private void edit(){
		
	}
	
	
	
	public void actionPerformed(ActionEvent e){
		System.out.println(e.getActionCommand());
		switch (e.getActionCommand()) {
		case "Right_Load" :
			load(false);
			break;
		case "Right_Save" :
			save(false);
			break;
			
		default:
			break;
		}
	}

}
