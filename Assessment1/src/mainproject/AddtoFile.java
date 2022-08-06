package mainproject;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
public class AddtoFile {

	public void addTheFile(String path) throws IOException {
	System.out.println("enter the file name you want to add") ;
	Scanner scanner = new Scanner(System.in);
	String filename = scanner.next();
	
	String finalpath = path+filename;
	
	 File file =new File(finalpath);
	
		if(file.createNewFile()) {
			System.out.println("file created ");
		}
		else {
			System.out.println("file already exists");
		}
		
	}

	
		
	}
	

