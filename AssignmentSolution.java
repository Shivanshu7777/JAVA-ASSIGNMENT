// AssignmentSolution.java
class DataProcessor {

    public void processData(int number) {
        System.out.println("Processing integer data: " + number);
    }

    public void processData(String text) {
        System.out.println("Processing string data: \"" + text + "\"");
        processData(text.length()); 
    }
}
class Animal {

    public void makeSound() {
        System.out.println("Animal makes a sound");
    }
}

class Dog extends Animal {

    @Override
    public void makeSound() {
        System.out.println("Dog barks!..");
    }
}

public class AssignmentSolution {

    public static void main(String[] args) {

        System.out.println("===METHOD OVERLOADING===");
        DataProcessor dp = new DataProcessor();
        dp.processData(10);
        dp.processData("Java");

        System.out.println("\n===METHOD OVERRIDING===");
        Animal a = new Animal();
        Animal d = new Dog();

        a.makeSound();
        d.makeSound();
    }
}

/*
OUTPUT:
=== METHOD OVERLOADING ===
Processing integer data: 10
Processing string data: "Java"
Processing integer data: 4

=== METHOD OVERRIDING ===
Animal makes a generic sound
Dog barks: Woof Woof!
*/
