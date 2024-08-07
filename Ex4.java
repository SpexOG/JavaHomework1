import java.util.Scanner;

public class Ex4 {
    public static void main(String[] args) {

        short s = 231;
        int i = 12313;
        long l = 5435235L;
        float f = 1423412f;
        double d = 34534534523423423d;

        double intInDouble = i;
        double shortInDouble = s;
        double longInDouble = l;
        double floatInDouble = f;

        short integerInShort = (short)i;
        short longInShort = (short)l;
        short floatInShort = (short)f;
        short doubleInShort = (short)d;

        int shortInInteger = s;
        int longInInteger = (int)l;
        int floatInInteger = (int)f;
        int doubleInInteger = (int)d;

        float shortInFloat = s;
        float intInFloat = i;
        float longInFloat = l;
        float doubleInFloat = (float)d;

        long shortInLong = s;
        long intInLong = i;
        long floatInLong = (long)f;
        long doubleInLong = (long)d;

        System.out.println("Convertirile tipurilor de date: ");

        System.out.println(intInDouble);
        System.out.println(shortInDouble);
        System.out.println(longInDouble);
        System.out.println(floatInDouble);

        System.out.println(integerInShort);
        System.out.println(longInShort);
        System.out.println(floatInShort);
        System.out.println(doubleInShort);

        System.out.println(shortInInteger);
        System.out.println(longInInteger);
        System.out.println(floatInInteger);
        System.out.println(doubleInInteger);

        System.out.println(shortInFloat);
        System.out.println(intInFloat);
        System.out.println(longInFloat);
        System.out.println(doubleInFloat);

        System.out.println(shortInLong);
        System.out.println(intInLong);
        System.out.println(floatInLong);
        System.out.println(doubleInLong);

        Scanner scanner = new Scanner(System.in);

        short s1;

        System.out.println("Introduceti variabila de tip short pentru a fi convertita in celelate tipuri de date: ");

        s1 = scanner.nextShort();

        int i1;

        System.out.println("Introduceti variabila de tip integer pentru a fi convertita in celelate tipuri de date: ");

        i1 = scanner.nextInt();

        long l1;

        System.out.println("Introduceti variabila de tip long pentru a fi convertita in celelate tipuri de date: ");

        l1 = scanner.nextLong();

        float f1;

        System.out.println("Introduceti variabila de tip float pentru a fi convertita in celelate tipuri de date: ");

        f1 = scanner.nextFloat();

        double d1;

        System.out.println("Introduceti variabila de tip double pentru a fi convertita in celelate tipuri de date: ");

        d1 = scanner.nextDouble();

        short integerToShort = (short)i1;
        short longToShort = (short)l1;
        short floatToShort = (short)f1;
        short doubleToShort = (short)d1;

        int shortToInteger = s1;
        int longToInteger = (int)l1;
        int floatToInteger = (int)f1;
        int doubleToInteger = (int)d1;

        long shortToLong = s1;
        long intToLong = i1;
        long floatToLong = (long)f1;
        long doubleToLong = (long)d1;

        float shortToFloat = s1;
        float intToFloat = i1;
        float longToFloat = l1;
        float doubleToFloat = (float)d1;

        double intToDouble = i;
        double shortToDouble = s;
        double longToDouble = l;
        double floatToDouble = f;

        System.out.println("Variabila integer convertita la short: " + integerToShort);
        System.out.println("Variabila long convertita la short: " + longToShort);
        System.out.println("Variabila float convertita la short: " + floatToShort);
        System.out.println("Variabila double convertita la short: " + doubleToShort);

        System.out.println("Variabila short convertita la integer: " + shortToInteger);
        System.out.println("Variabila long convertita la integer: " + longToInteger);
        System.out.println("Variabila float convertita la integer: " + floatToInteger);
        System.out.println("Variabila double convertita la integer: " + doubleToInteger);

        System.out.println("Variabila short convertita la long: " + shortToLong);
        System.out.println("Variabila int convertita la long: " + intToLong);
        System.out.println("Variabila float convertita la long: " + floatToLong);
        System.out.println("Variabila double convertita la long: " + doubleToLong);

        System.out.println("Variabila short convertita la float: " + shortToFloat);
        System.out.println("Variabila int convertita la float: " + intToFloat);
        System.out.println("Variabila long convertita la float: " + longToFloat);
        System.out.println("Variabila double convertita la float: " + doubleToFloat);

        System.out.println("Variabila integer convertita la double: " + intToDouble);
        System.out.println("Variabila short convertita la double: " + shortToDouble);
        System.out.println("Variabila long convertita la double: " + longToDouble);
        System.out.println("Variabila float convertita la double: " + floatToDouble);

        scanner.close();
    }
}
