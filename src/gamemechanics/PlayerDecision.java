package gamemechanics;
import entity.RoomsKarma;
import gamestarter.GameInitialization;
import java.util.Scanner;

// This is gameplay for RoomsKarma type of rooms. DOC_ID# 10.


public class PlayerDecision {
    public static void PlayersDeсicionResult() {
        RoomsKarma CurrentRoom = RoomsKarma.RoomKarmaInit(RoomRandomizer.RandomResult());
        System.out.println(CurrentRoom.getKarmaSpeech());
        System.out.println("Would you help[1]? Or just pass it to the next adventurer[2]?");
        Scanner playerInput = new Scanner(System.in);
        int playerDecision = playerInput.nextInt();
        if (playerDecision == 1){
            GameInitialization.getPlayersCharacter().setCharacterKarma(CurrentRoom.getKarmaAmount(1));
        } else if (playerDecision == 2) {
           GameInitialization.getPlayersCharacter().setCharacterKarma(CurrentRoom.getKarmaAmount(2));
        }
        
    }

    
}