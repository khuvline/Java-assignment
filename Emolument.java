import java.util.Arrays;
import java.util.Scanner;

public class StatisticsCalculator {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        
        System.out.print("Enter the number of elements: ");
        int n = scanner.nextInt();

        
        if (n <= 0) {
            System.out.println("Number of elements must be greater than zero.");
            return;
        }
        double[] numbers = new double[n];
        System.out.println("Enter the elements:");
        for (int i = 0; i < n; i++) {
            numbers[i] = scanner.nextDouble();
        }

        
        double mean = calculateMean(numbers);
        double median = calculateMedian(numbers);
        double standardDeviation = calculateStandardDeviation(numbers);

       
        System.out.printf("Mean: %.2f%n", mean);
        System.out.printf("Median: %.2f%n", median);
        System.out.printf("Standard Deviation: %.2f%n", standardDeviation);

        scanner.close();
    }

    
    public static double calculateMean(double[] numbers) {
        double sum = 0;
        for (double num : numbers) {
            sum += num;
        }
        return sum / numbers.length;
    }

   
    public static double calculateMedian(double[] numbers) {
        Arrays.sort(numbers);
        int length = numbers.length;
        if (length % 2 == 0) {
            return (numbers[length / 2 - 1] + numbers[length / 2]) / 2.0;
        } else {
            return numbers[length / 2];
        }
    }

   
    public static double calculateStandardDeviation(double[] numbers) {
        if (numbers.length < 2) {
            System.out.println("Standard deviation cannot be calculated for less than two numbers.");
            return 0;
        }
        double mean = calculateMean(numbers);
        double sumOfSquaredDifferences = 0;
        for (double num : numbers) {
            sumOfSquaredDifferences += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumOfSquaredDifferences / numbers.length);
    }
}
