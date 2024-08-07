import java.util.Scanner;

public class Ex5 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti lungimea dreptunghiului: ");
        float lungimeDreptunghi = scanner.nextFloat();

        System.out.println("Introduceti latimea dreptunghiului: ");
        float latimeDreptunghi = scanner.nextFloat();

        if (latimeDreptunghi > lungimeDreptunghi){
            System.out.println("Latimea nu poate fi mai mare decat lungimea!");
        } else {
            System.out.println("Aria dreptunghiului este: " + lungimeDreptunghi * latimeDreptunghi + " " + "de unitati patrate.");
        }
        scanner.close();
    }
}
