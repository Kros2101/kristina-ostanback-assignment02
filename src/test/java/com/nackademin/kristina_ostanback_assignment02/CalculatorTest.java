package com.nackademin.kristina_ostanback_assignment02;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorTest {
	BasicCalculator calculator = new BasicCalculator();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(BasicCalculator.class.getName());
		
	// Addition
	@Test
	public void testAddition() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble();
			tempSecondNumber = random.nextDouble();
			tempExpectedResult = tempFirstNumber + tempSecondNumber;
			LOG.info("Result: "+ tempExpectedResult+ " Addition method tested with the value: "+tempFirstNumber + " and "+tempSecondNumber);
			assertEquals(calculator.addition(tempFirstNumber,tempSecondNumber), tempExpectedResult, 0);
		}
	}	
	@Test
	public void testAdditionMinus() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble() * (-1);
			tempSecondNumber = random.nextDouble() *(-1);
			tempExpectedResult = tempFirstNumber + tempSecondNumber;
			LOG.info("Result: "+ tempExpectedResult+ " AdditionMinus method tested with the value: "+tempFirstNumber + " and "+tempSecondNumber);
			assertEquals(calculator.addition(tempFirstNumber,tempSecondNumber), tempExpectedResult, 0);
		}
	}	
	@Test
	public void testAdditionZero() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble() * (0);
			tempSecondNumber = random.nextDouble() * 1;
			tempExpectedResult = tempFirstNumber + tempSecondNumber;
			LOG.info("Result: "+ tempExpectedResult+ " AdditionMinus method tested with the value: "+tempFirstNumber + " and "+tempSecondNumber);
			assertEquals(calculator.addition(tempFirstNumber,tempSecondNumber), tempExpectedResult, 0);
		}
	}	
	
	// Subtraction
	@Test
	public void testSubtraction() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble();
			tempSecondNumber = random.nextDouble();
			tempExpectedResult = tempFirstNumber - tempSecondNumber;
			LOG.info("Result: "+ tempExpectedResult+ " Addition method tested with the value: "+tempFirstNumber + " and "+tempSecondNumber);
			assertEquals(calculator.subtraction(tempFirstNumber,tempSecondNumber), tempExpectedResult, 0);
		}
	}	
	@Test
	public void testSubtractionMinus() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble() * (-1);
			tempSecondNumber = random.nextDouble() *(-1);
			tempExpectedResult = tempFirstNumber - tempSecondNumber;
			LOG.info("Result: "+ tempExpectedResult+ " SubtractionMinus method tested with the value: "+tempFirstNumber + " and "+tempSecondNumber);
			assertEquals(calculator.subtraction(tempFirstNumber,tempSecondNumber), tempExpectedResult, 0);
		}
	}	
	@Test
	public void testSubtractionZero() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble() * (0);
			tempSecondNumber = random.nextDouble() * 1;
			tempExpectedResult = tempFirstNumber - tempSecondNumber;
			LOG.info("Result: "+ tempExpectedResult+ " SubtractionZero method tested with the value: "+tempFirstNumber + " and "+tempSecondNumber);
			assertEquals(calculator.subtraction(tempFirstNumber,tempSecondNumber), tempExpectedResult, 0);
		}
	}	
	
	// Multiplication
		@Test
		public void testMultiplication() {
			double tempFirstNumber = 0.0;
			double tempSecondNumber = 0.0;
			double tempExpectedResult = 0.0;
			
			for (int i = 0; i < 10; i++) {
				tempFirstNumber = random.nextDouble();
				tempSecondNumber = random.nextDouble();
				tempExpectedResult = tempFirstNumber * tempSecondNumber;
				LOG.info("Result: "+ tempExpectedResult+ " Multiplication method tested with the value: "+tempFirstNumber + " and "+tempSecondNumber);
				assertEquals(calculator.multiplication(tempFirstNumber,tempSecondNumber), tempExpectedResult, 0);
			}
		}	
		@Test
		public void testMultiplicationMinus() {
			double tempFirstNumber = 0.0;
			double tempSecondNumber = 0.0;
			double tempExpectedResult = 0.0;
			
			for (int i = 0; i < 10; i++) {
				tempFirstNumber = random.nextDouble() * (-1);
				tempSecondNumber = random.nextDouble() *(-1);
				tempExpectedResult = tempFirstNumber * tempSecondNumber;
				LOG.info("Result: "+ tempExpectedResult+ " MultiplacationMinus method tested with the value: "+tempFirstNumber + " and "+tempSecondNumber);
				assertEquals(calculator.multiplication(tempFirstNumber,tempSecondNumber), tempExpectedResult, 0);
			}
		}	
		@Test
		public void testMultiplicationZero() {
			double tempFirstNumber = 0.0;
			double tempSecondNumber = 0.0;
			double tempExpectedResult = 0.0;
			
			for (int i = 0; i < 10; i++) {
				tempFirstNumber = random.nextDouble() * (0);
				tempSecondNumber = random.nextDouble() * 1;
				tempExpectedResult = tempFirstNumber * tempSecondNumber;
				LOG.info("Result: "+ tempExpectedResult+ " MultiplicationZero method tested with the value: "+tempFirstNumber + " and "+tempSecondNumber);
				assertEquals(calculator.multiplication(tempFirstNumber,tempSecondNumber), tempExpectedResult, 0);
			}
		}	
	
	// Division
	@Test
	public void testDivision() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble();
			tempSecondNumber = random.nextDouble();
			tempExpectedResult = tempFirstNumber / tempSecondNumber;
			LOG.info("Result: "+ tempExpectedResult+ " Division method tested with the value: "+tempFirstNumber + " and "+tempSecondNumber);
			assertEquals(calculator.division(tempFirstNumber,tempSecondNumber), tempExpectedResult, 0);
		}
	}	
	@Test
	public void testDivisionMinus() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble() * (-1);
			tempSecondNumber = random.nextDouble() *(-1);
			tempExpectedResult = tempFirstNumber / tempSecondNumber;
			LOG.info("Result: "+ tempExpectedResult+ " DivisionMinus method tested with the value: "+tempFirstNumber + " and "+tempSecondNumber);
			assertEquals(calculator.division(tempFirstNumber,tempSecondNumber), tempExpectedResult, 0);
		}
	}	
	@Test
	public void testDivisionZero() {
		double tempFirstNumber = 0.0;
		double tempSecondNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble() * (0);
			tempSecondNumber = random.nextDouble() * 1;
			tempExpectedResult = tempFirstNumber / tempSecondNumber;
			LOG.info("Result: "+ tempExpectedResult+ " DivisionZero method tested with the value: "+tempFirstNumber + " and "+tempSecondNumber);
			assertEquals(calculator.division(tempFirstNumber,tempSecondNumber), tempExpectedResult, 0);
		}
	}	
	
	
	
	
	
	
	
	
		//assertEquals(calculator.addition(2,1),3,0);
		//assertEquals(calculator.subtraction(6,1),5,0);
		//assertEquals(calculator.multiplication(2,3),6,0);
		//assertEquals(calculator.division(24,8),3,0);	
	
}


