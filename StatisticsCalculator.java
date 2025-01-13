public class MyEmolument extends Emolument {

   
    public MyEmolument() {
        super(0, 0);
    }


    public MyEmolument(double basic_salary, double tax_relief) {
        super(basic_salary, tax_relief);
    }

    
    public double incomeTax() {
        double taxableIncome = taxableIncome();
        double tax = 0;

        if (taxableIncome <= 500) {
            tax = taxableIncome * 0.05;
        } else if (taxableIncome <= 1000) {
            tax = 500 * 0.05 + (taxableIncome - 500) * 0.125;
        } else {
            tax = 500 * 0.05 + 500 * 0.125 + (taxableIncome - 1000) * 0.175;
        }

        return tax;
    }


    public double totalDeduction() {
        return SSNIT() + incomeTax();
    }

   
    public double netSalary() {
        return getBasicSalary() - totalDeduction();
    }
}
