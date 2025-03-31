public class Character {
    int Strength;
    int Agility;
    int Mana;
    int Health;
    int RunicCircle;
 
    public Character(int Strength, int Agility, int Mana, int Health, int RunicCircle) {
     this.Strength = Strength;
     this.Agility = Agility;
     this.Mana = Mana;
     this.Health = Health;
     this.RunicCircle = RunicCircle;

 }
     public static void Character(String[] args) {
        Character CharacterUra = new Character(1, 1, 1, 1, 0);
        System.out.println("Now your characteristics is " + CharacterUra.Strength);
       // Character CharacterLex = new Character(0, 0, 0, 0, 0);
     }
   }