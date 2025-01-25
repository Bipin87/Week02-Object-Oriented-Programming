package AnimalHierarchy;
// subclass
public class Dog extends Animal {
    // Constructor
    public Dog(String name, int age){
        super(name, age);
    }
    // Method Overrinding
    @Override
    void makeSound(){
        System.out.println("Dog sound is barking");
    }
    
}
