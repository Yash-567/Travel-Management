import java.util.*;
import java.sql.*;

public class Menu {
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
        int choice=0;
        String name;
        Queue<Customer> customers = new LinkedList<Customer>();
        
        
		do
        {
        System.out.println("\n TRAVEL MANAGEMENT  SYSTEM");
        System.out.println("1. Register as Customer");
        System.out.println("2. Update Customer Profile");
        System.out.println("3. Serve Customer");
        System.out.println("4. View Customer Details");
        System.out.println("5. Chat as a Customer");
        System.out.println("6. Chat as an Employee");
        System.out.println("7. Exit");
        System.out.println("Choose an option");
        choice = sc.nextInt();
        switch(choice){
            case 1:  
            	Customer newCustomer = new Customer();
            	newCustomer.getDetails();
            	customers.add(newCustomer);
            	System.out.println("Customer added to queue!");
                break;
            case 2:
            	System.out.println("Enter name of the customer to update:");
            	sc.nextLine();
            	name = sc.nextLine();
            	
            	for(Customer updateCustomer: customers) {
            		if(updateCustomer.name.equals(name)) {
            			updateCustomer.updateProfile();
            		}
            	}
            	System.out.println("Profile updated successfully!");
                break;
            case 3:
            	Customer serveCustomer = new Customer();
            	System.out.println("Serving first in line customer: ");
            	serveCustomer = customers.remove();
            	serveCustomer.showData();
            	break;
            case 4:
            	System.out.println("Enter name of the customer:");
            	sc.nextLine();
            	name = sc.nextLine();
            	
            	for(Customer showCustomer: customers) {
            		if(showCustomer.name.equals(name)) {
            			showCustomer.showData();
            		}
            	}
            	break;
            case 5: 
            	System.out.println("Welcome to Travello Customer Support");
            	break;
            case 6:
            	System.out.println("Welcome to Travello Employee Hub");
            	break;
            case 7:
            	System.out.println("Thank You for choosing Travello!");
            	sc.close();
            	System.exit(0);
            	break;
            default:
                 System.out.println("Invalid choice"); 
        }
        }while(true);
      
    }
    
}
