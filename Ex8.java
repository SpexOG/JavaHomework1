import java.util.Scanner;

public class Ex8 {
    public static void main(String[] args) {

        double pi = Math.PI;
        double circumferintaCerc;
        double arieCerc;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti raza cercului: ");

        double razaCerc = scanner.nextDouble();

        circumferintaCerc = 2 * pi * razaCerc;
        arieCerc = pi * razaCerc * razaCerc;

        System.out.println("Circumferinta cercului este: " + circumferintaCerc);
        System.out.println("Aria cercului este: " + arieCerc);

        scanner.close();
    }
}
