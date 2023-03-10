package sub;

public class Student {
    private String name;
    private double gpa;

    public Student(String name, double d) {
        this.name = name;
        this.gpa = d;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setGpa(float gpa) {
        this.gpa = gpa;
    }

    public String getName() {
        return this.name;
    }


    public double getGpa() {
        return this.gpa;
    }

}