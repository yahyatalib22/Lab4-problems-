package problem1;
import java.util.Scanner;
import java.util.zip.Inflater;

public class Sales
{
    public static void main(String[] args)
    {
        Scanner scan = new Scanner(System.in);
        int numSalespeople = 0;
        System.out.print("Enter the number of salespersons: ");
        numSalespeople = scan.nextInt();
        final int SALESPEOPLE = numSalespeople;
        int[] sales = new int[SALESPEOPLE];
        int sum;
        int maxSales = 0;
        int maxSalesId = 0;
        int minSales = Integer.MAX_VALUE;
        int minSalesId = 0;
        int j = 0;
        for (int i=0; i<sales.length; i++)
        {
            j = i+1;
            System.out.print("Enter sales for salesperson " + j + ": ");
            sales[i] = scan.nextInt();
            if (sales[i] >= maxSales) {
                maxSales = sales[i];
                maxSalesId = i+1;
            }
            if (sales[i] <= minSales) {
                minSales = sales[i];
                minSalesId = i+1;
            }
        }
        System.out.println("\nSalesperson Sales");
        System.out.println("--------------------");
        sum = 0;
        for (int i=0; i<sales.length; i++)
        {
            j = i+1;
            System.out.println(" " + j + " " + sales[i]);
            sum += sales[i];
        }
        System.out.println("\nTotal sales: " + sum);
        System.out.println("\nAverage sales: " + sum/5);
        System.out.println("\nSalesperson " + maxSalesId + " had the highest sale with $"+ maxSales + ".");
        System.out.println("\nSalesperson " + minSalesId + " had the lowest sale with $"+ minSales + ".");

        int Num = 0;
        int numExeeded = 0;
        System.out.print("Enter a number: ");
        Num = scan.nextInt();

        for (int i=0; i<sales.length; i++)
        {
            j = i+1;
            if (sales[i] > Num){
                System.out.println(" " + j + " " + sales[i]);
                numExeeded++;
            }
        }
        System.out.println("Total number of salespeople whose sales exceeded\n" +
                "the value entered is: " + numExeeded);



    }
}