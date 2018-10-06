package com.nr.domine;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileReader1 {
	
	public static void main(String[] args) {
		File file = new File("log.txt");

		try {
		    Scanner scanner = new Scanner(file);

		    //now read the file line by line...
		    int lineNum = 0;
		    while (scanner.hasNextLine()) {
		        String line = scanner.nextLine();
		        lineNum++;
		        if(line=="Error") { 
		            System.out.println("ho hum, i found it on line " +line);
		        }
		    }
		} 
		
		
		catch(FileNotFoundException e) { 
		    //handle this
		}
		
	}
	
}
