package decomposition;

public class AssociationAddress {
    private String street;
    private String city;
    private String state;
  
    public AssociationAddress(String street, String city, String state) {
      this.street = street;
      this.city = city;
      this.state = state;
    }
}


/*
 * In the above example, the Person class has an instance variable address of type Address, 
 * which represents the association between the two classes. The Address class represents the street,
 *  city, and state of a person's address, and the Person class has a reference to an Address object.

 * The association between the two classes allows a Person object to have an address, and the Address 
 * object to be associated with a Person. This association is a "has-a" relationship because a Person has an
 *  Address.

 * Associations are essential in decomposition because they allow us to break down a complex system into smaller
 *  parts that work together to achieve the overall functionality. By defining the associations between the classes,
 *  we can create a well-organized and easily maintainable codebase.
 */