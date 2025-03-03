public class Character {
    private int hp, mana, dmg;
    private String name;

    Character (String name, int hp, int mana) {
        this.name = name;
        this.hp = hp;
        this.mana = mana;
    }

    //region

    public int getHp() {
        return hp;
    }

    public void setHp(int hp) {
        this.hp = hp;
    }

    public int getMana() {
        return mana;
    }

    public void setMana(int mana) {
        this.mana = mana;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    //endregion

    public void takeDamage(int damage) {
        this.hp -= damage;
        System.out.println(name + " takes " + damage + " damage.");
    }

    public void healed(int heal) {
        this.hp += heal;
        System.out.println(name + " has been healed for " + heal + " heal.");
    }

    public void attack(Character target) {
        System.out.println(name + " attacks " + target.name + "!");
        target.takeDamage(5); // Default attack does 5 damage
    }
}
