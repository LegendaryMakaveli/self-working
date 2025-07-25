import java.util.Scanner;

public class Testing {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter Subtotal: ");
double total = input.nextDouble();

System.out.println("Enter gratuityRate: ");
double gratuityRate = input.nextDouble();

double cal = gratuityRate / total;
double sum = cal + total;

System.out.println("The gratuity is: " + cal  + "and total is: " + sum);
}
}