package com.formation.bank;

public interface InterestCalculator {
	
	public void setRate(double rate);
	public double calculate(double amount, double year);

}
