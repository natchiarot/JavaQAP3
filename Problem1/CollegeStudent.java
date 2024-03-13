class CollegeStudent extends Teacher {
    // Declaring instance variables
    protected String myMajor;  // Major of the college student
    protected int myYear;  // The year of study of the college student

    // Constructor for CollegeStudent class
    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
        // Call the constructors of the superclass (Teacher)
        super(name, age, gender, idNum, gpa);

        myMajor = major;
        myYear = year;
    }
    
    // Getters
    public String getMyMajor() {
        return myMajor;
    }

    public int getMyYear() {
        return myYear;
    }

    // Setters
    public void setMyMajor(String myMajor) {
        this.myMajor = myMajor;
    }

    public void setMyYear(int myYear) {
        this.myYear = myYear;
    }

    // Override the toString method
    @Override
    public String toString() {
        // Call parent
        String studentClass = super.toString();

        // Combine
        return(studentClass + ", major: " + myMajor + ", year: " + myYear);
    }
    
}
