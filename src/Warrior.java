public class Warrior extends Character {
    Warrior(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    public void heavyStrike(Character target) {
        System.out.println(getName() + " uses Heavy Strike on " + target.getName() + "!");
        target.takeDamage(15); // Heavy Strike does 15 damage
    }
}
