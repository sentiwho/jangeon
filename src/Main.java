import gameloop.Gameloop;
import gamestarter.GameInitialization;

public class Main {

    public static void main(String[] args) {
        GameInitialization.StartCharacterCreationProcess();
        Gameloop.GameStart();
    }
}
