import java.util.Scanner;

public class TestClass {

	
	public static String LongestWord(String sen) { 
		  
	    // code goes here   
	    /* Note: In Java the return type of a function and the 
	       parameter types being passed are defined, so this return 
	       call must match the return type of the function.
	       You are free to modify the return type. */
	       String[] str = sen.split(" ");
	       String temp;
	       for (int i=0; i<str.length; i++){
	         
	         for (int j=i+1; j<str.length; j++){
	        	 str[i] = str[i].replaceAll("[^a-zA-Z0-9]", "");
	             str[i] = str[i].replaceAll("[^A-Za-z0-9]","");
	           if (!(str[i].length() >= str[j].length())){
	             temp = str[i];
	             str[i] = str[j];
	             str[j] = temp;
	           }
	         }
	       }
	       sen = str[0];
	    return sen;
	    
	  } 
	  
	  public static void main (String[] args) {  
	    // keep this function call here     
	    Scanner s = new Scanner(System.in);
	    System.out.print(LongestWord(s.nextLine())); 
	  }  
}
