package test;

import domain.Panther;

public class TestPanther {
    public static void main(String[] args) {
        Panther p = new Panther("Bagheera", 90, "Black Panther");
        System.out.println(p);
        p.eat();
        p.speak();
        p.hunt();
        p.stalk();
    }
}
