public class Main {
    public static void main(String[] args) {

        Animal kennel = new Animal();
        showAnimals(kennel);
        Dog dog1 = new Dog("Logan", 10);
        dog1.makeTalk();
        showAnimals(kennel);
        Dog dog2 = new Dog("Buster", 13);
        showAnimals(kennel);
        dog2.makeTalk();
        Cat cat1 = new Cat("Storm", 16);
        cat1.makeTalk();
        showAnimals(kennel);
    }

    public static void showAnimals(Animal kennel){
        System.out.println("number of dogs: " + kennel.getDogCount());
        System.out.println("number of cats: " + kennel.getCatCount());
        System.out.println("number of animals: " + kennel.getAnimalCount());
        System.out.println("animals: \nname \t age");
        kennel.showAnimals();
    }
}