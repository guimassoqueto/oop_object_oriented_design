package decomposition;

public class AssociationPerson {
    private String name;
    private int age;
    private AssociationStreet street; // association with Address class
  
    public AssociationPerson(String name, int age, AssociationStreet street) {
      this.name = name;
      this.age = age;
      this.street = street;
    }
  
    public String getName() {
      return this.name;
    }

    public int getAge() {
      return this.age;
    }
    
    public AssociationStreet getStreet() {
      return this.street;
    }
}
  
/*
 * In the above example, the AssociationPerson class has an instance variable address of type Address, 
 * which represents the association between the two classes. The AssociationStreet class represents the street,
 *  city, and state of a AssociationPerson's address, and the AssociationPerson class has a reference to an Address object.

 * The association between the two classes allows a AssociationPerson object to have an address, and the AssociationStreet 
 * object to be associated with a AssociationPerson. This association is a "has-a" relationship because a AssociationPerson has an
 *  Address.

 * Associations are essential in decomposition because they allow us to break down a complex system into smaller
 *  parts that work together to achieve the overall functionality. By defining the associations between the classes,
 *  we can create a well-organized and easily maintainable codebase.
 */
  
