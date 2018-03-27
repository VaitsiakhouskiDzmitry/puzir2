public class Dog {
    private int age;
    private String name;

    private void printInfo() {
        System.out.println(getAge());
        System.out.println(getName());
    }


    public int getAge() {
        return age;
    }

    public String getName() {
        return name;
    }

    public static void main(String[] args) {
        int a=10;
        Dog dog = new Dog();
        dog.printInfo();
    }
}
