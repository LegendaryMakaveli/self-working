import java.util.Scanner;

public class AccountTest {

public static void main(String[] args) {

Scanner input = new Scanner(System.in);

Account myAccount = new Account();


System.out.printf("Initial name is: %s%n%n", myAccount.getName());
System.out.printf("Initial age is %s%n%n", myAccount.getAge());
System.out.printf("Initial Location is %s%n%n", myAccount.getLocation());
System.out.printf("Initial Relationship Status is %s%n%n", myAccount.getRelationshipStatus());
System.out.printf("Initial Phone Number is %s%n%n", myAccount.getPhoneNumber());


System.out.println("Please enter your name");
String theName = input.nextLine();
myAccount.setName(theName);
System.out.println();


System.out.println("Please enter your age");
int age = input.nextInt();
myAccount.setAge(age);
System.out.println();


System.out.println("Please enter your location");
String location = input.next();
myAccount.setLocation(location);
System.out.println();


System.out.println("Please enter Relationship Status");
String relationshipStatus = input.next();
myAccount.setRelationshipStatus(relationshipStatus);
System.out.println();


System.out.println("Please enter Phone Number");
String phoneNumber = input.next();
myAccount.setPhoneNumber(phoneNumber);
System.out.println();


System.out.printf("Objects in myAccount is: %n%s%n%d%n%s%n%s%n%s%n", myAccount.getName(), myAccount.getAge(), myAccount.getLocation(), myAccount.getRelationshipStatus(), myAccount.getPhoneNumber());
}
}