import java.util.Scanner;

public class VolumeOfCylinder {

public static void main(String[] args) {

Scanner volume = new Scanner(System.in);

System.out.print("Enter the Radius");
double radius = volume.nextDouble();

System.out.print("Enter lenght");
double lenght = volume.nextDouble();

double area = radius * radius * Math.PI;
double sum = area * lenght;

System.out.printf("%.3f is the area of cylinder", area);
System.out.printf("%n%.3f is the volume of cylinder", sum);
}
}