public class Cat extends Animal implements Talk{
    public Cat(String name, int age) {
        super(name, age);
        addCat();
    }

    @Override
    public void makeTalk() {
        System.out.println(super.getName() + " goes meow!");
    }
}
