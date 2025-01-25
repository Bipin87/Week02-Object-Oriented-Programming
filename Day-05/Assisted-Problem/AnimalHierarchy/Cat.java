package AnimalHierarchy;
// subclass
public class Cat extends Animal {
     // Constructor
     public Cat(String name, int age){
        super(name, age);
    }
    // Method Overrinding
    @Override
    void makeSound(){
        System.out.println("Cat is meowing");
    }
    
}
