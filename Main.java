public class Main {
    public static void main(String[] args) {

        Shelter shelter = new Shelter(5);
        shelter.addAnimal(new Dog("Logan", 10));
        shelter.showShelter();
        shelter.addAnimal(new Dog("Buster", 13));
        shelter.addAnimal(new Cat("Storm", 16));
        shelter.showShelter();
    }
}