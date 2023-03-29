package com.cognizant.shapes;

public class TaxCalculator {
	
	private float basicSalary;
    private boolean citizenship;
    private float tax;
    private int nettSalary;

    public TaxCalculator(float basicSalary, boolean citizenship) {
        this.basicSalary = basicSalary;
        this.citizenship = citizenship;
    }

    public void calculateTax() {
        tax = 30 * basicSalary / 100;
        System.out.println("The Tax of the employee for the " + basicSalary + " is " + tax);
    }

    public void deductTax() {
        nettSalary = (int) (basicSalary - tax);
        System.out.println("The nett salary of the employee " + nettSalary);
    }

    public void validateSalary() {
        boolean response = (basicSalary > 100000 && citizenship);
        System.out.println("The salary and citizenship eligibility: " + response);
    }
}

