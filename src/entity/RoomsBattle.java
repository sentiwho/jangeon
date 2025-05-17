package entity;

public class RoomsBattle {
   public Monster Monster;
   public int EnemyHealth;
   public int EnemyDamage;
   public String MonsterName;
   // int ExpReward;

   public RoomsBattle(Monster Monster) {
    this.Monster = Monster;
    this.EnemyHealth = Monster.getEnemyHealth();
    this.EnemyDamage = Monster.getEnemyDamage();
    this.MonsterName = Monster.getName();

}
public static RoomsBattle RoomsInit(){
    Monster Rat = new Monster(10, 1, "Rat");
    RoomsBattle Jailbreak = new RoomsBattle(Rat);
    return Jailbreak;
}
public String getMonsterName() {
    return this.MonsterName;
}
}