package fileHandling1;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWrite {
	
	public static void main(String[] args) {
		try {
		FileWriter fw = new FileWriter("/home/thor/a.txt");
		BufferedWriter bw = new BufferedWriter(fw);
		bw.write("nitish");
		bw.newLine();
		bw.write("heellllloooo bro");
		bw.flush();
		bw.close();
		}catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}
