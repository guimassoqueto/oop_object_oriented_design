package sup;

public class Animal {
    private String name;
    private int legs;

    public Animal(String name, int legs) {
        this.name = name;
        this.legs = legs;
    }

    public void walk() {
        System.out.printf("%s is walking.\n", this.name);
    }

    public void countlegs() {
        System.out.printf("%s has %d legs.\n", this.name, this.legs);
    }
}
