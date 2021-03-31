package decagon.tolulope.COMPOSITION;

public class PetAndPerson {
    public static void main(String[] args) {
        Pet myDog = new Pet("Zeke",3);
        Pet myCat = new Pet("fluffy", 2);

        Person person1 = new Person("Ayo");
        Person person2 = new Person("Ola");

        person1.setPet(myDog);
        person2.setPet(myCat);

        System.out.println(person1.getName() + " has a pet name " + person1.getPet().getName());
        System.out.println(person2.getName() + " has a pet name " + person2.getPet().getName());
    }
}
