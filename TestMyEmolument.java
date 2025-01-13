import javax.swing.JOptionPane;

public class TestMyEmolument {

    public static void main(String[] args) {
        double basicSalary = Double.parseDouble(JOptionPane.showInputDialog("Enter Basic Salary:"));
        double taxRelief = Double.parseDouble(JOptionPane.showInputDialog("Enter Tax Relief:"));

        MyEmolument staffSalary = new MyEmolument(basicSalary, taxRelief);

        String result = String.format(
                "Basic Salary: %.2f\nTax Relief: %.2f\nSSNIT Contribution: %.2f\nTaxable Income: %.2f\nIncome Tax: %.2f\nTotal Deduction: %.2f\nNet Salary: %.2f",
                staffSalary.getBasicSalary(),
                staffSalary.getTaxRelief(),
                staffSalary.SSNIT(),
                staffSalary.taxableIncome(),
                staffSalary.incomeTax(),
                staffSalary.totalDeduction(),
                staffSalary.netSalary());

        JOptionPane.showMessageDialog(null, result, "Salary Details", JOptionPane.INFORMATION_MESSAGE);
    }
}
