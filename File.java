import java.util.Date;
// Sample private file class to be replaced by your implementaiton
class File {
	public String fileName;
	public Date createdDate;
	private String fileData; 
	
	public File(){
		fileName = "sample";
		createdDate = new Date();
		fileData = "This is a sample file.";
	}
	
	public File(String name, String data){
		fileName = name;
		createdDate = new Date();
		fileData = data;
	}
	
	public int fileSize(){
		return 390;
	}
	
	public String content(){
		return fileData;
	}
	
    public String fileType(){
        double num = Math.random();
        if(num<0.5){
            return "pdf";
        } else {
            return "docx";
        }
    }
}