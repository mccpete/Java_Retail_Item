import java.io.PrintWriter;
import java.util.Scanner;

public class RetailItem {
//Peter McLane 5/5/21
//this class will serve as the backbone to the retail program for the menu system
	    String description = "";
	    int unitsOnHand;
	    double price;


	    public String getDescription() {
	        return description;
	    }

	    public void setDescription(String description) {
	        if(description == null)
	        	//if user does not put description we tell them to put one in 
	        	System.out.println("Please insert a description here");
	            this.description = description;
	    }

	    public int getUnitsOnHand() {
	        return unitsOnHand;
	    }

	    public void setUnitsOnHand(int unitsOnHand) {
	        if(unitsOnHand < 0)
	        	//if the user enters a negative number we make them put in a positive
	        System.out.println("Negative units on hand please enter a positive number");
	        this.unitsOnHand = unitsOnHand;
	    }

	    public double getPrice() {
	        return price;
	    }

	    public void setPrice(double price) {
	        if(price < 0) 
	        	//price cannot be negative so user has to enter positive number
	        System.out.println("A Negative price is not possible please enter a positive number");
	        this.price = price;
	    }
	    //method that reads data from file
	    public void readData(String description){
	    	
	    int failed = 0;  
		Scanner scan = new Scanner(description);
		
		if(scan.hasNext()){
			
			int i = 0;
			while(scan.hasNextInt()){
				int unitsOnHand = scan.nextInt();
				if( unitsOnHand < 0 ){
					unitsOnHand = 0;
					failed = -1;
				}
				
				
			}
			
		}
		scan.close();
		
     }
		

	    //method that writes data to file
	    void writeData(PrintWriter pw){
	        pw.write(getDescription() + " " + getPrice() + " " + getUnitsOnHand() + "\n");
	    }
}