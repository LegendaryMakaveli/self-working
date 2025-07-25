import java.util.Scanner;

public class AreaOfCircle {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter the radius of circle");
 double radius = input.nextDouble();

double area = radius * radius * Math.PI;
double perimeter = 2 * radius * Math.PI;

System.out.println("The area of the circle is: " + area);
System.out.println("The perimeter of the circle is: " + perimeter);
}
}