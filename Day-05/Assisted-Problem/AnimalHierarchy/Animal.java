package AnimalHierarchy;

public class Animal {
    private String name;
    private int age;
    // Constructor
    public Animal(String name, int age){
        this.name = name;
        this.age = age;

    }
    @Override
    public String toString(){
        return name + "  age: " + age;
    }
    void makeSound(){
        System.out.println("Animal sound");
    }
    
}
