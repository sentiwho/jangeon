package gamemechanics;

import java.util.Scanner;

// This is where logic for player choose type of room we want to visit next is. DOC_ID# 11.


public class PlayerRoomChoose {
        
        public static int PlayerRoomDes() {
         System.out.printf("Choose type of next room.\n");
         System.out.printf("Wanna fight? [1] Or gotta by tryin to get gods help?[2].\n");
         Scanner playerInput = new Scanner(System.in);
         int playerChoose = playerInput.nextInt();
         return playerChoose;
        }


}
