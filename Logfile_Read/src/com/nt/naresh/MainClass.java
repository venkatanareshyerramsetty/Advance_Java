package com.nt.naresh;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


public class MainClass {
	public static void main(String[] args) {
	    ArrayList <entity> entityList = new ArrayList <entity> ();
	    boolean testInput = true;

	    try{
	        Scanner read = new Scanner (new File("log.txt"));
	        do{
	            String line = read.nextLine();
	            String [] tokens = line.split(",");
	           entityList.add(new entity(tokens[0], tokens[0]));
	        }while(read.hasNext());
	        read.close();
	    }catch (FileNotFoundException e){
	        System.out.println("File not found.");
	    }
	    
	    while ( testInput ){
	       
	       

	        switch (( testInput(1,2))){

	        case 1: error(entityList);
	                break;
	        case 2: exception(entityList);
	                break;
	        }
	    }
	}
	


	private static void exception(ArrayList<entity> entityList) {
		 Scanner input = new Scanner(System.in);
		 System.out.println("B. Search by exception");
		 boolean found = false;
		 char menuOption = input.next().charAt(0);
		 switch (menuOption) {
		 
		 case 'B':
		    case 'b': System.out.print("Enter song artist: ");
		              String searchException = input.nextLine();
		              for (entity i : entityList){
		                  if (i.getException().equals(searchException)){
		                      System.out.println(i);
		                      found = true;
		                  }
		              }
		              if ( found != true ){
		                  System.out.println("Song does not exist.");
		              }
		              break;
		 }
	}



	public static void error(ArrayList <entity> entityList){
	    Scanner input = new Scanner(System.in);
	    System.out.println("A. Search by error");
	    
	    

	    boolean found = false;
	    char menuOption = input.next().charAt(0);

	    switch (menuOption) {
	    case 'A':
	    case 'a': System.out.print("Enter error: ");
	              String searchError = input.nextLine();
	              for (entity i : entityList){
	                  if (i.getError().equals(searchError)){
	                      System.out.println(i);
	                      found = true;
	                  }
	              }
	              
	              if ( found != true ){
	                  System.out.println("error does not exist.");
	              }
	              break;
	              
	    
	    
	    
	    }
	}
}
