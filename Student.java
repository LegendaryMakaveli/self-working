public class Student {

private String name;
private double average;

public Student(String name, double average) {
this.name = name;
}

public void setName(String name) {
this.name = name;
}

public void setAverage(double studentAverage) {
if (average > 0.0) {
  if (average <= 100.0) {
   this.average = average;
  }
 }
}

public String getName() {
return name;
}

public double getAverage() {
return average;
}

public String getLetterGrade() {
  String letterGrade = " ";

 if (average >= 90.0) {
   letterGrade = "A";
} else if (average >= 80.0) {
   letterGrade = "B+";
} else if (average >= 70.0) {
   letterGrade = "B";
} else if (average >= 60) {
   letterGrade = "C";
} else if (average >= 50) {
   letterGrade = "D";
} else if (average >= 40) {
   letterGrade = "D7";
} else {
   letterGrade = "F";
}
  return letterGrade;
}

}