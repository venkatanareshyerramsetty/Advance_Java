package com.nr.domine;
import java.util.ArrayList;

public class FlatternArray1 {
		
		
		public static void main(String[] args) 
		{
			
		
			
			// Create the main array
			Object[] array = new Object[2];
			
			// Add new arrays to the main array and store the integers.
			array[0] = new Object[3];
			((Object[]) array[0])[0] = 1;
			((Object[]) array[0])[1] = 2;
			((Object[]) array[0])[2] = new Object[1];
			((Object[])((Object[]) array[0])[2])[0] = 3;
			array[1] = 4;
			
			// Show the array of arrays composition and the expected result.
			System.out.println("With this input [[1,2,[3]],4], expected result [1, 2, 3, 4]");
			
			// Create an object of the class ArrayList to store the list of integers.
			ArrayList<Integer> result = new ArrayList<Integer>();
			
			
			try 
			{
				merge(array, result);
				
				// Show the result.
				System.out.println("Result: " + result);
			} 
			catch (InvalidTypeData ex) 
			{
				System.out.println(ex.getMessage());
			} 
			catch (Exception ex2)
			{
				ex2.printStackTrace();
			}
			
			
		}
		
		
		private static void merge(Object[] array, ArrayList<Integer> list) throws InvalidTypeData 
		{
			
			for(int i = 0; i < array.length; i++) 
			{
				
				if(array[i] instanceof Object[]) 
				{
					merge((Object[]) array[i], list);
				} 
				
				
				else if(array[i] instanceof Integer) 
				{
					list.add((Integer)array[i]);
				}
				
				
				else 
				{
					throw new InvalidTypeData("Invalid type of data. It only allows for Integers or Arrays");
				}
			}
		}

	}

	
	class InvalidTypeData extends Exception 
	{	
		
		
		public InvalidTypeData( String message )
		{
			super(message);
		}
		
		// Rewrite the method toString()
		public String toString()
		{
			return "The array sent contains data from invalid types. "
					+ "Remember that the array can contain only Integers or other arrays";
		}
	
}