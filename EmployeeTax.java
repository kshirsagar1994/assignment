package com.cognizant.shapes;

public class EmployeeTax {
	public static void main(String[] args) {
        TaxCalculator calculator1 = new TaxCalculator(25000, true);
        calculator1.calculateTax();
        calculator1.deductTax();
        calculator1.validateSalary();

        TaxCalculator calculator2 = new TaxCalculator(125000, true);
        calculator2.calculateTax();
        calculator2.deductTax();
        calculator2.validateSalary();
    }
}

