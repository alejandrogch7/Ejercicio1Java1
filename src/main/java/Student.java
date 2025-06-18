
public class Student {

    public String fullName;
    public String studentID;
    public int studentAge;

    public Student(String fullName, String studentID, int studentAge){
        this.fullName = fullName;
        this.studentID = studentID;
        this.studentAge = studentAge;
    }
}

/*
    public static void main(String[] args) {
        Scanner checkInput = new Scanner(System.in);

        System.out.println("Enter your full name: ");
        String fullName = checkInput.nextLine();
        System.out.println("Enter your ID: ");
        String studentId = checkInput.nextLine();
        System.out.println("Enter your age: ");
        int studentAge = checkInput.nextInt();
        checkInput.close();

        if (studentAge < 18){
            System.out.println("sorry "+fullName+ "You can't get in");
        } else {
            System.out.println("Hello "+fullName+" with ID number "+studentId+ " Welcome IN!");
        }
    }
**/


