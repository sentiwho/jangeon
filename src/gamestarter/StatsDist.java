package gamestarter;

import entity.Character;
import java.util.Arrays;
import java.util.InputMismatchException;
import java.util.Scanner;

// Part of character creation, dustributing stats, sets stats for character using Character.class setters. DOC_ID# 3.

public class StatsDist {
  static void statsDistribution(Character playersCharacter) {
    int statsToDistAmount = 10;
    String[] statAliace = { "Strength", "Agility", "Wisdom" };
    int[] distedStats = { 0, 0, 0 };
    System.out.println("You got three options here, Strength[1], Agility[2] or would you like to be an mage[3] falk?");
    System.out.println(
        "Text the number of characteristic, that you want to improve by 1. You got 10 stat points to distribute");
    Scanner playerInput = new Scanner(System.in);

   while (statsToDistAmount >= 1) {
    try {
        int choosenStat = playerInput.nextInt() - 1;
        if (choosenStat == 0 || choosenStat == 1 || choosenStat == 2) {
            System.out.printf("You choosed %s\n", statAliace[choosenStat]);
            System.out.printf("Send numeric number of characterictis you wannt to improve, you left to spend: %s points\n", statsToDistAmount);
            distedStats[choosenStat] = distedStats[choosenStat] + 1;
            playersCharacter.setAddCharacterStat(statAliace[choosenStat]);
            // System.out.printf("Now your characteristics %s is %s %s is %s %s is %s\n", statAliace[0], distedStats[0], statAliace[1], distedStats[1], statAliace[2], distedStats[2]);
            System.out.println("Current Stats: " + (Arrays.toString(playersCharacter.getCharacterAllStats())));
            statsToDistAmount = statsToDistAmount - 1;
        } else {
            System.out.println("Dont play fool, there is no stats like that!");
        }
    } catch (InputMismatchException e) {
        System.out.println("Thats not even number!");
        playerInput.next(); // Очистка некорректного ввода
    } catch (Exception e) {
        System.out.println("Stop smacking keyboard! Just send me a number!" + e.getMessage());
    }
}
    
      System.out.printf("you spent all of it! Your stats is %s\n", Arrays.toString(distedStats));
  }
}
 