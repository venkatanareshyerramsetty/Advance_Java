package com.nr.domine;

import java.io.BufferedReader;
import java.io.File;
import java.io.IOException;
import java.util.Scanner;

public class LogFile {
 
	public static void main(String[] args) throws IOException{
		
//		File f = new File("logFile.2015-09-10.log");
//	    FileInputStream fis = new FileInputStream(f);
//		DataInputStream dis =new DataInputStream(fis);
//		String str = dis.readUTF();
//		System.out.println(str);
//		System.out.println("completed");
		
		int count =0;
		Scanner input = new Scanner(new File("logFile.2015-09-10.log"));
		System.out.println();
		 while(input.hasNextLine()) {
			 
			 System.out.println(input.hasNextLine()+"\t");
			 count++;
			
		 }
		 
		 System.out.println("The count valur is"+count);
		 System.out.println("File executed successfully");
	}
}
