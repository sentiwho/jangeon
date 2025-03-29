public class RoomsDesc {
    String situation;
    int karmaOne;
    int karmaTwo;
 
    public RoomsDesc(String situation, int karmaOne, int karmaTwo) {
     this.situation = situation;
     this.karmaOne = karmaOne;
     this.karmaTwo = karmaTwo;
 
 }
     public static void main(String[] args) {
         RoomsDesc Room1 = new RoomsDesc("Some situation", 1, -1);
         RoomsDesc Room2 = new RoomsDesc("Some situation2", 2, -2);
 
     }
   }