package com.nr.domine;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.Scanner;

public class LogFile1 {
	
	public static void readLines(File f)throws IOException {
    Scanner scanner = new Scanner(f);
	FileReader fr = new FileReader(f);
	BufferedReader br = new BufferedReader(fr);
	String line;
	int numberOfLines=0;
	while((line = br.readLine()) !=null) {
		 String line1 = scanner.nextLine();
		if(line1=="Line") {
			System.out.println(line1);
		}
		//System.out.println(line);
		numberOfLines++;
	}
	
	System.out.println("the number of lines are"+numberOfLines);
	br.close();
	fr.close();
 }
  	
	public static void main(String[] args) throws IOException {
		File f = new File("logFile.2015-09-10.log");
		try {		
			readLines(f);
	   }
		catch(Exception e) {
			e.printStackTrace();
		}
  }
}


