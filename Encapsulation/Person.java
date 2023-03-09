public class Person {
    private String degreeProgram;
    private float gpa;

    // constructor
    public Person(String degreeProgram, int gpa) {
        this.gpa = gpa;
        this.degreeProgram = degreeProgram;
    }

    // getters and setters
    public float getGPA() {
        return gpa;
    }

    public void setGPA(float gpa) {
        this.gpa = gpa;
    }

    public String getDegreeProgram() {
        return degreeProgram;
    }

    public void setDegreeProgram(String degreeProgram) {
        this.degreeProgram = degreeProgram;
    }
}
