package efs.task.oop;

public class Monsters {
    public static final Monster Andariel = new Monster(10, 70) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(getDamage());
        }

        @Override
        public void takeHit(int damage) {
            health -= damage;
            monstersHealth -= damage;
            if(monstersHealth < 0){
                monstersHealth = 0;
            }
        }
    };

    public static final Monster Blacksmith = new Monster(100, 25) {
        @Override
        public void attack(Fighter victim) {
            victim.takeHit(getDamage());
        }

        @Override
        public void takeHit(int damage) {
            health -= (5 + damage);
            monstersHealth -= (5 + damage);
            if(monstersHealth < 0){
                monstersHealth = 0;
            }
        }
    };

    public static int monstersHealth = Andariel.getHealth() + Blacksmith.getHealth();
}
