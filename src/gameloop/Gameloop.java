package gameloop;
import gamemechanics.*;

public class Gameloop{
public static boolean GameStart() {
    while(true){ 
       int roomType = PlayerRoomChoose.PlayerRoomDes();
       if (roomType == 1) {
           Fight();
       } else if (roomType == 2) {
           Decision();
       }
}
}

public static boolean Fight(){
   
        boolean BattleResult = BattleProcess.BattleResult();
        if (!BattleResult) {
            System.out.printf("Game end.\n");
            return false;
        } else if (BattleResult) {
            System.out.printf("You won!\n");
        }
        return true;
} 

public static boolean Decision(){
    PlayerDecision.PlayersDeсicionResult();
    return true;
}
}