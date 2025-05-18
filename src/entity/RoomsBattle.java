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

    public static RoomsBattle RoomsInit(int randomizerResult) {
        switch (randomizerResult) {
            case 1:
                Monster Rat = new Monster(10, 2, "Rat");
                RoomsBattle Jailbreak = new RoomsBattle(Rat);
                return Jailbreak;
            case 2:
                Monster Boar = new Monster(30, 1, "Boar");
                RoomsBattle VillageForest = new RoomsBattle(Boar);
                return VillageForest;
            default:
                return null;
        }
    }

    public String getMonsterName() {
        return this.MonsterName;
    }
}