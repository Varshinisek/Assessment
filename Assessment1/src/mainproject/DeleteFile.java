package mainproject;
import java.io.File;
import java.util.Scanner;
public class DeleteFile {

	public void deleteTheFile(String path) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("enter the file name to delete (file name case sensitive)");
		String filename =scanner.nextLine();
		String filepath = path+filename;
		 int flag =0;
		 File file = new File(path);
		 File files = new File(filepath);
		 File[] filelist = file.listFiles();
		 for(int i=0;i<filelist.length;i++) {
		     if (filelist[i].getName().equals(filename)) {
			if(files.delete()) {
		     flag=1;
			break;	
		}}
		else 
			flag=0;
		 }
		if(flag==1) 
			System.out.println("File deleted sucessfully");
		else 
			System.out.println("file not found");
		
		 }}
		 
		
		