
import java.util.Scanner;

public class Character {
    private int Strength;
    private int Agility;
    int Wisdom;
    int Mana;
    int Health;
    int RunicCircle;
 
    public Character() {
     this.Strength = 1;
     this.Agility = 1;
     this.Wisdom = 1;
     this.Mana = 1;
     this.Health = 1;
     this.RunicCircle = 1;

 }
 
 static int [] CharacterCreationProcess() {
  int[] LexStats = {0, 2, 0, 10, 50, 0};
  int[] UraStats = {2, 0, 0, 10, 50, 0};
  System.out.println("Choose your character: Lex, Ura");
  Scanner playerсhput = new Scanner(System.in);
 while (true) {
  String choosenCharacter = playerсhput.next();
  if (choosenCharacter.equals("Lex")) {
      System.out.println("You choosed Lex");
      playerсhput.close();
      int [] choosedCharacter = LexStats;
      return choosedCharacter;
} else if (choosenCharacter.equals("Ura")) {
      System.out.println("You choosed Ura");
      playerсhput.close();
      int [] choosedCharacter = UraStats;
      return choosedCharacter;
  } else {
      System.out.println("There is no such hero");
  }
}
}

public int [] setCharacter(int [] array) {
  this.Strength = array[0];
  this.Agility = array[1];
  this.Wisdom = array[2];
  this.Mana = array[3];
  this.Health = array[4];
  this.RunicCircle = array[5];
  return array;
}

public int getCharacterAll() {
  return this.Strength;
}
   
}