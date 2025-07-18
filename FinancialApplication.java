import java.util.Scanner;

public class FinancialApplication {

public static void main(String[] args) {

Scanner apps = new Scanner(System.in);

System.out.println("Enter Subtotal");
float subTotal = apps.nextFloat();

System.out.println("Enter gratuity rate");
float gratuity = apps.nextFloat();


float sum = gratuity / subTotal;

gratuity = sum + subTotal;

System.out.println("The gratuity is: " + sum);
System.out.println("The total is: " + gratuity);

}
}