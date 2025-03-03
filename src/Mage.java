public class Mage extends Character {
    Mage(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    public void fireball(Character target) {
        if (getMana() >= 10) {
            setMana(getMana() - 10); // Reduce mana
            System.out.println(getName() + " casts Fireball on " + target.getName() + "!");
            target.takeDamage(20); // Fireball does 20 damage
        } else {
            System.out.println(getName() + " doesn't have enough mana to cast Fireball!");
        }
    }
}
