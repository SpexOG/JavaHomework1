import java.util.Scanner;

public class Ex6 {
    public static void main(String[] args) {

        double medieNumere;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti numerele: ");

        System.out.println("Primul numar: ");
        double nr1 = scanner.nextDouble();

        System.out.println("Al doilea numar: ");
        double nr2 = scanner.nextDouble();

        System.out.println("Al treile numar: ");
        double nr3 = scanner.nextDouble();

        medieNumere = (nr1 + nr2 + nr3)/3;

        System.out.println("Media celor 3 numare este: " + medieNumere);

        scanner.close();
    }
}
