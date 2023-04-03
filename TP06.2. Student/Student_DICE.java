import java.util.ArrayList;
import java.util.Scanner;

/**
 * Student
 */
public class Student_DICE {

    private String studentName;
    private String studentID;
  
    public Student_DICE(String studentName, String studentID) {
        this.studentName = studentName;
        this.studentID = studentID;
    }

    public String getStudentName(){
        return studentName;
    }

    public String getStudentID(){
        return studentID;
    }

    public void setStudentName(String studentName) {
        this.studentName = studentName;
    }

    public void setStudentID(String studentID){
        this.studentID = studentID;
    }

    public static void main(String[] args) {
        String studentName = "";
        String studentID = "";
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Student_DICE> students = new ArrayList<>();

        System.out.println(students.add(new Student_DICE("nak", "e20201161")));
        System.out.println(students.add(new Student_DICE("roth", "e20200395")));
      
        int choice;
        System.out.println(students.size());


        
        do{
            System.out.println("\n===========================");
            System.out.println("1.Add new student");
            System.out.println("2.List students");
            System.out.println("3.Remove student by name");
            System.out.println("4.Update student information by id");
            System.out.println("===========================");
            System.out.println("Enter your choice");
            choice = sc.nextInt();
            sc.nextLine();

            switch (choice){
                case 1:
                    System.out.printf("Add new student: ");
                    String newStudent = sc.next();
                    System.out.printf("Add new student ID: ");
                    String newStudentID = sc.next();
                    students.add(new Student_DICE(newStudent,newStudentID));
                    break;
                    default:
                    System.out.println("Invalid choice.");
                    break;
                case 2:
                System.out.println("1/Students:");
                System.out.println("\n");
                for(int i=0; i<students.size(); i++ ){
                    System.out.println("index:"+i+"= \n*student_name: "+students.get(i).getStudentName()+"\n*student_ID: "+students.get(i).getStudentID());
                }
                System.out.println("\n");
                break;          
                case 3:

                if(students.isEmpty()){
                    System.out.println("There are no students available");
                }else{
                    System.out.println("Students that are available:\n");
                    int i;
                    for(i=0; i<students.size(); i++){
                        studentName = students.get(i).getStudentName();
                        studentID = students.get(i).getStudentID();
                        System.out.println("index:"+i+"= \n*student_name: "+studentName+"\n*student_ID: "+studentID+"\n");       
                    }

                    System.out.printf("\nPlease find your student by names: ");
                    String studentNameInput = sc.nextLine();
                    System.out.println("\n");
                    students.removeIf(s -> s.getStudentName().equals(studentNameInput));
                      
                }   
                break;
                case 4:

                System.out.printf("Enter student ID you wish to update: ");         
                String input = sc.nextLine();

                System.out.println("hello student"+input);


                    for (Student_DICE s : students) {
                        if (s.getStudentID().equals(input)) {
                            System.out.printf("Enter his/her new name: ");
                            String newName = sc.nextLine();
                            s.setStudentName(newName);
                        }
                    }
                break;
            }
        }while(choice!=5);
    }
}