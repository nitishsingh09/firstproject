package fileHandling1;
import java.io.File;
import java.io.FileReader;

public class FileRead {
	
	public static void main(String[] args) {
		try {
			File f = new File("/home/thor/a.txt");
			FileReader fr = new FileReader(f);
			
			for(int i=0; i<f.length();i++) {
				System.out.print((char)fr.read());
				
			}
		}
		catch(Exception e){
			e.printStackTrace();
			System.out.println(e);
		}
	}

}
