
package com.nackademin.kristina_ostanback_assignment02;

public class BasicCalculator implements BasicOperations{

	@Override
	public double addition(double firstNumber, double secondNumber){
		return firstNumber + secondNumber;
	}
	@Override
	public double subtraction(double firstNumber, double secondNumber){
		return firstNumber - secondNumber;
	}
	@Override
	public double multiplication(double firstNumber, double secondNumber) {
		return firstNumber * secondNumber;
	}
	@Override
	public double division(double firstNumber, double secondNumber) {
		// TODO Auto-generated method stub
		return firstNumber / secondNumber;
	}

}
