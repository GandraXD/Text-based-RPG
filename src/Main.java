//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Controller controller = new Controller();

        Warrior velheim = new Warrior("Velheim", 100, 10);
        controller.addCharacter(velheim);

        Mage djumbir = new Mage("Djumbir", 50, 100);
        controller.addCharacter(djumbir);

        Healer mileva = new Healer("Mileva", 30, 70);
        controller.addCharacter(mileva);

        velheim.heavyStrike(djumbir);

        mileva.heal(djumbir, 15);
        controller.displayCharacters();
    }
}