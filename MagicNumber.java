import java.util.Scanner;

public class MagicNumber {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);
 
int magic = (int) (Math.random () * 50);
int count = 0;

while (count < 5) {
  System.out.println("Guess the magic number from 0 to 50");
  int number = input.nextInt();
count++;

if (number == magic) {
 System.out.print("Correct");
break;
} else if (number > magic) {
  System.out.println("Number too high");
} else if (number < magic) {
  System.out.println("Number too low");
} 
}
}
}