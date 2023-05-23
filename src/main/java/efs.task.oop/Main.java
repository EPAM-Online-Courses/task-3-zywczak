package efs.task.oop;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        Villager[] villagers = {
                new Villager("Kashya", 30),
                new ExtraordinaryVillager("Akara", 40, ExtraordinaryVillager.Skill.SHELTER),
                new Villager("Gheed", 50),
                new ExtraordinaryVillager("Deckard Cain", 85, ExtraordinaryVillager.Skill.IDENTIFY),
                new Villager("Warriv", 35),
                new Villager("Flawia", 25)
        };

        for (Villager villager : villagers) {
            villager.sayHello();
        }

        Object objectDeckardCain = villagers[3];
        Object objectAkara = villagers[1];
        //objectDeckardCain.sayHello();//nie mozna wywolac metody z klasy ExtraordinaryVillager
        //nalezy wykonac rzutowanie ((ExtraordinaryVillager) objectAkara).takeHit(damage);

        Monsters monsters = new Monsters();
        int i = 0;
        int n = villagers.length;

        while (monsters.monstersHealth > 0 && villagers[0].getHealth() > 0) {
            Random random = new Random();
            i = random.nextInt(n);

            if(monsters.andariel.getHealth() > 0) {
                villagers[i].attack(monsters.andariel);
            }else{
                villagers[i].attack(monsters.blacksmith);
            }

            if(monsters.andariel.getHealth()>0) {
                monsters.andariel.attack(villagers[i]);
            }else {
                monsters.blacksmith.attack(villagers[i]);
            }

            if(villagers[i].getHealth() == 0){
                Villager temp = villagers[n-1];
                villagers[n-1] = villagers[i];
                villagers[i] = temp;
                n--;
            }

            System.out.println("Potwory posiadaja jeszcze " + monsters.monstersHealth + " punkty zycia ");
            System.out.println("Aktualnie walczacy osadnik to " + villagers[i].getName());
        }

        if(villagers[0].getHealth() > 0){
            System.out.println("Obozowisko ocalone!");
        }else{
            System.out.println("Obozowisko przepadlo!");
        }

        for (Villager villager : villagers) {
            if (villager instanceof ExtraordinaryVillager) {
                ExtraordinaryVillager extraordinaryVillager = (ExtraordinaryVillager) villager;
                extraordinaryVillager.sayHello();
            }
        }
    }
}
