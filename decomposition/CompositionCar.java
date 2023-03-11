package decomposition;

public class CompositionCar {
    private CompositionSteeringWheel steeringWheel; // Composition
    
    public CompositionCar() {
       this.steeringWheel = new CompositionSteeringWheel();
    }
    
    public CompositionSteeringWheel getSteeringWheel() {
       return steeringWheel;
    }
 }

/*
 * In this example, the Car class contains an instance variable called steeringWheel, 
 * which holds an instance of the SteeringWheel class. The SteeringWheel object is created
 *  inside the constructor of the Car class, so it is owned by the Car object through composition.

 * The Main class creates a new Car object, which automatically creates a new SteeringWheel object 
 * inside its constructor. Then, it prints out the size of the steering wheel that the car has.
 */
 
