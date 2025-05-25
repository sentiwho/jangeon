package gamemechanics;

import entity.Character;
import entity.RoomsBattle;
import gamestarter.GameInitialization;
import java.util.Scanner;

// Process of fight, there all the formulas and fight options. DOC_ID# 9.


public class BattleProcess {

    public static boolean BattleResult() {
        return BattleProcess.Battle(RoomsBattle.RoomsInit(RoomRandomizer.RandomResult()), GameInitialization.getPlayersCharacter());

    }

    public static boolean Battle(RoomsBattle Room, Character Pl) {
        int EnemyHealth = Room.EnemyHealth;
        int EnemyDamage = Room.EnemyDamage;
        int PlayersHealth = Pl.getCharacterHealth();
        int PlayersDamage = Pl.getCharacterDamage();

        System.out.printf("Oh, no its a %s\n", Room.getMonsterName());
        System.out.printf("Your current hp is %s and damage is %s\n", PlayersHealth, PlayersDamage);
        System.out.printf("%s health is %s, and its damage is %s\n", Room.getMonsterName(), EnemyHealth, EnemyDamage);

        Scanner playerInput = new Scanner(System.in);

        while (true) {
            System.out.printf("You can attack! Type [1] to do a fists swing!\n");
            int playerChoose = playerInput.nextInt();

            if (playerChoose == 1) {
                EnemyHealth = EnemyHealth - PlayersDamage;
                PlayersHealth = PlayersHealth - EnemyDamage;

                System.out.printf("Your current hp is %s and damage is %s\n", PlayersHealth, PlayersDamage);
                System.out.printf("%s health is %s, and its damage is %s\n", Room.getMonsterName(), EnemyHealth, EnemyDamage);

                if (PlayersHealth <= 0) {
                    System.out.println("You lost the battle!");
                    return false;
                } else if (EnemyHealth <= 0) {
                    // System.out.println("You won the battle!");
                    return true;
                }
            } else {
                System.out.println("Invalid choice. Please type [1] to attack.");
            }
        }
    }
}
