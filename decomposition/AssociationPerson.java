package decomposition;

public class AssociationPerson {
    private String name;
    private int age;
    private AssociationAddress address; // association with Address class
  
    public AssociationPerson(String name, int age, AssociationAddress address) {
      this.name = name;
      this.age = age;
      this.address = address;
    }
  
    // Getter and setter methods for name, age, and address
}
  

  
