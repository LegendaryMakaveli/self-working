import  java.util.Scanner;

public class Bmi {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter weight in pounds: ");
double weight = input.nextDouble();

System.out.print("Enter height in inches: ");
double height = input.nextDouble();

 double newWeight = weight * 703;
double newHeight = height * height;

double cal = newWeight / newHeight;

System.out.print("BMI is: " + cal);


}
}