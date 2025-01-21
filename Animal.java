import java.util.ArrayList;

public class Animal {
    private String name;
    private int age;
    private static int catCount;
    private static int dogCount;
    private static int animalCount;
    private static ArrayList<Animal> animals;

    public Animal(){
        catCount = 0;
        dogCount = 0;
        animalCount=0;
        animals = new ArrayList<>();
    }

    public Animal(String name, int age) {
        this.name = name;
        this.age = age;
        animals.add(this);
        animalCount++;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getAnimalCount(){
        return animalCount;
    }

    public void showAnimals(){
        for (Animal a : animals){
            System.out.println(a.getName() + "\t" + a.getAge());
        }
    }

    protected void addCat(){
        catCount++;
    }

    protected void addDog(){
        dogCount++;
    }

    public int getCatCount(){
        return catCount;
    }

    public int getDogCount(){
        return dogCount;
    }
}
