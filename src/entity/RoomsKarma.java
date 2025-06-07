package entity;
import gamestarter.GameInitialization;

public class RoomsKarma {
    String situation;
     int desicionYes;
     int desicionNo;
    int playersKarma;
 
    public RoomsKarma(String sit, int desNo, int desYes) { 
     this.situation = sit;
     this.desicionYes = desNo;
     this.desicionNo = desYes;
     this.playersKarma = GameInitialization.getPlayersCharacter().GetCharacterKarma();
      }

      /* Same as Roomsbattle but for the peace type room DOC_ID# 8*/
        
      public static RoomsKarma RoomKarmaInit(int randomizerResult) {
        switch (randomizerResult) {
            case 1:
                RoomsKarma SoldierAskPotion = new RoomsKarma("oh no, there is soldier dying, please give him potion!", 5, -5);
                return SoldierAskPotion;
            case 2:
                RoomsKarma GoblinAskGold = new RoomsKarma("oh no, there is goblin dying, please give him gold!", 5, -5);
                return GoblinAskGold;
            default:
                throw new AssertionError();
        }
      }

      public String getKarmaSpeech() {
        return this.situation;
      }
      
      public int getKarmaAmount(int decision) {
        int result = 0;
        if (decision == 1) {
            result = this.desicionYes;
        } else if (decision == 2) {
            result = this.desicionNo;
        }
        System.out.println("DEBUG. Result of karma desicion change in RoomsKarma.java before passing to the PlayerDecision.java" + result);
        return result;
      }

      
   }