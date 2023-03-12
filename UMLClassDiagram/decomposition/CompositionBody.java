package decomposition;

public class CompositionBody {
    private CompositionHeart heart;
    
    public CompositionBody() {
       this.heart = new CompositionHeart(true);
    }
    
    public CompositionHeart getHeart() {
       return this.heart;
    }
 }

/*
 * In this example, the Body class contains an instance variable called heart, 
 * which holds an instance of the CompositionHeart class. The CompositionHeart object is created
 *  inside the constructor of the Car class, so it is owned by the Car object through composition.

 * The Main class creates a new Car object, which automatically creates a new CompositionHeart object 
 * inside its constructor. Then, it prints out the size of the steering wheel that the car has.
 */
 
