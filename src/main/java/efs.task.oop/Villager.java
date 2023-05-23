package efs.task.oop;

public class Villager implements Fighter{
    protected int health = 100;
    private String name;
    private int age;

    public Villager(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getHealth() {
        return health;
    }

    @Override
    public void attack(Fighter victim) {
        victim.takeHit((int) (100 - age * 0.5) / 10);
    }

    @Override
    public void takeHit(int damage) {
        health -= damage;
        if (health <= 0) {
            health=0;
        }
    }

    public void sayHello() {
        System.out.println("Greetings traveler... I'm " + name + " and I'm " + age + " years old.");
    }
}
