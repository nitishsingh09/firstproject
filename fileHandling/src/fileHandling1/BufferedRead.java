package fileHandling1;

import java.io.BufferedReader;
import java.io.FileReader;

public class BufferedRead {

	
	public static void main(String[] args) {
		try {
			
		FileReader fr = new FileReader("/home/thor/a.txt");
		BufferedReader br = new BufferedReader(fr);
		
		
		}catch(Exception e) {
			e.printStackTrace();
			System.out.println(e);
		}
	}
}
