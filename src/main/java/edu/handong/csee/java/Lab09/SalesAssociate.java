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
	
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public double getSales() {
		return sales;
	}
	public void setSales(double sales) {
		this.sales = sales;
	}
	
}
