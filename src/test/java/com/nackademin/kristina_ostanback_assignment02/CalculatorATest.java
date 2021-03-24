package com.nackademin.kristina_ostanback_assignment02;

import static org.junit.Assert.*;

import java.util.Random;
import java.util.logging.Logger;

import org.junit.Test;

public class CalculatorATest {
	AdvancedCalculator calculatorA = new AdvancedCalculator();
	Random random = new Random();
	public static final Logger LOG = Logger.getLogger(AdvancedCalculator.class.getName());
	
	// Sqrt
	@Test
	public void testSqrt() {
		double tempFirstNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble();
			tempExpectedResult = Math.sqrt(tempFirstNumber);
			LOG.info("Result: "+ tempExpectedResult+ " Sqrt method tested with the value: "+tempFirstNumber);
			assertEquals(calculatorA.sqrt(tempFirstNumber), tempExpectedResult, 0);
		}
	}
	@Test
	public void testSqrtMinus() {
		double tempFirstNumber = 0.0;
		double tempExpectedResult = 0.0;
			
		for (int i = 0; i < 10; i++) {
				tempFirstNumber = random.nextDouble() * (-1);
				tempExpectedResult = Math.sqrt(tempFirstNumber);
				LOG.info("Result: "+ tempExpectedResult+ " SqrtMinus method tested with the value: "+tempFirstNumber);
				assertEquals(calculatorA.sqrt(tempFirstNumber), tempExpectedResult, 0);
			}
	}
	
	@Test
	public void testSqrtZero() {
		double tempFirstNumber = 0.0;
		double tempExpectedResult = 0.0;
			
		for (int i = 0; i < 10; i++) {
				tempFirstNumber = random.nextDouble() * (0);
				tempExpectedResult = Math.sqrt(tempFirstNumber);
				LOG.info("Result: "+ tempExpectedResult+ " SqrtZero method tested with the value: "+tempFirstNumber);
				assertEquals(calculatorA.sqrt(tempFirstNumber), tempExpectedResult, 0);
			}
	}
	
	// Exp
	@Test		
	public void testExp() {
		double tempFirstNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble();
			tempExpectedResult = Math.pow(tempFirstNumber, i);
			LOG.info("Result: "+ tempExpectedResult+ "Exp method tested with the value: "+tempFirstNumber);
			assertEquals(calculatorA.exp(tempFirstNumber, i), tempExpectedResult, 0);
		
		}
	}
	@Test		
	public void testExpMinus() {
		double tempFirstNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble() * (-1);
			tempExpectedResult = Math.pow(tempFirstNumber, i);
			LOG.info("Result: "+ tempExpectedResult+ "ExpMinus method tested with the value: "+tempFirstNumber);
			assertEquals(calculatorA.exp(tempFirstNumber, i), tempExpectedResult, 0);
		
		}
	}
	
	@Test		
	public void testExpZero() {
		double tempFirstNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble() * (0);
			tempExpectedResult = Math.pow(tempFirstNumber, i);
			LOG.info("Result: "+ tempExpectedResult+ "ExpZero method tested with the value: "+tempFirstNumber);
			assertEquals(calculatorA.exp(tempFirstNumber, i), tempExpectedResult, 0);
		
		}
	}
	
	
	// Square
	@Test		
	public void testSquare() {
		double tempFirstNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble();
			tempExpectedResult = Math.pow(tempFirstNumber, 2 );
			LOG.info("Result: "+ tempExpectedResult+ " Square method tested with the value: " +tempFirstNumber);
			assertEquals(calculatorA.square(tempFirstNumber), tempExpectedResult, 0);
		
		}
	}

	
	@Test		
	public void testSquareMinus() {
		double tempFirstNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble() * (-1);
			tempExpectedResult = Math.pow(tempFirstNumber, 2);
			LOG.info("Result: "+ tempExpectedResult+ " SquareMinus method tested with the value: "+tempFirstNumber);
			assertEquals(calculatorA.square(tempFirstNumber), tempExpectedResult, 0);
		
		}
	}
	
	// AbsoluteValue
	@Test		
	public void absoluteValue() {
		double tempFirstNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble();
			tempExpectedResult = Math.abs(tempFirstNumber);
			LOG.info("Result: "+ tempExpectedResult+ " AbsoluteValue method tested with the value: "+tempFirstNumber);
			assertEquals(calculatorA.absoluteValue(tempFirstNumber), tempExpectedResult, 0);
		
		}
	}
	@Test		
	public void absoluteValueMinus() {
		double tempFirstNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble() * (-1);
			tempExpectedResult = Math.abs(tempFirstNumber);
			LOG.info("Result: "+ tempExpectedResult+ " AbsoluteValue method tested with the value: "+tempFirstNumber);
			assertEquals(calculatorA.absoluteValue(tempFirstNumber), tempExpectedResult, 0);
		
		}
	}
	
	@Test		
	public void absoluteValueZero() {
		double tempFirstNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble() * (0);
			tempExpectedResult = Math.abs(tempFirstNumber);
			LOG.info("Result: "+ tempExpectedResult+ " AbsoluteValueZero method tested with the value: "+tempFirstNumber);
			assertEquals(calculatorA.absoluteValue(tempFirstNumber), tempExpectedResult, 0);
		
		}
	}
	// Cube
	@Test		
	public void cube() {
		double tempFirstNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble();
			tempExpectedResult = Math.pow(tempFirstNumber, 3);
			LOG.info("Result: "+ tempExpectedResult+ " Cube method tested with the value: "+tempFirstNumber);
			assertEquals(calculatorA.cube(tempFirstNumber), tempExpectedResult, 0);
		
		}
	}
	
	@Test		
	public void cubeMinus() {
		double tempFirstNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble() * (-1);
			tempExpectedResult = Math.pow(tempFirstNumber, 3);
			LOG.info("Result: "+ tempExpectedResult+ " CubeMinus method tested with the value: "+tempFirstNumber);
			assertEquals(calculatorA.cube(tempFirstNumber), tempExpectedResult, 0);
		
		}
	}
	
	@Test		
	public void cubeZero() {
		double tempFirstNumber = 0.0;
		double tempExpectedResult = 0.0;
		
		for (int i = 0; i < 10; i++) {
			tempFirstNumber = random.nextDouble() * (0);
			tempExpectedResult = Math.pow(tempFirstNumber, 3);
			LOG.info("Result: "+ tempExpectedResult+ " CubeZero method tested with the value: "+tempFirstNumber);
			assertEquals(calculatorA.cube(tempFirstNumber), tempExpectedResult, 0);
		
		}
	}
	
	
	
	
	
		//assertEquals(calculatorA.sqrt(16),4,0);
		//assertEquals(calculatorA.exp(6,0),1,0);		
		//assertEquals(calculatorA.square(4),16,0);
		//assertEquals(calculatorA.absoluteValue(8),8,0);
		//assertEquals(calculatorA.cube(3),27,0);

	}


