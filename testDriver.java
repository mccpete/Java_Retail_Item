import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;
import java.util.Scanner;

public class testDriver {
//Peter McLane 5/5/21
//this program is a test driver for the retail item class
	public static void main(String[] args) throws FileNotFoundException {
		 
		int MAX_ITEMS = 3;
	    //here we are importing and reading the file and its contents
			File file = new File("RetailItemDatabase.txt");
	        Scanner scan = new Scanner(file);
	        RetailItem[] retailItems = new RetailItem[MAX_ITEMS];
	        int currentItem = 0;
	        while(currentItem < MAX_ITEMS && scan.hasNextLine()){
	            retailItems[currentItem] = new RetailItem();
	            currentItem++;
	        }
	        scan.close();
	        //this statement will print if the file is able to be read
	        System.out.println("Read from file successful");
	        for(int i = 0;i < retailItems.length;i++){
	        	//each print statement will display the item, description, price, or the units on hand
	            System.out.println("Item " + (i + 1) + " details : ");
	            System.out.println("Description : " + retailItems[i].getDescription());
	            System.out.println("Price : " + retailItems[i].getPrice());
	            System.out.println("Units on hand : " + retailItems[i].getUnitsOnHand());
	            System.out.println();
	        }
	        PrintWriter writer1 = new PrintWriter(new File("newRetailItemDatabase.txt"));
	        for(int i = 0; i < retailItems.length; i++){
	            retailItems[i].writeData(writer1);
	        }
	        writer1.close();
	        //prints if file is able to be written to 
	        System.out.println("Write to file successful");

	    }
	}