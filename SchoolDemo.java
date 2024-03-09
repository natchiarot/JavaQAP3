public class SchoolDemo {
    public static void main(String[] args) {
        Person john = new Person("John Smith", 20, "M");
        System.out.println();
        System.out.println(john);

        Student mary = new Student("Mary May", 16, "F", "HS12654", 3.8);
        System.out.println();
        System.out.println(mary);

        Teacher drMalik = new Teacher("Quarrat-Ul-Ain Malik", 36, "F", "Computer Science", 50000);
        System.out.println();
        System.out.println(drMalik);

        // NOTE** confused as to why in the sample code the year was "English".
        CollegeStudent nat = new CollegeStudent("Natalina Chiarot", 19, "F", "UCB234", 4.0, "Computer Science", 2);
        System.out.println();
        System.out.println(nat);

        System.out.println();
        
    }
}
