public class Shelter {
    private static Animal[] crate;
    private static int maxAnimals;
    private static int cratesAvailable;

    public Shelter(int crateCount) {
        crate = new Animal[crateCount];
        maxAnimals = crateCount;
        cratesAvailable = crateCount;
    }

    public int getCratesAvailable(){
        return cratesAvailable;
    }

    public void addAnimal(Animal animal){
        for (int i = 0; i < maxAnimals; i++){
            if (crate[i] == (null)){
                crate[i] = animal;
                cratesAvailable--;
                break;
            }
        }
    }

    public void removeAnimal(int crateNum){
        crate[crateNum] = null;
        cratesAvailable++;
    }

    public void showShelter(){
        System.out.println("Name  age  breed" );
        for (Animal a : crate){
            if (a != null) {
                System.out.println(a.getName() + " " + a.getAge() + " " + getBreed(a));
            }
        }
        System.out.println();
    }

    private String getBreed(Animal a){
        String toReturn;
        if (a.getClass().equals(Dog.class)){
            toReturn = "Dog";
        } else {
            toReturn = "Cat";
        }
        return toReturn;
    }
}
