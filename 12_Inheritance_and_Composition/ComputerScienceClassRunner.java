/** This is an example of composition in OOP.
 *
 * @author Mr. Dagler
 */

import java.util.Scanner;

class ComputerScienceClassRunner
{
   public static void main(String[] args)
   {
      Scanner in = new Scanner(System.in);

      String teacherName, roomNumber;
      String stuName, stuAddress, stuIdNumber;
      int stuAge, stuGrade, numOfStudents;
      double stuGpa;
      ComputerScienceClass csClass;
      Student currentStudent;

      System.out.println("Enter the teachers Name: ");
      teacherName = in.nextLine();
      System.out.println("Enter the Room Number: ");
      roomNumber = in.nextLine();

      csClass = new ComputerScienceClass(teacherName, roomNumber);

      System.out.println("How many students are in the class: ");
      numOfStudents = in.nextInt();
      in.nextLine();

      for(int i=1; i<=numOfStudents; i++)
      {
         System.out.print("  Enter student #" + i + "\'s name: ");
         stuName = in.nextLine();
         System.out.print("  Enter student #" + i + "\'s address: ");
         stuAddress = in.nextLine();
         System.out.print("  Enter student #" + i + "\'s age: ");
         stuAge = in.nextInt();
         in.nextLine();
         System.out.print("  Enter student #" + i + "\'s ID Number: ");
         stuIdNumber = in.nextLine();
         System.out.print("  Enter student #" + i + "\'s grade: ");
         stuGrade = in.nextInt();
         in.nextLine();
         System.out.print("  Enter student #" + i + "\'s GPA: ");
         stuGpa = in.nextDouble();
         in.nextLine();

         currentStudent = new Student(stuName, stuAddress, stuAge,
            stuIdNumber, stuGrade, stuGpa);

         csClass.addStudent(currentStudent);
      }

      System.out.println(csClass);

   }
}
