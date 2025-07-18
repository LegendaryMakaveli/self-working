public  class StudentTest {

public static void main(String[] args) {

Student accountOne = new Student("Makaveli", 93.5);
Student accountTwo = new Student("Hammed", 60.44);
Student accountThree = new Student("Iretioluwa", 70.37);
Student accountFour = new Student("Babalola", 33.29);
Student accountFive = new Student("Ayamasan", 80.44);

System.out.printf("%s's letter grade is: %s%n", accountOne.getName(), accountOne.getLetterGrade());
System.out.printf("%s's letter grade is: %s%n", accountTwo.getName(), accountTwo.getLetterGrade());
System.out.printf("%s's letter grade is: %s%n", accountThree.getName(), accountThree.getLetterGrade());
System.out.printf("%s's letter grade is: %s%n", accountFour.getName(), accountFour.getLetterGrade());
System.out.printf("%s's letter grade is: %s%n", accountFive.getName(), accountFive.getLetterGrade());

}
}