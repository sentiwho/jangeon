package gamestarter;

import entity.Character;

public class GameInitialization {
    static public void StartCharacterCreationProcess(){
        System.out.println("Welcome to the Jangeon, Choose your hero");
        Character PlayersCharacter = new Character();
        PlayersCharacter.setCharacter(PlayersCharacter.setCharacter(PlayersCharacter.CharacterCreationProcess()));
        System.out.println("Character chosen: " + (PlayersCharacter.getCharacterAll()));
        System.out.println("A! Good choose, you played before, arent you? Now, i`ll recommend you to distribute your stats");
        StatsDist.statsDistribution();
    }
  //   public static void main(String[] args) {
  //   GameInitialization.StartCharacterCreationProcess();
  // }
}