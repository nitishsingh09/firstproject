package fileHandling1;

import java.io.FileWriter;

public class FileWrite {
	
	public static void main(String[] args) {
		
		try {
			FileWriter fw = new FileWriter("/home/thor/a.txt",false);
			fw.write("hello");
			fw.write("hi");
			fw.write("wow");
			fw.write("nnn");
			fw.flush();
			fw.close();
		}catch(Exception e){
			e.printStackTrace();
			
		}
	}

}
