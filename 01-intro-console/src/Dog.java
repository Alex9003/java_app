public class Dog {
    String name;
    int age;

    Dog(String name, int age) {
        this.name = name;
        this.age = age;
    }
    void run(){
        System.out.println("Run!");
    }
    public void bark() {
        System.out.println("Woof!");
    }
}


public class Main{
    public static void main(String[] args) {
        Dog myDog = new Dog("Buddy", 3);
        myDog.bark();
        myDog.run();
    }
}