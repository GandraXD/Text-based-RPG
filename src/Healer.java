public class Healer extends Character {
    Healer(String name, int hp, int mana) {
        super(name, hp, mana);
    }

    public void heal(Character target) {
        int cost = 10;
        int heal = 15;

        if (getMana() >= cost) {
            setMana(getMana() - cost); // Reduce mana
            System.out.println(getName() + " heals " + target.getName() + "!");
            target.healed(heal);
        } else {
            System.out.println(getName() + " doesn't have enough mana to heal " + target.getName() + "!");
        }
    }
}
