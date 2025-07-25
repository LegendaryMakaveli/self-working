import java.util.Scanner;

public class AreaOfRectangle {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter Width ");
double width = input.nextDouble();

System.out.print("Enter Height");
double height = input.nextDouble();

double area = width * height;

System.out.printf("%.2f  is the area of rectangle", area);
}
}