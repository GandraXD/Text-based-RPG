public class Healer extends Character {
    Healer(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    public void heal(Character target, int heal) {
        if (getMana() >= 10) {
            setMana(getMana() - 10); // Reduce mana
            System.out.println(getName() + " heals " + target.getName() + "!");
            target.healed(15);
        } else {
            System.out.println(getName() + " doesn't have enough mana to heal " + target.getName() + "!");
        }
    }
}
