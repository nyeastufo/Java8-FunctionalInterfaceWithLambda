package com.ycic.demoimpl;

interface CalculatorInterface {
	//void switchOn();
	
	//void sum(int input);
	
	int substract(int i1, int i2);
}

//public class CalculatorImpl implements CalculatorInterface {
public class CalculatorImpl {
	/*
	@Override
	public void switchOn() {
		// TODO Auto-generated method stub
		System.out.println("Switch On");
	}
	*/
	
	public static void main(String[] args) {
		// lambda : (parameter) -> { body };
		//CalculatorInterface calculator = () -> { System.out.println("Switch On"); };
		//calculator.switchOn();
		
		//CalculatorInterface calculator = (int input) -> { System.out.println("Sum " + input); }; 
		//calculator.sum(25);
		
		CalculatorInterface calculator = (i1, i2) -> { 
			if (i2 < i1)
				throw new RuntimeException("number error");
			else
				return i2 - i1; 
		};
		
		int newnum = calculator.substract(8,  20);
		System.out.println("Substract1  = " + newnum);
		newnum = calculator.substract(29,  20);
		System.out.println("Substract2  = " + newnum);
	}
}
