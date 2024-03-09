class CollegeStudent extends Teacher {
    protected String myMajor;
    protected int myYear;

    public CollegeStudent(String name, int age, String gender, String idNum, double gpa, String major, int year) {
        super(name, age, gender, idNum, gpa);

        myMajor = major;
        myYear = year;

    }

    public String getMyMajor() {
        return myMajor;
    }

    public int getMyYear() {
        return myYear;
    }

    public void setMyMajor(String myMajor) {
        this.myMajor = myMajor;
    }

    public void setMyYear(int myYear) {
        this.myYear = myYear;
    }

    @Override
    public String toString() {
        // Call parent
        String studentClass = super.toString();

        // Combine
        return(studentClass + ", major: " + myMajor + ", year: " + myYear);
    }
}
