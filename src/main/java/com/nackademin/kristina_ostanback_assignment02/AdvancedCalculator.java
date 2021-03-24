package com.nackademin.kristina_ostanback_assignment02;

public class AdvancedCalculator extends BasicCalculator implements AdvancedOperations{

	//public static void main(String[] args) {
	//}
	
	@Override
	public double sqrt(double firstNumber) {
		double result = Math.sqrt(firstNumber);
		return result;
	}
	@Override
	public double exp(double firstNumber, int i) {
		double result = Math.pow(firstNumber, i);
		return result;
	}
	@Override
	public double square(double firstNumber) {
		double result = Math.pow(firstNumber, 2);
		return result;
	}
	@Override
	public double absoluteValue(double firstNumber) {
		double result = Math.abs(firstNumber);
		return result;
	}
	@Override
	public double cube(double firstNumber) {
		double result = Math.pow(firstNumber, 3);
		return result;
	}
	
}
