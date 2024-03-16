import java.util.Scanner;

public class Playoffs {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		Scanner in = new Scanner(System.in);
		
		System.out.println("enter a number");
		
		 Scanner input = new Scanner(System.in);
	        String day = input.nextLine();
	    /***** DO NOT CHANGE THE CODE ABOVE THIS LINE *****/  
	      
	      // WRITE YOUR CODE HERE
	        
	       
	       
	    //switch (day.toLowerCase()) {
	        
switch(day.toLowerCase()) {
        
        case "monday":
        case "tuesday":
        case "wednesday":
        case "thursday":
        case "friday":
            
            System.out.println (day + " is a weekday.");
            break;
            
        case  "saturday":
        case  "sunday":
            System.out.println(day + " is a weekend.");
            break;
        default:
        System.out.println("Invalid day!");
            break;
    }
	}
}

	


