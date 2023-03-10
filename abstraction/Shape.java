package abstraction;

/*
 * An abstract class is a class that cannot be instantiated and serves as a base for other classes 
 * to inherit from. It can have abstract methods that are declared but not implemented, forcing the 
 * derived classes to provide their implementation.
 */

abstract class Shape {
    // Abstract method (no implementation)
    public abstract double area();
}

class Rectangle extends Shape {
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