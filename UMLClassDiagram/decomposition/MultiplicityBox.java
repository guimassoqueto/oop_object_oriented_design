package decomposition;
import java.util.*;

public class MultiplicityBox {
  private List<MultiplicityProduct> products;

  public MultiplicityBox() {
    this.products = new ArrayList<MultiplicityProduct>();
  }

  public void addProduct(MultiplicityProduct product) {
    products.add(product);
  }

  public List<MultiplicityProduct> getProducts() {
    return products;
  }
}

/*In this example, the MultiplicityBox class has a one-to-many relationship with the MultiplicityProduct class.
 * The Department class can have many MultiplicityProduct objects associated with it, while each MultiplicityProduct 
 * object can only be associated with one MultiplicityBox object.

 * The multiplicity of the Department class is "many" and the multiplicity of the MultiplicityProduct class is "one". 
*/