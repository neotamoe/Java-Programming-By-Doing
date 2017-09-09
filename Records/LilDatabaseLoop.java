import java.util.Scanner;

class Student {
	String name;
	int grade;
	double average;

}

public class LilDatabaseLoop {
	public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);

    Student[] StudentList = new Student[3];

    for (int i = 0; i<StudentList.length; i++ ) {
      StudentList[i] = new Student();
      System.out.print("\nEnter student " + (i+1) + "'s name: ");
      StudentList[i].name = keyboard.next();
      System.out.print("Enter student " + (i+1) + "'s grade: ");
      StudentList[i].grade = keyboard.nextInt();
      System.out.print("Enter student " + (i+1) + "'s average: ");
      StudentList[i].average = keyboard.nextDouble();
    }

    System.out.println("\nThe names are " + StudentList[0].name + " " + StudentList[1].name + " " + StudentList[2].name);
    System.out.println("The grades are " + StudentList[0].grade + " " + StudentList[1].grade + " " + StudentList[2].grade);
    System.out.println("The averages are " + StudentList[0].average + " " + StudentList[1].average + " " + StudentList[2].average);

    System.out.println("\nThe average for the three students is " + (StudentList[0].average + StudentList[1].average + StudentList[2].average)/3);

	}
}
