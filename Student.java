class Student extends Person { 
    protected String myIdNum; // Student Id Number 
    protected double myGPA; // grade point average

    public Student(String name, int age, String gender, String idNum, double gpa) { // use the super class’ constructor 
        
        super(name, age, gender);
        
        // initialize what’s new to Student
        
        myIdNum = idNum;
        
        myGPA = gpa;
        
        }
    
    public String getMyIdNum() {
        return myIdNum;
    }

    public double getMyGPA() {
        return myGPA;
    }

    public void setMyIdNum(String myIdNum) {
        this.myIdNum = myIdNum;
    }

    public void setMyGPA(double myGPA) {
        this.myGPA = myGPA;
    }

    @Override
    public String toString() {
        // Call parent
        String personClass = super.toString();

        // Combine
        return(personClass + ", ID number: " + myIdNum + ", GPA: " + myGPA);
    }

    }
