package AnimalPackage;

public class main {
    public static void main(String[] args) {
        Dog barney = new Dog();
        System.out.println(barney.animalname());
        Cat garfield = new Cat();
        System.out.println(garfield.animalname());
        Car ford = new Car();
        System.out.println(ford.vehicleName());
        Van van1 = new Van();
        System.out.println(van1.vehicleName());
    }
}