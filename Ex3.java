import java.util.Scanner;

public class Ex3 {
    public static void main(String[] args) {

        String primaJumatate = "Strenocleido";
        String aDouaJumatate = "mastoidian";

        String cuvantComplet = primaJumatate + aDouaJumatate;

        System.out.println("Cuvant complet: "+ cuvantComplet);

        String cuvantPropozitie1 = "Muschiul";
        String cuvantPropozitie2 = "este";
        String cuvantPropozitie3 = "un";

        String cuvantPropozitie4 = cuvantPropozitie1.substring(0,6);
        cuvantPropozitie4 = cuvantPropozitie4.toLowerCase();

        String cuvantPropozitie5 = "al";
        String cuvantPropozitie6 = "gatului";

        String propozitieCompleta = cuvantPropozitie1 + " " + cuvantComplet + " " + cuvantPropozitie2 + " " + cuvantPropozitie3 + " " + cuvantPropozitie4 + " " + cuvantPropozitie5 + " " + cuvantPropozitie6 + ".";

        System.out.println("Propozitia completa este: " + propozitieCompleta);
    }
}
