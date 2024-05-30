import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

public class Course {
    public int courseID;
    public String courseName;
    public int schoolID;
    public String startDate;
    public Date endDate;
    public boolean onOffer;

    // Constructor
    public Course(int courseID, String courseName, int schoolID, String startDate, Date endDate, boolean onOffer) {
        this.courseID = courseID;
        this.courseName = courseName;
        this.schoolID = schoolID;
        this.startDate = startDate;
        this.endDate = endDate;
        this.onOffer = onOffer;
    }

    // Getters
    public int getCourseID() {
        return courseID;
    }

    public String getCourseName() {
        return courseName;
    }

    public int getSchoolID() {
        return schoolID;
    }

    public String getStartDate() {
        return startDate;
    }

    public Date getEndDate() {
        return endDate;
    }

    public boolean isOnOffer() {
        return onOffer;
    }

    //Main Method
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");

        System.out.println("Enter number of courses to add:");
        int numberOfCourses = Integer.parseInt(scanner.nextLine());

        Course[] courses = new Course[numberOfCourses]; 

        //Array for Course 
        for (int i = 0; i < numberOfCourses; i++) {
            System.out.println("Enter Course ID:");
            int courseID = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter Course Name:");
            String courseName = scanner.nextLine();

            System.out.println("Enter School ID:");
            int schoolID = Integer.parseInt(scanner.nextLine());

            System.out.println("Enter Start Date (yyyy-MM-dd):");
            String startDate = scanner.nextLine();

            System.out.println("Enter End Date (yyyy-MM-dd):");
            Date endDate = null;
            try {
                endDate = sdf.parse(scanner.nextLine());
            } catch (Exception e) {
                System.out.println("Invalid date format. Please enter a valid date.");
                i--; // Decrement to redo the iteration for this course
                continue;
            }

            System.out.println("Is this course on offer? (true/false):");
            boolean onOffer = Boolean.parseBoolean(scanner.nextLine());

            courses[i] = new Course(courseID, courseName, schoolID, startDate, endDate, onOffer); // Store the course in the array
        }


            //Print the course details
            for (Course course : courses) {
                System.out.println("Course ID: " + course.getCourseID());
                System.out.println("Course Name: " + course.getCourseName());
                System.out.println("School ID: " + course.getSchoolID());
                System.out.println("Start Date: " + course.getStartDate());
                System.out.println("End Date: " + course.getEndDate());
                System.out.println("On offer: " + course.isOnOffer());
            }
            scanner.close();
        }
    }