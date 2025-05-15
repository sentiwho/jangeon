package gamestarter;

import java.util.Arrays;
import java.util.Scanner;

public class StatsDist {
  static void statsDistribution() {
    int statsToDistAmount = 10;
    String[] statAliace = { "Strength", "Agility", "Wisdom" };
    int[] distedStats = { 0, 0, 0 };
    System.out.println("You got three options here, Strength[1], Agility[2] or would you like to be an mage[3] falk?");
    System.out.println(
        "Text the number of characteristic, that you want to improve by 1. You got 10 stat points to distribute");
    Scanner playerInput = new Scanner(System.in);

   while (statsToDistAmount >= 1) {
      int choosenStat = playerInput.nextInt();
      if (choosenStat == 1 || choosenStat == 2 || choosenStat == 3) {
        System.out.println("Send numeric number of characterictis you wannt to improve, you left to spend:"
            + statsToDistAmount + "points");
        System.out.println("You choosed " + statAliace[choosenStat]);
        distedStats[choosenStat] = distedStats[choosenStat] + 1;
        System.out.println("Now your characteristics is " + statAliace[0] + "is " + distedStats[0] + statAliace[1]
            + "is " + distedStats[1] + statAliace[2] + "is " + distedStats[2]);
        statsToDistAmount = statsToDistAmount - 1;
      } else {
        System.out.println("Dont play fool, there is no stats like that!");
      }
      // return Массив с распределенными характеристиками
    }
      System.out.println("you spent all of it! Your stats is " + Arrays.toString(distedStats));
  }
}
 