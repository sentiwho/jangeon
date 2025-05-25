import gameloop.Gameloop;
import gamestarter.GameInitialization;

// Main method that runs the programm. DOC_ID# 1

public class Main {

    public static void main(String[] args) {
        GameInitialization.StartCharacterCreationProcess();
        Gameloop.GameStart();
    }
}
