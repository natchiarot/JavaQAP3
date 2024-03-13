class Teacher extends Person {
    // Declaring instance variables
    protected String mySubject;  // Subject taught by teacher
    protected double mySalary;  // Teacher's annual salary
    
    // Constructor for Teacher class
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    // Getters
    public String getMySubject() {
        return mySubject;
    }

    public double getMySalary() {
        return mySalary;
    }

    // Setters
    public void setMySubject(String mySubject) {
        this.mySubject = mySubject;
    }

    public void setMySalary(double mySalary) {
        this.mySalary = mySalary;
    }

    // Override the toString method
    @Override
    public String toString() {
        // Call parent
        String personText = super.toString();

        // Combine parent with toString for teacher
        return(personText + ", subject: " + mySubject + ", salary: " + mySalary);
    }

}
