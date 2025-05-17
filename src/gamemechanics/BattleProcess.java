package gamemechanics;
import entity.Character;
import entity.RoomsBattle;
import gamestarter.GameInitialization;
import java.util.Arrays;

public class BattleProcess {

    static boolean Battle(RoomsBattle Room, Character Pl){
        int EnemyHealth = Room.EnemyHealth;
        int EnemyDamege = Room.EnemyDamage;
        int PlayersHealth = Pl.getCharacterHealth();
        int PlayersDamage = Pl.getCharacterDamage();
        System.out.printf("Oh, no its a %s\n", Room.getMonsterName());
        System.out.println("Current Stats: " + (Arrays.toString(Pl.getCharacterAllStats())));
        Pl.setAddCharacterStat("Agility");
        System.out.println("Current Stats: " + (Arrays.toString(Pl.getCharacterAllStats())));

        return true;
    }

static public void GameStart() {
    while(true){ 
        BattleProcess.Battle(RoomsBattle.RoomsInit(), GameInitialization.getPlayersCharacter());
}
}}