package domain;

public class Panther extends Predator {
    private String subspecies;

    public Panther() {}

    public Panther(String name, int weight, String subspecies) {
        this.name=name;
        this.weight=weight;
        this.subspecies = subspecies;
    }

    public void stalk() {
        System.out.println(name + " is stalking silently through the jungle.");
    }

    @Override
    public void eat() {
        System.out.println(name + " is eating fresh meat.");
    }

    @Override
    public String toString() {
        return "Panther: " + name + ", Weight: " + weight + "kg, Subspecies: " + subspecies;
    }
    
    
}
