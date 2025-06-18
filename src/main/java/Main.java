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

        StudentsScanner studentsScanner = new StudentsScanner();
        studentsScanner.fullName = fullName;
        studentsScanner.studentID = studentID;
        studentsScanner.studentAge = studentAge;

        studentsScanner.studentAcceptance( fullName, studentID, studentAge);

        checkInput.close();
    }
}
