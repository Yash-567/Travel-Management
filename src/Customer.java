import java.util.Scanner;

public class Customer {
	String name;
	String address;
	int age;
	char gender;
	String country;  // Country the customer resides in 
	String origin;  // Place the tour will start from
	String destination;    // Place the tour will end in
	int budget;
	String month;
	
	Scanner sc = new Scanner(System.in);
	
	public void getDetails() {
		System.out.println("WELCOME TO TRAVELLO! Please enter the details below:");
		
		System.out.println("Enter Name:");
		name = sc.nextLine();
		
		System.out.println("Enter age");
		age = sc.nextInt();
		
		System.out.println("Enter gender(M/F):");
		gender = sc.next().charAt(0);
		
		sc.nextLine();
		
		System.out.println("Enter address:");
		address = sc.nextLine();
		
		System.out.println("Which country do you reside in?");
		country = sc.nextLine();
		
		System.out.println("Start location of trip preferred:");
		origin = sc.nextLine();

		System.out.println("Destination preferred:");
		destination = sc.nextLine();
		
		System.out.println("Budget for trip: ");
		budget = sc.nextInt();
		
		sc.nextLine();
		
		System.out.println("Preferred month of travel: ");
		month = sc.nextLine();
		
		System.out.println("Thank you! The details have been successfully stored :)");
	}
	
	public void showData() {
		System.out.println("The details for the customer are as follows: ");
		
		System.out.println("Name: "+ name);
		System.out.println("Age"+ age);
		System.out.println("Gender: "+ gender);
		System.out.println("Address: "+ address);
		System.out.println("Country of residence: "+ country);
		System.out.println("Start journey: "+ origin);
		System.out.println("End journey: "+ destination);
		System.out.println("Budget: "+ budget);
		System.out.println("Month of travel: "+ month);
	}
	
	public void updateProfile() {
		getDetails();
		showData();
	}
}
