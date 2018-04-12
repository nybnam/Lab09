package edu.handong.csee.java.Lab09;

/**
 * This class defines associate's informations. 
 * The SalesAssociate has name and sales members.
 * The SalesAssociate has getName(), setName(String name), getSales() and SetSales(double sales) methods.
 * 
 * 21500222 Nam Yunbin
 * 
 */

public class SalesAssociate {
	private String name;
	private double sales;
	
	/** return name that SalesAssociate's member, name */
	public String getName() {
		return name;
	}
	
	/** set name in SalesAssociate */
	public void setName(String name) {
		this.name = name;
	}
	
	/** return sales that SalesAssociate's member, sales */
	public double getSales() {
		return sales;
	}
	
	/** set sales in SalesAssociate */
	public void setSales(double sales) {
		this.sales = sales;
	}
	
}
