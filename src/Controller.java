import java.util.ArrayList;
import java.util.List;

public class Controller {
    private List<Character> characters = new ArrayList<>();

    public void addCharacter(Character character) {
        characters.add(character);
    }

    public void displayCharacters() {
        System.out.println("\n--- Character Status ---");
        for (Character character : characters) {
            System.out.println(character.getName() + ": " + character.getHp() + " HP | " + character.getMana() + " Mana");
        }
        System.out.println("------------------------\n");
    }
}
