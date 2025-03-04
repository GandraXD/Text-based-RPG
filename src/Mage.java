public class Mage extends Character {
    Mage(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    public void fireball(Character target) {
        int dmg = 20;
        int cost = 10;

        if (getMana() >= cost) {
            setMana(getMana() - cost); // Reduce mana
            System.out.println(getName() + " casts Fireball on " + target.getName() + "!");
            target.takeDamage(dmg); // Fireball does 20 damage
        } else {
            System.out.println(getName() + " doesn't have enough mana to cast Fireball!");
        }
    }
}
