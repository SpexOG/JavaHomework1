import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args){

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numerele pentru efectuarea adunarii:");

        System.out.println("X = ");
        int x = scanner.nextInt();

        System.out.printf("Y = ");
        int y = scanner.nextInt();

        System.out.println("Suma celor doua numere este egala cu: " + (x + y));

        scanner.close();
    }
}