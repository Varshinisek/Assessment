package mainproject;

import java.io.IOException;
import java.util.Scanner;
public class FileOperation {
	public static void main(String[] args) throws IOException {
		Scanner scanner = new Scanner(System.in);
		ListFileNames display = new ListFileNames();
		AddtoFile add= new AddtoFile();
		DeleteFile delete = new  DeleteFile();
		SearchFile search = new SearchFile();
		
		
		 String path =("C:\\test\\") ;
		 
		System.out.println(" enter your choice \n 1.list the file in the directory \n 2.file operation(Add/ Delete/Search)\n 3.Close program");
		int choice = scanner.nextInt();
		 
		switch(choice ) {
		case 1:
			display.displayTheFile(path);
			System.out.println("\n");
			break;
		case 2:while(true) {
			System.out.println("Enter the operation \n 1.AddtoFile \n 2.DeleteFile  \n 3.SearchFile \n 4.Back to Main Menu" );
             int choice1 = scanner.nextInt();
             switch(choice1) {
             case 1:
            	 add.addTheFile(path);
            	 break;
             case 2:
            	 delete.deleteTheFile(path);
            	 break;
             case 3:
            	 search.searchTheFile(path);
            	 break;
             
             }}
		case 3:
			System.out.println("Application close successfully");
			System.exit(0);
			break;
		default:	System.out.println("invalid operation");	
}}}
