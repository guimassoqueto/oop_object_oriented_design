package decomposition;

public class AggregationCar {
    private AggregationEngine engine; // Aggregation
    
    public AggregationCar(AggregationEngine engine) {
       this.engine = engine;
    }
    
    public AggregationEngine getEngine() {
       return engine;
    }
 }

/*
 * In this example, the Car class contains an instance variable called engine, 
 * which holds a reference to an instance of the Engine class. The Car class is composed 
 * of an Engine object through aggregation.

 * The Main class creates a new Engine object with type "V8", 
 * and passes it to the constructor of the Car class. Then, it prints 
 * out the type of engine that the car has.
*/