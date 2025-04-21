package domain;

public class Animal {
    protected String name;
    protected int weight;

    public Animal() {}

    public Animal(String name, int weight) {
        this.name = name;
        this.weight = weight;
    }

    public void eat() {
        System.out.println(name + " is eating...");
    }

    public void speak() {
        System.out.println(name + " makes a sound.");
    }

    @Override
    public String toString() {
        return "Animal: " + "\nName:\t" + name + "\nWeight:\t" + weight+" kg";
    }
}
