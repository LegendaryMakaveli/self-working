import java.util.Scanner;

public class ReverseNumber {

public static int Reverse(int number) {
int reversed = 0;
while(number != 0) {
int remaining = number % 10;
reversed = (reversed * 10) + remaining;
number = number / 10;

}
return reversed;
}

public static void main(String... makaveli) {
Scanner input = new Scanner(System.in);
System.out.print("Enter digits to reverse:  ");
int numberOne = input.nextInt();
int reservedNumber = Reverse(numberOne);

System.out.println("Reversed number: " + reservedNumber);

}
}