import java.io.*;

public class SM_Model {
	private FileReader reader1; //파일리더. 다른게 편하면 바꿔도 될듯
	private FileReader reader2;
	
	public SM_Model(String path1, String path2) throws FileNotFoundException {
		reader1 = new FileReader(path1);
		reader2 = new FileReader(path2);
	}
	
	public void openText(String path1,String path2) throws FileNotFoundException{
		reader1 = new FileReader(path1);
		reader2 = new FileReader(path2);
	}
	public FileReader getAll(boolean isTwo){
		if(isTwo){ return reader2; }
		return reader1;
	}
	public boolean setAll(FileReader rd, boolean isTwo){
		//전부 set
		return false;
	}
	
	
}
