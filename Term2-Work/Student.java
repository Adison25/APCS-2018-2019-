public class Student {
 
 private String firstName;
 private String lastName;
 private int gradeLevel;
 private double gPA;
 private static int num = 0;
 private int studentID;
 
 public Student()
 {
  num++;
  studentID = num;
  firstName = "None";
  lastName = "None";
  gradeLevel = 0;
  gPA = 0.0;
 }
 
 public Student(String firstN, String lastN, int gradeL, double gpa)
 {
  num++;
  studentID = num;
  if (gradeL >= 0 && gradeL <= 12)
  {
   gradeLevel = gradeL;
  }
  else
  {
   gradeLevel = 0;
  }
  if (gpa >= 0.0 && gpa <= 4.5)
  {
   gPA = gpa;
  }
  else
  {
   gPA = 0;
  }
  firstName = firstN;
  lastName = lastN;
 }
 
 public String toString()
 {
  return lastName + ", " + firstName + "\n" +
    "GPA: " + gPA + "\n" +
    "Grade level: " + gradeLevel + " id # " + studentID;
 }

}