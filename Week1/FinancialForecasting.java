import java.util.*;


public class FinancialForecasting {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //  Ask how many months of data the user wants to enter
        System.out.print("Enter number of months of financial data: ");
        int months = sc.nextInt();

        double[] income = new double[months];
        double[] expenses = new double[months];

        //  Collect income and expenses for each month
        for (int i = 0; i < months; i++) {
            System.out.print("Month " + (i + 1) + " - Income: Rs");
            income[i] = sc.nextDouble();

            System.out.print("Month " + (i + 1) + " - Expenses: Rs");
            expenses[i] = sc.nextDouble();
        }

        // Compute total income, expenses and average savings
        double totalIncome = 0, totalExpenses = 0;

        for (int i = 0; i < months; i++) {
            totalIncome += income[i];
            totalExpenses += expenses[i];
        }

        double averageSavings = (totalIncome - totalExpenses) / months;
        double currentBalance = totalIncome - totalExpenses;

        // Display summary
        System.out.println("\n Financial Summary:");
        System.out.println("Total Income   : Rs" + totalIncome);
        System.out.println("Total Expenses : Rs" + totalExpenses);
        System.out.println("Net Savings    : Rs" + currentBalance);
        System.out.println("Average Monthly Savings: Rs" + averageSavings);

        // Forecasting for next N months
        System.out.print("\n Forecast how many months ahead: ");
        int forecastmonths = sc.nextInt();

        double projectedBalance = currentBalance + (forecastmonths * averageSavings);
        System.out.println("Projected balance after " + forecastmonths + " months: Rs" + projectedBalance);
    }
}
