public class ArrayTesting {

public static void main(String... makaveli) {

int [] number = new int [7];

number[0] = 20;
number[1] = 13;
number[2] = 23;
number[3] = 44;
number[4] = 65;
number[5] = 27;
number[6] = 26;

int sum = number[5] + number[6] + number[0] + number[4] + number[1] + number[3] + number[2];

System.out.println(number[6] / 2);

System.out.println("The sum of the ArrayList is: " + sum);


String [] girlfriends = new String[4];
String [] exgirlfriends = new String[3];

girlfriends [0] = "Mary";
girlfriends [1] = "Shade";
girlfriends [2] = "Rashidat";
girlfriends [3] = "Balikis";

exgirlfriends [0] = "Phebian";
exgirlfriends [1] = "Bimpe";
exgirlfriends [2] = "Habeebat";

System.out.println(exgirlfriends [1]);
System.out.println(girlfriends [2]);

System.out.println(exgirlfriends [1] +    girlfriends [2]);

int [] array = {90, 45, 22, 45, 12, 34, 11, 9, 34, 56, 23, 34};
System.out.printf("%s%8s%n", "Index", "Value");

for (int i = 0; i < array.length; i++) {
System.out.printf("%5d%8d%n", i, array[i]);
}

}
}