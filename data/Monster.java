public class Monster {
    int HealthAmount;
    int damage;
 
    public Monster(int HealthAmount, int damage) {
     this.HealthAmount = HealthAmount;
     this.damage = damage;
 }
     public static void main(String[] args) {
        Monster Monster1 = new Monster(30, 5);
        Monster Monster2 = new Monster(50, 10);
     }
   }