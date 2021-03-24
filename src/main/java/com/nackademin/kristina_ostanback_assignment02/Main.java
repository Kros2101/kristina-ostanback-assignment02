package com.nackademin.kristina_ostanback_assignment02;
public class Main {

	public static void main(String[] args) {
		BasicCalculator bc = new BasicCalculator();
		System.out.println("Basic Calculations: ");
		System.out.println(bc.addition(2,2));
		System.out.println(bc.subtraction(5,3));
		System.out.println(bc.multiplication(6,4));
		System.out.println(bc.division(24, 8));
		
		System.out.println("Advanced Calculations");
		AdvancedCalculator ac = new AdvancedCalculator();
		System.out.println(ac.sqrt(16));
		System.out.println(ac.exp(6,0));
		System.out.println(ac.square(4));
		System.out.println(ac.absoluteValue(8));
		System.out.println(ac.cube(3));

	}

}
