import java.util.Scanner;

public class Makaveli {

public static void main(String[] args) {

Scanner bobby = new Scanner(System.in);

System.out.println(" Enter first number");
int number1 = bobby.nextInt();


System.out.println(" Enter second number");
int number2 = bobby.nextInt();

if (number1 == number2) {
System.out.printf("%d == %d", number1, number2 );
}

if (number1 != number2) {
System.out.printf("%d != %d%n", number1, number2 );
}

if (number1 < number2) {
System.out.printf("%d < %d%n", number1, number2 );

if (number1 > number2) {
System.out.printf("%d > %d%n", number1, number2 );
}

if (number1 <= number2) {
System.out.printf("%d <= %d%n", number1, number2);
}

if (number1 >= number2) {
System.out.printf("%d >= %d%n", number1, number2);
}
}
}
}
