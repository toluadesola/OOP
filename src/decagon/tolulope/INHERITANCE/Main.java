package decagon.tolulope.INHERITANCE;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal("Yorke", 1,1,12,32);

        Dog dog = new Dog("Zeke", 23, 35, 2, 4, 43, "long fur");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
