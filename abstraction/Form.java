package abstraction;

/*
 * An interface is a collection of abstract methods that define the behavior of an object. 
 * It defines a contract between the implementing class and the code that uses it.
 */

interface Form {
    // Abstract method (no implementation)
    public double area();
}

class Rectangle implements Form {
    private double width;
    private double height;
  
    public Rectangle(double width, double height) {
      this.width = width;
      this.height = height;
    }
  
    // Implementation of the abstract method
    public double area() {
      return width * height;
    }
}

/*
 * In the above examples, both Shape and Rectangle are abstract classes/interfaces. 
 * The Shape class defines the behavior of shapes without specifying any implementation details, 
 * and Rectangle provides its implementation of the area() method.

 * By using abstraction, we can create a system that is easier to understand, modify, 
 * and maintain. We can focus on the essential features of the system and ignore the details 
 * that are not necessary for the task at hand.
 */