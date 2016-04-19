package com.spring.core;

import java.text.DecimalFormat;

public class AnotherHello {
	private double val1;
	private double val2;
	private double answer;
	
	public void getAnswer() {
		answer = val1 + val2;		
		System.out.println("Your answer: " + new DecimalFormat("#.##").format(answer) );
	}
	public void setAnswer(double answer) {
		this.answer = answer;
	}
	public void setVal1(double val1) {
		this.val1 = val1;
	}
	public void setVal2(double val2) {
		this.val2 = val2;
	}
	
}
