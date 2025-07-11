package gamestarter;

import entity.Character;
import java.util.Arrays;

// Class that responds for player object being created, DOC_ID# 2.
public class GameInitialization {
  private static Character playersCharacter; 

    static public void StartCharacterCreationProcess(){
        System.out.println("Welcome to the Jangeon, Choose your hero");
        playersCharacter = new Character();
        playersCharacter.setCharacterHero(playersCharacter.CharacterChoosingProcess());
        System.out.println("Character chosen: " + (Arrays.toString(playersCharacter.getCharacterAllStats())));
        System.out.println("A! Good choose, you played before, arent you? Now, i`ll recommend you to distribute your stats");
        StatsDist.statsDistribution(playersCharacter);
    }
  public static Character getPlayersCharacter() {
        return playersCharacter; // Methos that gives acces to an exemplar of Character
    }
} 