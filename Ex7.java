import java.util.Scanner;

public class Ex7 {
    public static void main(String[] args) {
        float valaoreBMI;

        Scanner scanner = new Scanner(System.in);

        System.out.println("Introduceti greutatea dumneavoastra exprimata in kilograme: ");

        float greutateCorporala = scanner.nextFloat();

        System.out.println("Introduceti inaltimea dumneavoastra exprimata in metri: ");
        float inaltimePersonala = scanner.nextFloat();

        valaoreBMI = greutateCorporala / (inaltimePersonala * inaltimePersonala);

        System.out.println("Indicele dumneavoastra BMI este egal cu: " + valaoreBMI);

        scanner.close();
    }
}
