import java.util.Scanner;
 
public class ScannerUsage {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
 
        System.out.println("Enter the numba:");
 
        int number = scanner.nextInt();
 
        System.out.println("You wrote: " + number);
    }
}