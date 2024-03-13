class Person {
    // Declaring instance variables
    protected String myName ; // name of the person 
    protected int myAge; // person’s age 
    protected String myGender; // “M” for male, “F” for female
    
    // Constructor for Person class
    public Person(String name, int age, String gender) {
    myName = name; 
    myAge = age; 
    myGender = gender; 
    }

    // Getters
    public int getMyAge() {
        return myAge;
    }

    public String getMyGender() {
        return myGender;
    }

    public String getMyName() {
        return myName;
    }

    // Setters
    public void setMyAge(int myAge) {
        this.myAge = myAge;
    }

    public void setMyGender(String myGender) {
        this.myGender = myGender;
    }

    public void setMyName(String myName) {
        this.myName = myName;
    }
    
    // toString method
    public String toString() { 
        return myName + ", age: " + myAge + ", gender: " + myGender; 
    }
    
}
