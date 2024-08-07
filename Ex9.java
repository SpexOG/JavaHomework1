import java.util.Scanner;

public class Ex9 {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti temperatura in grade Celsius: ");

        float gradeCelsius = scanner.nextFloat();

        float temperaturaF = (gradeCelsius * 1.8f) + 32;

        System.out.println("Temperatura in grade Fahrenheit este: " + temperaturaF);

        scanner.close();
    }
}
