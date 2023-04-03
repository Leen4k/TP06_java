import java.util.ArrayList;
import java.util.Scanner;

/**
 * Course
 */
public class Course {

    private String courseName;
    private String courseDescription;
  
    public Course(String courseName, String courseDescription) {
        this.courseName = courseName;
        this.courseDescription = courseDescription;
    }

    public String getCourseName(){
        return courseName;
    }

    public String getCourseDescription(){
        return courseDescription;
    }

    public static void main(String[] args) {
        String courseName = "";
        String courseDescription = "";
        
        Scanner sc = new Scanner(System.in);
        ArrayList<Course> courses = new ArrayList<>();
        System.out.println(courses.add(new Course("database", "rean ot jes oy plorng song")));
        System.out.println(courses.add(new Course("OOP", "jit dol ngai plorng hx ot jes ey te")));
        int choice;
        System.out.println(courses.size());


        
        do{
            System.out.println("\n===========================");
            System.out.println("1.List all courses");
            System.out.println("2.Find courses by name");
            System.out.println("3.Add new course");
            System.out.println("4.Quit");
            System.out.println("===========================");
            System.out.println("Enter your choice");
            choice = sc.nextInt();

            switch (choice){
                case 1:
                    System.out.println("1/Courses:");
                    System.out.println("\n");
                    for(int i=0; i<courses.size(); i++ ){
                        System.out.println("index:"+i+"= \n*course_name: "+courses.get(i).getCourseName()+"\n*course_description: "+courses.get(i).getCourseDescription());
                    }
                    System.out.println("\n");
                    break;
                case 2:

                if(courses.isEmpty()){
                    System.out.println("There are no courses available");
                }else{
                    System.out.println("Courses that are available:\n");
                    int i;
                    for(i=0; i<courses.size(); i++){
                        courseName = courses.get(i).getCourseName();
                        courseDescription = courses.get(i).getCourseDescription();
                        System.out.println("index:"+i+"= \n*course_name: "+courseName+"\n*course_description: "+courseDescription+"\n");       
                    }

                    System.out.printf("\nPlease find your course by names: ");
                    String courseNameInput = sc.next();
                    System.out.println("\n");

                    for (Course course : courses) {
                        
                        if (course.getCourseName().toLowerCase().contains(courseNameInput.toLowerCase())) {      
                                System.out.println("\n*course_name: "+i+course.getCourseName()+"\n*course_description: "+course.getCourseDescription()+"\n");                             
                        }
                      }

                      break;
                }             
                case 3:
                    System.out.printf("Add new course: ");
                    String newCourse = sc.next();
                    System.out.printf("Add new course description: ");
                    String newCourseDescription = sc.next();
                    courses.add(new Course(newCourse,newCourseDescription));
                    break;
                    default:
                    System.out.println("Invalid choice.");

            }


        }while(choice!=4);
    }
}