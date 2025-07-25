import java.util.Scanner;

public class TestingWhileLoop {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter temperature degree in celcius");
double celsius = input.nextDouble();

double feh = ( 9.0 / 5 ) * celsius;

double cal = feh + 32;

System.out.print("The fehrenheit is: " + cal);
} 
}