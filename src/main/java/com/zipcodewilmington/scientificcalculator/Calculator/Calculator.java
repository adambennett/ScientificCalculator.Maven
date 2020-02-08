package com.zipcodewilmington.scientificcalculator.Calculator;

public class Calculator 
{
    private double value;
    private String displayString;

    public Calculator() {
        this.value = 0;
    }

    public void addNum(double d) {
        this.value += d;
    }

    public void sqrt()
    {
        this.value = Math.sqrt(this.value);
    }

}
