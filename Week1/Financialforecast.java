import java.util.*;
public class Financialforecast {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        //how many months of data user want to enter
        System.out.print("Enter number of months of financial data: ");
        int months=sc.nextInt();
        double[] income=new double[months];
        double[] expenses=new double[months];
        //collect income and expenses for each month
        for(int i=0;i<months;i++){
            System.out.print("Month "+(i+1)+"Income: Rs");
            income[i]=sc.nextDouble();
            System.out.print("Month "+(i+1)+" Expenses: Rs");
            expenses[i]=sc.nextDouble();
        }
        double totalincome=0,totalexpenses=0;
        for(int i=0;i<months;i++){
            totalincome+=income[i];
            totalexpenses+=expenses[i];
        }
        double averageSavings=(totalincome-totalexpenses)/months;
        double currentBalance=totalincome-totalexpenses;
        //display summary
        System.out.println("\n Financial summary:");
        System.out.println("Total Income :Rs"+totalincome);
        System.out.println("Total Expenses :Rs"+totalexpenses);
        System.out.println("Net Savings :Rs"+currentBalance);
        System.out.println("Average Monthly Savings: Rs"+averageSavings);
        System.out.print("\n🔮 Forecast how many months ahead? ");
        int forecastmonths = sc.nextInt();

        double projectedBalance = currentBalance + (forecastmonths * averageSavings);
        System.out.println(" Projected balance after " + forecastmonths + " month(s): ₹" + projectedBalance);

    }
}
