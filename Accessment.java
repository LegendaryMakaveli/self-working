import java.util.Scanner;

public class Accessment {

public static void main(String[] args){

Scanner input = new Scanner(System.in);

System.out.println("Enter first number");
int numberOne = input.nextInt();

System.out.println("Enter second number");
int numberTwo = input.nextInt();

System.out.println("Enter third number");
int numberThree = input.nextInt();

System.out.println("Enter fourth number");
int numberFour = input.nextInt();

System.out.println("Enter fifth number");
int numberFive = input.nextInt();

int largest = numberOne;

int smallest = numberThree;

int secondLargest = Integer.MIN_VALUE;

int thirdLargest = Integer.MIN_VALUE

if(numberTwo > largest) largest = numberTwo;
if(numberThree > largest) largest = numberThree;
if(numberFour > largest) largest = numberFour;
if(numberFive > largest) largest = numberFive;

if(numberOne < smallest) smallest = numberOne;
if(numberTwo < smallest)  smallest = numberTwo;
if(numberFour < smallest)smallest = numberFour;
if(numberFive < smallest)smallest = numberFive;

if(numberOne < largest && numberOne > secondLargest) secondLargest = numberOne;
if(numberTwo < largest && numberTwo > secondLargest) secondLargest = numberTwo;
if(numberThree < largest && numberThree > secondLargest) secondLargest = numberThree;
if(numberFour < largest && numberFour > secondLargest)  secondLargest = numberFour;
if(numberFive < largest && numberFive > secondLargest) secondLargest = numberFive;

if(numberOne < secondLargest && numberOne > thirdLargest) thirdLargest = numberOne;
if(numberTwo < secondLargest && numberTwo > thirdLargest) thirdLargest = numberTwo;
if(numberThree < secondLargest && numberThree > thirdLargest) thirdLargest = numberThree;
if(numberFour < secondLargest && numberFour > thirdLargest) thirdLargest = numberFour;
if(numberFive < secondLargest && numberFive > thirdLargest) thirdLargest = numberFive;

if(numberOne < thirdLargest && numberOne > fouthLargest) thirdLargest = numberOne;
if(numberTwo < secondLargest && numberTwo > thirdLargest) thirdLargest = numberTwo;
if(numberThree < secondLargest && numberThree > thirdLargest) thirdLargest = numberThree;
if(numberFour < secondLargest && numberFour > thirdLargest) thirdLargest = numberFour;
if(numberFive < secondLargest && numberFive > thirdLargest) thirdLargest = numberFive;

if(numberOne < secondLargest && numberOne > thirdLargest) thirdLargest = numberOne;
if(numberTwo < secondLargest && numberTwo > thirdLargest) thirdLargest = numberTwo;
if(numberThree < secondLargest && numberThree > thirdLargest) thirdLargest = numberThree;
if(numberFour < secondLargest && numberFour > thirdLargest) thirdLargest = numberFour;
if(numberFive < secondLargest && numberFive > thirdLargest) thirdLargest = numberFive;


System.out.println("The largest is: " + largest);
System.out.println("The smallest is: " + smallest);
System.out.println("The secondLargest is: " + secondLargest);
System.out.println("The thirdLargest is: " + thirdLargest);
System.out.println("The fourthLargest is: " + fourthLargest);
System.out.println("The fifthLargest is: " + fifthLargest);

}
}

