package edu.handong.csee.java.Lab09;

public class SalesReporter {
	
	private double highestSales;
	private double averageSales;
	private SalesAssociate[] team;
	private int numberOfAssociates;

	public void getData(){
		String name;
		double sales
		SalesAssociate associate = new SalesAssociate();
		System.out.println("Enter the associate number" + numberOfAssociates);
		System.out.println("Enter name of sales associate : ");
		
		associate.setName( );
		System.out.println("Enter associate's sales : $");
		associate.setSales( );
		team[numberOfAssociates] = associate;
	}
	
	public void computeStats(){
		double SumforAverage = 0.0;
		double Average;
		double BestSales = 0.0;
		String BestAssociate = "";
		SalesAssociate associate_2 = new SalesAssociate();
		for(int i = 0; i>= numberOfAssociates ;i++){
			associate_2 = team[numberOfAssociates];
			SumforAverage += associate_2.getSales();
			
			if(BestSales<=associate_2.getSales()){
				BestSales=associate_2.getSales();
				BestAssociate = associate_2.getName();
			}
		}
		
		Average = SumforAverage/numberOfAssociates;
		associate_2.setName(BestAssociate);
		associate_2.setSales(BestSales);
		team[numberOfAssociates+1] = associate_2;
		team[numberOfAssociates+2].setSales(Average);
	}
	
	public void displayResults(){
		SalesAssociate associate_3 = new SalesAssociate();
		double deviation;
		double Average = team[numberOfAssociates+2].getSales();
		associate_3 = team[numberOfAssociates+1];
		System.out.println("Average sales per associate is $" + Average);
		System.out.println("The highest sales figure is $" + associate_3.getSales());
		System.out.println("The following had the highest sales:");
		System.out.println("Name : " + associate_3.getName());
		System.out.println("Sales : $" + associate_3.getSales());
		deviation = associate_3.getSales() - Average;
		System.out.println("$" + deviation + "above the average.");
		System.out.println("The rest performed as follows :\n\n");
		
		for(int i = 0;i>=numberOfAssociates;i++){
			associate_3 = team[i];
			System.out.println("Name : " + associate_3.getName());
			System.out.println("Sales : $" + associate_3.getSales());
			deviation = associate_3.getSales() - Average;
			if (deviation>0)
				System.out.println("$" + deviation + "above the average.\n");
			else
				System.out.println("$" + -deviation + "below the average.\n");
		}
	}
	
	public void run(){
		getData();
		computeStats();
		displayResults();
	}
	
	public static void main(String[] args) {
		
		SalesReporter reporter = new SalesReporter();
		reporter.run();
	}

}
