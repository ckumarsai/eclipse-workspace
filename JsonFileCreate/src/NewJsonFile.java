import java.io.File;
import java.io.IOException;

/*
 * This is the class called new Jsonfile to  create the Json file
 */
public class NewJsonFile {
	public static void main(String[] args) throws IOException {
		
	 	try {   
	 		File file=new File("C:\\Users\\schinthakunta\\eclipse-workspace\\Nani.txt");
	 		file.createNewFile(); 
	 		}catch(IOException e){
	 			e.printStackTrace();
	 		}
		}
}
