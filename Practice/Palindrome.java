import java.util.Scanner;

public class Palindrome {

public static void main(String... args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter 5 digit number");
int pal = input.nextInt();

int numberOne = (pal / 10000) % 10;
int numberTwo = (pal / 1000) % 10;
int numberThree = (pal / 100) % 10;
int numberFour = (pal / 10) % 10;
int numberFive = pal % 10;

if (numberFive == numberOne && numberTwo == numberFour) {
	System.out.println(pal + " " + " is a parlindrome");
} else {
	System.out.println( pal + " " + "is not a parlindrome");
}
}
}