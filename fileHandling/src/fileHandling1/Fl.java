package fileHandling1;

import java.io.File;

public class Fl {
	
public static void main(String[] args) throws Exception {
	File f = new File("/home/thor/a.txt");
//	// it create one file "a.txt" it not present.
//	boolean val = f.createNewFile();
//	// checks that file exists or not.
//	System.out.println(f.exists());
//	System.out.println(val);
	
	
	//it finds the length of character in the file.
	long l = f.length();
//	
	System.out.println(l);
//	
//	File f1 = new File("/home/thor/a.txt");
//	boolean val1 = f1.delete();
//	System.out.println(val1);
//	
//	File f = new File("/home/thor/Nitish");
//	boolean val =f.mkdir();
//	System.out.println(f.delete());
//	System.out.println(val);
	
	//it print the total files present in the folder.
//	File f = new File("/home/thor/movies");
//	int count = 0;
//	String[] s = f.list();
//	for(String str : s) {
//		System.out.println(str);
//		count++;
//		
//	}
//	System.out.println(s.length);
//	System.out.println("Total "+ count+ " movies present in the file.");
	
	
}

}
