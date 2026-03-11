import java.util.*;

class Student {
    int id;
    String name;
    String course;
    double marks;
    int attendance;

    Student(int id, String name, String course, double marks, int attendance) {
        this.id = id;
        this.name = name;
        this.course = course;
        this.marks = marks;
        this.attendance = attendance;
    }

    void display() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.println("Marks: " + marks);
        System.out.println("Attendance: " + attendance + "%");
        System.out.println("------------------------");
    }
}

public class CampusPortal {

    static ArrayList<Student> students = new ArrayList<>();

    static void addStudent(Scanner sc) {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();
        sc.nextLine();

        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();

        System.out.print("Enter Course: ");
        String course = sc.nextLine();

        System.out.print("Enter Marks: ");
        double marks = sc.nextDouble();

        System.out.print("Enter Attendance %: ");
        int attendance = sc.nextInt();

        students.add(new Student(id, name, course, marks, attendance));

        System.out.println("Student Added Successfully!");
    }

    static void viewStudents() {
        if (students.isEmpty()) {
            System.out.println("No Students Found!");
            return;
        }

        for (Student s : students) {
            s.display();
        }
    }

    static void searchStudent(Scanner sc) {
        System.out.print("Enter Student ID to Search: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                s.display();
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    static void updateMarks(Scanner sc) {
        System.out.print("Enter Student ID: ");
        int id = sc.nextInt();

        for (Student s : students) {
            if (s.id == id) {
                System.out.print("Enter New Marks: ");
                s.marks = sc.nextDouble();
                System.out.println("Marks Updated Successfully!");
                return;
            }
        }

        System.out.println("Student Not Found!");
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        while (true) {

            System.out.println("\n===== Unified Campus Portal =====");
            System.out.println("1. Add Student");
            System.out.println("2. View Students");
            System.out.println("3. Search Student");
            System.out.println("4. Update Marks");
            System.out.println("5. Exit");

            System.out.print("Choose Option: ");
            int choice = sc.nextInt();

            switch (choice) {

                case 1:
                    addStudent(sc);
                    break;

                case 2:
                    viewStudents();
                    break;

                case 3:
                    searchStudent(sc);
                    break;

                case 4:
                    updateMarks(sc);
                    break;

                case 5:
                    System.out.println("Exiting Portal...");
                    System.exit(0);

                default:
                    System.out.println("Invalid Option!");
            }
        }
    }
}