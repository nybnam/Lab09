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
	private String name;   // associate's name
	private double sales;  // associate's sales
	
	/** return name that SalesAssociate's member, name */
	public String getName() {
		return name; // return SaleAssociate's member name
	}
	
	/** set name in SalesAssociate */
	public void setName(String name) {
		this.name = name; // set name given string
	}
	
	/** return sales that SalesAssociate's member, sales */
	public double getSales() {
		return sales; // return SalesAssociate's member sales
	}
	
	/** set sales in SalesAssociate */
	public void setSales(double sales) {
		this.sales = sales; // set sales given double
	}
	
}
