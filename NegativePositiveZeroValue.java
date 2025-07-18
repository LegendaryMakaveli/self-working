import java.util.*;

public class NegativePositiveZeroValue {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

System.out.print("Enter an integer:  ");
int numberOne = input.nextInt();

System.out.print("Enter another integer:  ");
int numberTwo = input.nextInt();

System.out.print("Enter another integer:  ");
int numberThree = input.nextInt();

System.out.print("Enter another integer:  ");
int numberFour = input.nextInt();

System.out.print("Enter another integer:  ");
int numberFive = input.nextInt();

int negative = 0;
int positive = 0;
int Zero = 0;

if (numberOne < 0) {
negative += 1;
} else if (numberOne > 0) {
positive += 1;
} else {
 Zero += 1;
}

if (numberTwo < 0) {
negative += 1;
} else if (numberTwo > 0) {
positive += 1;
} else {
 Zero += 1;
}

if (numberThree < 0) {
negative += 1;
} else if (numberThree > 0) {
positive += 1;
} else {
 Zero += 1;
}

if (numberFour < 0) {
negative += 1;
} else if (numberFour > 0) {
positive += 1;
} else {
 Zero += 1;
}

if (numberFive < 0) {
negative += 1;
} else if (numberFive > 0) {
positive += 1;
} else {
 Zero += 1;
}

System.out.println("The sum of Negative entry is:  " + negative);
System.out.println("The sum of positive entry is:  " + positive);
System.out.println("The sum of zero entry is:  " + Zero);


}
}