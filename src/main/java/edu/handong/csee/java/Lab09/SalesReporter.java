package edu.handong.csee.java.Lab09;

/**
 * This class calculate average sales, find associate that make highestSales,
 * and compare all associates to average.
 * The SalesReporter has highestSales, averageSales, numberOfAssociates and team members.
 * The SalesReporter has getData(), computeStats(), and displayResults() methods.
 * 
 * 21500222 Nam Yunbin
 * 
 */


import java.util.Scanner;
public class SalesReporter {
	
	private double highestSales;
	private double averageSales;
	private SalesAssociate[] team;
	private int numberOfAssociates = 0;

	public void getData(){
		String name;
		double sales;
		Scanner keyboard = new Scanner(System.in);
		SalesAssociate associate = new SalesAssociate();
		System.out.println("Enter the associate number " + (numberOfAssociates+1));
		System.out.println("Enter name of sales associate : ");
		name = keyboard.nextLine();
		System.out.println("Enter associate's sales : $");
		sales = keyboard.nextDouble();
		associate.setName(name);
		associate.setSales(sales);
		team[numberOfAssociates] = associate;
		numberOfAssociates++;
	}
	
	public void computeStats(){
		double SumforAverage = 0.0;
		String BestAssociate = "";
		highestSales = 0.0;
		SalesAssociate associate_2 = new SalesAssociate();
		for(int i = 0; i<=numberOfAssociates ;i++){
			associate_2 = team[i];
			SumforAverage += associate_2.getSales();
			
			if(highestSales<=associate_2.getSales()){
				highestSales=associate_2.getSales();
				BestAssociate = associate_2.getName();
			}
		}
		
		averageSales = SumforAverage/(numberOfAssociates+1);
		associate_2.setName(BestAssociate);
		associate_2.setSales(highestSales);
		team[numberOfAssociates+1] = associate_2;
	}
	
	public void displayResults(){
		SalesAssociate associate_3 = new SalesAssociate();
		double deviation;
		associate_3 = team[numberOfAssociates+1];
		System.out.println( "\nAverage sales per associate is $" + averageSales +
							"\nThe highest sales figure is $" + highestSales + "\n" +
							"\nThe following had the highest sales:" +
							"\nName : " + associate_3.getName() +
							"\nSales : $" + highestSales +
							"\n$" + (highestSales-averageSales) + " above the average.\n" +
							"\nThe rest performed as follows :");
		
		for(int i = 0;i<=numberOfAssociates;i++){
			associate_3 = team[i];
			System.out.println("Name : " + associate_3.getName());
			System.out.println("Sales : $" + associate_3.getSales());
			deviation = associate_3.getSales() - averageSales;
			if (deviation>=0)
				System.out.println("$" + deviation + " above the average.\n");
			else
				System.out.println("$" + (-deviation) + " below the average.\n");
		}
	}
	
	public void run(){
		int n;
		System.out.println("Enter number of sales associates");
		Scanner scanner = new Scanner(System.in);
		n = scanner.nextInt();
		SalesAssociate[] A = new SalesAssociate[10];
		team = A;
		
		for(int t=1;t<=n;t++){
			getData();
		}
		numberOfAssociates--;
		
		computeStats();
		displayResults();
	}

	
	public static void main(String[] args) {
		
		SalesReporter reporter = new SalesReporter();
		reporter.run();
	}

}