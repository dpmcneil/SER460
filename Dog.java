public class Dog extends Animal implements Talk {
    public Dog(String name, int age) {
        super(name, age);
        addDog();
    }

    @Override
    public void makeTalk() {
        System.out.println(super.getName() + " goes bark!");
    }
}
