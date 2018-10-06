package com.nt.naresh;

public class entity {

	private String error;
    private String exception;
    private static int songCounter = 0;

    //Constructors for Song class.      
    public entity(String error, String exception){
        this.error = error;
        this.exception = exception;
        songCounter++;
    }
  //Get and Set methods 
    public String getError(){
        return error;
    }

    public void setError(String error) {
        this.error = error;
    }

    public String getException(){
        return exception;
    }

    public void setException(String exception) {
        this.exception = exception;
    }

    
    public static int getSongCounter(){
        return songCounter;
    }
    //Overriding the toString() function.
    public String toString(){
        return error +" "+exception+" ";
    }
 
}
