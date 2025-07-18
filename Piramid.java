import  java.util.Scanner;

public class Piramid {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Estimate number of stone: ");
float stone = input.nextFloat();

System.out.print("Average weight of each stone (in kg): ");
float weight = input.nextFloat();

System.out.print("Number of years ");
float years = input.nextFloat();

float totalWeight = stone * weight;

float solveForYear = weight / years;

float solveForDays = solveForYear / 365F;

float hour = solveForDays / 24F;

 float minutes = hour / 60F;

System.out.println("The weight per year is: " + solveForYear  + "kg");
System.out.printf("%.4f  is the weight per hour ", hour);
System.out.printf("%n%.4f is the weight per minutes", minutes);
}
}