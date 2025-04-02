import java.util.Scanner;


public class ChooseCharacter {
    static void CharacterCreationProcess() {
        int[] LexStats = {0, 2, 0, 10, 50, 0};
        System.out.println("Choose your");
        Scanner playerсhput = new Scanner(System.in);
        String choosenCharacter = playerсhput.next();
        switch(choosenCharacter) {
            case "Lex" -> {
                Character PlayersCharacter = new Character(LexStats);
                System.out.println(PlayersCharacter.Agility);
            }
            default -> System.out.println("Wrong input");
          }
    }
    public static void main(String[] args) {
        ChooseCharacter.CharacterCreationProcess();
      }
}