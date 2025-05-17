package entity;

public class Monster {
    int HealthAmount;
    int Damage;
    String Name;
 
    public Monster(int hp, int dmg, String name) {
     this.HealthAmount = hp;
     this.Damage = dmg;
     this.Name = name;
 }
 public int getEnemyHealth(){
  return this.HealthAmount;
 }
  public int getEnemyDamage(){
  return this.Damage;
 }
 public String getName(){
  return this.Name;
 }
 
   }

