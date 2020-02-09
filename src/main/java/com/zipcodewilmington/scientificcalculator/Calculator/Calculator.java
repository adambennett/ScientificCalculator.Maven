package com.zipcodewilmington.scientificcalculator.Calculator;

public class Calculator 
{
	private double value;
	private String displayString;

	public Calculator() {}
	
	public void setValue(double d) {
		this.value = d;
	}
	
	public double getValue() {
		return this.value;
	}
	
	public String getDisplayString() {
		return this.displayString;
	}
	
	public void setDisplayString(String newString) {
		this.displayString = newString;
	}
	
	public void addNum(double d) {
		this.value += d;
	}
	public void subNum  (double d){
		this.value -= d;
	}
	public void prodNum (double d) {
		this.value *=  d;

	}
	public void divNum (double d){
		this.value /= d;

	}
	public void  squareNum ( ) {
		this.value *= value;

	}
	public void  cubeNum ( ){
		this.value *= value*value;
	}
	public void sqrt() {
		this.value= Math.sqrt (value);
	}
	public void pow( double num) {
		this.value= Math.pow(value, num );

	}
	public void inv ( ){
		this.value = 1/value;

	}
	public void invert ( ){
		this.value = -value;
	}
}