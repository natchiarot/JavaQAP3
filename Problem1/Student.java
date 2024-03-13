class Student extends Person { 
    // Declaring instance variables
    protected String myIdNum; // Student Id Number 
    protected double myGPA; // Grade point average

    // Constructor for Student class
    public Student(String name, int age, String gender, String idNum, double gpa) { 
        // use the super class’ constructor 
        super(name, age, gender);
        
        // initialize what’s new to Student
        myIdNum = idNum;
        myGPA = gpa;
        }
    
    // Getters
    public String getMyIdNum() {
        return myIdNum;
    }

    public double getMyGPA() {
        return myGPA;
    }

    // Setters
    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    // Override the toString method
    @Override
    public String toString() {
        // Call parent
        String personClass = super.toString();

        // Combine
        return(personClass + ", ID number: " + myIdNum + ", GPA: " + myGPA);
    }

}
