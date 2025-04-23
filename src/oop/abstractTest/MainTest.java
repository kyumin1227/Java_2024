package oop.abstractTest;

abstract class Animal {

    abstract void makeSound();
}

abstract class Dog extends Animal {

}

class Beagle extends Dog {
    @Override
    void makeSound() {
        System.out.println("Bark");
    }
}

public class MainTest {
    public static void main(String[] args) {

        Dog beagle = new Beagle();
        beagle.makeSound(); // Output: Bark
    }
}
