package entity;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Character {
    private int Strength;
    private int Agility;
    private int Wisdom;
    private int Mana;
    private int Health;
    private int RunicCircle;
    private int CharacteriscticPoints;
    private int Karma;

    public Character() {
        this.Strength = 1;
        this.Agility = 1;
        this.Wisdom = 1;
        this.Mana = 1;
        this.Health = 1;
        this.RunicCircle = 1;
        this.CharacteriscticPoints = 1;
        this.Karma = 1;
        

    }

    static public int[] CharacterChoosingProcess() {
        int[] LexStats = { 0, 2, 0, 10, 50, 0, 10, 0 };
        int[] UraStats = { 2, 0, 0, 10, 50, 0, 10, 0 };
        System.out.println("Choose your character: Lex, Ura");
        Scanner playerInput = new Scanner(System.in);
        while (true) {
            try {
                String choosenCharacter = playerInput.next();
                if (choosenCharacter.equals("Lex")) {
                    System.out.println("You choosed Lex");
                    int[] choosedCharacter = LexStats;
                    return choosedCharacter;
                } else if (choosenCharacter.equals("Ura")) {
                    System.out.println("You choosed Ura");
                    int[] choosedCharacter = UraStats;
                    return choosedCharacter;
                } else {
                    System.out.println("There is no such hero");
                }
            } catch (InputMismatchException e) {
                System.out.println("Its not even a name, bruh...");
            }
        }
    }

    public void setCharacterHero(int[] array) {
        this.Strength = array[0];
        this.Agility = array[1];
        this.Wisdom = array[2];
        this.Mana = array[3];
        this.Health = array[4];
        this.RunicCircle = array[5];
        this.CharacteriscticPoints = array[6];
        this.Karma = array[7];
    }

    // public int [] setCharacterStatAdd(int [] array, int Characteristic) {
    // this.Characteristic = this.Characteristic + 1;
    // return array;
    // }

    public void setAddCharacterStat(String stat) {
        switch (stat) {
            case "Strength":
                this.Strength = this.Strength+1;
                break;
            case "Agility":
                this.Agility = this.Agility+1;
                break;
            case "Wisdom":
                this.Wisdom = this.Wisdom+1;
                break;
            case "Mana":
                this.Mana = this.Mana+1;
                break;
            case "Health":
                this.Health = this.Health+1;
                break;
            case "RunicCircle":
                this.RunicCircle = this.RunicCircle+1;
                break;
            case "CharacteriscticPoints":
                this.CharacteriscticPoints = this.CharacteriscticPoints+1;
                break;
            default:
                System.out.println("Error ocured when trying to add an stat");
        }

    }

    public int getCharacterHealth() {
        return this.Health;
    }

     public int getCharacterDamage() {
        int dmg = this.Agility + this.Strength;
        return dmg;
    }

    public static Character getCharacter(Character Character) {
        return Character;
    }

    public int GetCharacterKarma() {
        return this.Karma;
    }

    public void setCharacterKarma(int karmaChange) {
        this.Karma = this.Karma + karmaChange;
    }


    public int[] getCharacterAllStats() {
        return new int[] { this.Strength, this.Agility, this.Wisdom, this.Mana, this.Health, this.RunicCircle,
                this.CharacteriscticPoints, this.Karma };
    }

}