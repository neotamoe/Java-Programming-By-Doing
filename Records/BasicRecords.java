import java.util.Scanner;

class Student {
	String name;
	int grade;
	double average;

}

public class BasicRecords {
	public static void main(String[] args) throws Exception {
    Scanner keyboard = new Scanner(System.in);

		Student one = new Student();
    Student two = new Student();
    Student three = new Student();

    System.out.print("Enter the first student's name: ");
    one.name = keyboard.next();
    System.out.print("Enter the first student's grade: ");
    one.grade = keyboard.nextInt();
    System.out.print("Enter the first student's average: ");
    one.average = keyboard.nextDouble();

    System.out.print("\nEnter the second student's name: ");
    two.name = keyboard.next();
    System.out.print("Enter the second student's grade: ");
    two.grade = keyboard.nextInt();
    System.out.print("Enter the second student's average: ");
    two.average = keyboard.nextDouble();

    System.out.print("\nEnter the third student's name: ");
    three.name = keyboard.next();
    System.out.print("Enter the third student's grade: ");
    three.grade = keyboard.nextInt();
    System.out.print("Enter the third student's average: ");
    three.average = keyboard.nextDouble();

    System.out.println("\nThe names are " + one.name + " " + two.name + " " + three.name);
    System.out.println("The grades are " + one.grade + " " + two.grade + " " + three.grade);
    System.out.println("The averages are " + one.average + " " + two.average + " " + three.average);

    System.out.println("\nThe average for the three students is " + (one.average + two.average + three.average)/3);

	}
}
