abstract class Animal{
    private String name;

    public Animal(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public abstract makeSound();

    public void sleep(){
        System.out.println(" is sleeping");
    }
}

class Lion extends Animal{
    public Lion(String name) {
        super(name);
    }

    @Override
    public void makeSound() {
        System.out.println("Roar");
    }
}

class Parrot extends Animal{
    private String color;

    public Parrot(String name, String color) {
        super(name);
        this.color = color;
    }

    public String getColor() {
        return color;
    }

    @Override
    public void makeSound() {
        System.out.println("Squawk");
    }
}

public static void main(String[] args){
    Lion l1 = new Lion("leo");
    Parrot p1 = new Parrot("poki","blue");

    System.out.println(l1.getName() + " is a Lion.");
    l1.makeSound();
    l1.sleep();

        System.out.println(p1.getName() + " is a " + p1.getColor() + " Parrot.");
        p1.makeSound();
        p1.sleep();
}


// In the example:

// Classes and Objects: Animal is a class, while simba and rio are objects.
// Encapsulation: Animal's name attribute and Parrot's color attribute are encapsulated with private visibility, and public getter methods are provided.
// Inheritance: Both Lion and Parrot classes inherit from the Animal class.
// Polymorphism: Both Lion and Parrot provide their own implementation of the makeSound() method, even though they are treated as Animal objects.
// Abstraction: The Animal class contains the abstract method makeSound(), ensuring derived classes provide their own implementation.