import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner checkInput = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = checkInput.nextLine();
        System.out.println("Enter your ID: ");
        String studentID = checkInput.nextLine();
        System.out.println("Enter your age: ");
        int studentAge = checkInput.nextInt();

        Student student = new Student(fullName, studentID, studentAge);

        if (student.studentAge < 18){
            System.out.println("sorry "+student.fullName+ "You can't get in");
        } else {
            System.out.println("Hello "+student.fullName+" with ID number "+student.studentID+ " WELCOME TO THIS UNIVERSITY!");
        }

        checkInput.close();
    }
}
