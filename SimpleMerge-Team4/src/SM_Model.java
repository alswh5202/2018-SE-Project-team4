import java.io.*;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;

public class SM_Model {
	
	List<String> L_str;
	List<String> R_str; 
	//FileReader 대신 한줄의 스트링 리스트를 저장
	
	public SM_Model(){
		L_str = new ArrayList<String>();
		R_str = new ArrayList<String>();
	}
	
	public void openText(String path, boolean isTwo) throws FileNotFoundException{
		try {
			if(isTwo) {
				L_str = Files.readAllLines(Paths.get(path));
			}else {
				R_str = Files.readAllLines(Paths.get(path));
			}
		}catch(IOException e){
			e.printStackTrace();
		}
	}
	
	public boolean saveText(String path1,String path2) throws FileNotFoundException{
		return false;
	}
	
	public List<String> getAll(boolean isTwo){
		if(isTwo) {
			return L_str;
		}else {
			return R_str;
		}
	}
	
	public void setAll(FileReader rd, boolean isTwo){
		//전부 set
	}
	
	
}
