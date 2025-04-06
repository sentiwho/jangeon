import java.util.Scanner;


public class ChooseCharacter {
    int [] choosedCharacter;
    static int [] CharacterCreationProcess() {
        int[] LexStats = {0, 2, 0, 10, 50, 0};
        int[] UraStats = {2, 0, 0, 10, 50, 0};
        System.out.println("Choose your character: Lex, Ura");
        Scanner playerсhput = new Scanner(System.in);
       while (true) {
        String choosenCharacter = playerсhput.next();
        if (choosenCharacter.equals("Lex")) {
            System.out.println("You choosed Lex");
            playerсhput.close();
            Character.setCharacter(LexStats);
    } else if (choosenCharacter.equals("Ura")) {
            System.out.println("You choosed Ura");
            playerсhput.close();
            int [] choosedCharacter = UraStats;
            return choosedCharacter;
        } else {
            System.out.println("There is no such hero");
        }
    }
}

    
}