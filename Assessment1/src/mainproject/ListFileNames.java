package mainproject;

import java.io.File;
import java.util.Scanner;
public class ListFileNames {

	     public void displayTheFile(String path) {
		
      File file =new File(path);
      File[] files =file.listFiles();
      for(File list:files)
      {
    	  System.out.println(list.getName());
      }
      System.out.println();
      System.out.println("file display successfully");
}}

