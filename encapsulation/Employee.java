package encapsulation;

/*
 * In the above example, the Employee class encapsulates the data (name, age, and salary) 
 * and methods (getters and setters) into a single unit. The private variables are only accessible 
 * within the class, and their values can be modified using the public setter methods. 
 * The public getter methods allow the values of the private variables to be accessed from outside the class.

 * Encapsulation helps in maintaining the integrity of the data by preventing direct access to the private members
 *  of the class. It also allows for better organization of the code by grouping related data and methods together,
 *  making it easier to understand and modify.
 */

public class Employee {
    // Private variables
    private String name;
    private int age;
    private double salary;
  
    // Public methods to access the private variables (getters and setters)
    public String getName() {
      return name;
    }
  
    public void setName(String name) {
      this.name = name;
    }
  
    public int getAge() {
      return age;
    }
  
    public void setAge(int age) {
      this.age = age;
    }
  
    public double getSalary() {
      return salary;
    }
  
    public void setSalary(double salary) {
      this.salary = salary;
    }
  }