package efs.task.oop;

public class Main {
    public static void main(String[] args) {
        Villager kashya = new Villager("Kashya", 30);
        Villager akara = new Villager("Akara", 40);
        Villager gheed = new Villager("Gheed", 50);
        Villager deckardCain = new Villager("Deckard Cain", 85);
        Villager warriv = new Villager("Warriv", 35);
        Villager flawia = new Villager("Flawia", 25);

        kashya.sayHello();
        akara.sayHello();
        gheed.sayHello();
        deckardCain.sayHello();
        warriv.sayHello();
        flawia.sayHello();
    }
}
