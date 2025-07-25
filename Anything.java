import java.util.Scanner;

public class Anything {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.println("Enter a letter");
String userInput = input.next().toLowerCase();
char firstLetter = userInput.charAt(0);

if(Character.isLetter(firstLetter)) {
String letter = firstLetter + "";
 if (letter.equals("a") || letter.equals("e") || letter.equals("i") || letter.equals("o") || letter.equals("u")) {
   System.out.print("letter is a vowel");
} else {
System.out.print("letter is a consonant");
}
} else {
   System.out.print("invalid input");
}
}
}