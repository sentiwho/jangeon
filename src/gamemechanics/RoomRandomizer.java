package gamemechanics;
import java.util.Random;

// Get random number in rooms amount range, currently stupid. DOC_ID# 12.


public class RoomRandomizer {
    public static int RandomResult() {
        // Создаем объект класса Random
        Random random = new Random();

        // Генерируем случайное число от 1 до 10
        int randomNumber = random.nextInt(2) + 1;

        // Выводим результат
        System.out.println("DEBUG, RANDOMIZER MODULE RESULT" + randomNumber);
        return randomNumber;
        
    }
}
