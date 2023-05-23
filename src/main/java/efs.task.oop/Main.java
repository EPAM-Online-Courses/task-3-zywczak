package efs.task.oop;

public class Villager {
    private String name;
    private int age;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old.");
    }
}

public class Main {
    public static void main(String[] args) {

    }
}
