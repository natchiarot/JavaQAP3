// Defining a class SchoolDemo to demonstrate the usage of Person, Student, Teacher, and CollegeStudent classes
public class SchoolDemo {
    public static void main(String[] args) {
        // Creating a new Person object
        Person john = new Person("John Smith", 20, "M");
        System.out.println();
        System.out.println("Person: " + john);

        // Creating a new Student object
        Student mary = new Student("Mary May", 16, "F", "HS12654", 3.8);
        System.out.println();
        System.out.println("Student: " + mary);
        System.out.println(mary.getMyName() + " has a GPA of: " + mary.getMyGPA());

        // Creating a new Teacher object
        Teacher drMalik = new Teacher("Quarrat-Ul-Ain Malik", 36, "F", "Computer Science", 50000);
        System.out.println();
        System.out.println("Teacher: " + drMalik);

        // Creating a new CollegeStudent object
        CollegeStudent nat = new CollegeStudent("Natalina Chiarot", 19, "F", "UCB234", 4.0, "Computer Science", 1);
        System.out.println();
        System.out.println("College Student: " + nat);
        nat.setMyYear(2);
        System.out.println("12 months later... " + nat);
        System.out.println(nat.getMyName() + " is now in " + nat.getMyYear() + " of College.");

        System.out.println();
        
    }
}
