class Teacher extends Person {

    protected String mySubject;  // Subject taught by teacher
    protected double mySalary;  // Teacher's annual salary
    
    public Teacher(String name, int age, String gender, String subject, double salary) {
        super(name, age, gender);
        mySubject = subject;
        mySalary = salary;
    }

    public String getMySubject() {
        return mySubject;
    }

    public double getMySalary() {
        return mySalary;
    }

    public void setMySubject(String mySubject) {
        this.mySubject = mySubject;
    }

    public void setMySalary(double mySalary) {
        this.mySalary = mySalary;
    }

    @Override
    public String toString() {
        // Call parent
        String personText = super.toString();

        // Combine parent with toString for teacher
        return(personText + ", subject: " + mySubject + ", salary: " + mySalary);
    }

}
