package edu.handong.csee.java.Lab09;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * This class calculate average sales, find highestSales, compare all associates to average, and display it.
 * The SalesReporter has members which are highestSales, averageSales, numberOfAssociates and team.
 * The SalesReporter has methods which are getData(), computeStats(), and displayResults().
 * 
 * 21500222 Nam Yunbin
 * 
 */

public class SalesReporter {
	
	private double highestSales;  // highest sales among the associates' sales
	private double averageSales;  // average sales for the associates' sales
	private ArrayList<SalesAssociate> team;  // ArrayList that save SalesAssociate
	private int numberOfAssociates=0; // number of associates in array

	/** Get name and sales from user and set them to SalesAssociate array team. */
	public void getData(){
		String name;		// declare variable that use for associate's name
		double sales;		// declare variable that use for associate's sales

		Scanner keyboard = new Scanner(System.in);  // declare scanner
		SalesAssociate associate = new SalesAssociate();  // declare SalesAssociate class type instance
		System.out.println("Enter name of sales associate : ");  // request user to input name
		name = keyboard.nextLine(); 	// get string from keyboard
		System.out.println("Enter associate's sales : $");  //request user to input sales
		sales = keyboard.nextDouble();	// get double from keyboard
		associate.setName(name);	// set name to SalesAssociate class
		associate.setSales(sales);	// set sales to SalesAssociate class
		team.add(associate);	// save associate's information to team
		numberOfAssociates++;	// saving last member's index
	}
	
	/** find highest sales and calculate average sales */	
	
	public void computeStats(){
		double SumforAverage = 0.0; // declare variable that use for sales' sum 
		highestSales = 0.0; // initialize highestSales to compare with other Sales
		SalesAssociate associate_2 = new SalesAssociate(); // declare SalesAssociate class type instance
		
		for(int i = 0; i<numberOfAssociates ;i++){
			associate_2 = team.get(i);				// call team's member
			SumforAverage += associate_2.getSales();  // make SumforAverage sales' sum
			
			if(highestSales<associate_2.getSales()){
				highestSales=associate_2.getSales(); // find highestSales with comparing
			}
		}
		
		averageSales = SumforAverage/(numberOfAssociates);  // divide SumforAverage to number of associate to get average
		
	}
	
	/** display highest sales and its associate, and the other associate and sales compare to average. */
	public void displayResults(){
		SalesAssociate associate_3 = new SalesAssociate();  // declare SalesAssociate class type instance
		
		double deviation;	// declare variable for saving deviation compare to average
		int bestAssociate = 0;  // declare variable to check where best sales is 
		
		for(int k = 0; k<numberOfAssociates;k++){
			if(team.get(k).getSales()==highestSales)
				bestAssociate = k;	// save position of best sales at bestAssociate
		}
		associate_3 = team.get(bestAssociate); // initialize associate_3 to team's member who has best sales 
		
		System.out.println( "\nAverage sales per associate is $" + averageSales +
							"\nThe highest sales figure is $" + highestSales + "\n" +
							"\nThe following had the highest sales:" +
							"\nName : " + associate_3.getName() +
							"\nSales : $" + highestSales +
							"\n$" + (highestSales-averageSales) + " above the average.\n" +
							"\nThe rest performed as follows :"); // print associate's information that have best sales
		
		for(int i = 0;i<numberOfAssociates;i++){
			if(i==bestAssociate)
				continue;		// don't print associate's information that have best sales
			associate_3 = team.get(i);  // initialize associate_3 to team's member 
			System.out.println("Name : " + associate_3.getName());  // print associate's name
			System.out.println("Sales : $" + associate_3.getSales()); // print associate's sales
			deviation = associate_3.getSales() - averageSales;	// initialize variable to substraction sales to averagesales   
			
			if (deviation>=0)
				System.out.println("$" + deviation + " above the average.\n"); // print if sales is more than average
			else
				System.out.println("$" + (-deviation) + " below the average.\n");  // print if sales is less than average
		}
	}
	
	/** run methods that in SalesReporter */
	public void run(){
		String moreAssociate; // variable which use for asking user to insert more Associate or not
		team = new ArrayList<SalesAssociate>();	 // instantiating ArrayList team
		Scanner keyboard = new Scanner(System.in); // declare scanner
				
		while(true){
			getData(); 		// run getData()
			System.out.println("Do you want to insert more associate?");	// asking user to insert more Associate or not
			moreAssociate = keyboard.nextLine();	// user input feedback
			if(moreAssociate.equalsIgnoreCase("no"))
				break;		// if user don't want more associate, get out of loop
		}
		
		computeStats(); // run computeStats()
		displayResults(); // run displayResults() 
	}

	/** Do run() method */
	public static void main(String[] args) {
		
		SalesReporter reporter = new SalesReporter(); // declare SalesAssociate class type instance
		reporter.run(); // run run()
	}

}