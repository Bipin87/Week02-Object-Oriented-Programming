package AnimalHierarchy;

public class Main {
    public static void main(String[] args) {
        // Simple Inheritance
        Bird bird = new Bird("Crow", 1);
        bird.makeSound();
        Cat cat = new Cat("Sibi",2);
        cat.makeSound();
        Dog dog = new Dog("Puppy",6);
        dog.makeSound();
        System.out.println();
        System.out.println();


        // Polymorphism
        Animal animal = new Animal("Animal", 8);
        System.out.println(animal.toString());
        animal.makeSound();
        Animal myDog = new Dog("Doggy", 9);
        System.out.println(myDog.toString());
        myDog.makeSound();
        Animal myCat = new Cat("Daisy",3);
        System.out.println(myCat.toString());
        myCat.makeSound();
        Animal myBird = new Bird("Owl",4);
        System.out.println(myBird.toString());
        myBird.makeSound();
    }
    
}
