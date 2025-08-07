import java.util.Scanner;

public class NokiaMethod {

public static void showMenu () {

Scanner input = new Scanner (System.in);

String options = ( """

1 ->   Phone book
2 ->   Messages
3 ->   Chat
4 ->   Call register
5 ->   Tones
6 ->   Settings
7 ->   Call divert
8 ->   Games
9 ->   Calculator
10 ->  Reminders
11 ->  Clock
12 ->  Profile
13 ->  Sim services
 """);
int current = 0;
boolean running = true;

while (running) {
	System.out.println(options);
	System.out.println("Press 1 to go forward");
	System.out.println("Press 2 to go backward");
	System.out.println ("Press 0 to exist");

	int choice = input.nextInt();

	if (choice == 1 ) {
		current++;
	if (current >= 13) {
		current = 1;
}
	} else if (choice == 2) {
		current--;
	if (current < 1) {
		current = 13;
}
	} else if (choice == 0) {
		running = false;
	}          else {s
}		System.out.println("Invalid");
	}
	System.out.println("Exist");
}
}