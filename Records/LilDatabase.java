import java.util.Scanner;

class Student {
	String name;
	int grade;
	double average;

}

public class LilDatabase {
	public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);

    Student[] StudentList = new Student[3];

    StudentList[0] = new Student();
    System.out.print("Enter the first student's name: ");
    StudentList[0].name = keyboard.next();
    System.out.print("Enter the first student's grade: ");
    StudentList[0].grade = keyboard.nextInt();
    System.out.print("Enter the first student's average: ");
    StudentList[0].average = keyboard.nextDouble();

    StudentList[1] = new Student();
    System.out.print("\nEnter the second student's name: ");
    StudentList[1].name = keyboard.next();
    System.out.print("Enter the second student's grade: ");
    StudentList[1].grade = keyboard.nextInt();
    System.out.print("Enter the second student's average: ");
    StudentList[1].average = keyboard.nextDouble();

    StudentList[2] = new Student();
    System.out.print("\nEnter the third student's name: ");
    StudentList[2].name = keyboard.next();
    System.out.print("Enter the third student's grade: ");
    StudentList[2].grade = keyboard.nextInt();
    System.out.print("Enter the third student's average: ");
    StudentList[2].average = keyboard.nextDouble();

    System.out.println("\nThe names are " + StudentList[0].name + " " + StudentList[1].name + " " + StudentList[2].name);
    System.out.println("The grades are " + StudentList[0].grade + " " + StudentList[1].grade + " " + StudentList[2].grade);
    System.out.println("The averages are " + StudentList[0].average + " " + StudentList[1].average + " " + StudentList[2].average);

    System.out.println("\nThe average for the three students is " + (StudentList[0].average + StudentList[1].average + StudentList[2].average)/3);

	}
}
