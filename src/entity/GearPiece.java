package entity;

public class GearPiece {
    String GearName;
    int Strength;
    int Agility;
    int Wisdom;
    int Mana;
    int Health;
    int Karma;
    
    
    public GearPiece(String GearName, int Strength, int Agility, int Wisdom, int Mana, int Health, int Karma) {
     this.GearName = GearName;
     this.Strength = Strength;
     this.Agility = Agility;
     this.Wisdom = Wisdom;
     this.Mana = Mana;
     this.Health = Health;
     this.Karma = Karma;
    }

    public GearPiece GearObjectCreation(int randomNumber){
        switch (randomNumber) {
            case 1 :
                GearPiece BrokenSword = new GearPiece("Broken Sword", 1, 0, 0, 0, 0, 0);
                return BrokenSword;
            default:
                throw new AssertionError();
        }
    }
}
