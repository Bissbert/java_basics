package ch.pinkypie.beginner.primitives;

/**
 * In dieser Aufgabe werden wir uns die verschiedenen numerischen Datentypen in Java anschauen.
 */
public class PrimitiveNumbers {
    public static void main(String[] args) {
        PrimitiveNumbers primitiveNumbers = new PrimitiveNumbers();
        System.out.println("boolean examples: ");
        primitiveNumbers.booleans();
        System.out.println("\n----------------\n");
        System.out.println("full number examples: ");
        primitiveNumbers.fullNumbers();
        System.out.println("\n----------------\n");
        System.out.println("floating point examples: ");
        primitiveNumbers.decimals();
    }

    /*
     * In Java gibt es 8 verschiedene numerische Datentypen:
     * byte, short, int, long, float, double und boolean.
     *
     * Char ist theoretisch auch ein numerischer Datentyp, wir behandeln ihn aber in einer anderen Aufgabe zusammen mit Strings.
     */

    /**
     * Ein boolean ist ein Datentyp der einen Zustand darstellt der entweder wahr oder falsch ist.
     * <p>
     * Dies wird in Java durch den Wert true(ja/wahr) oder false(nein/falsch) repräsentiert.
     */
    public void booleans() {
        // booleans können wie jede andere variable erstellt werden.
        boolean isTrue = true;
        boolean isFalse = false;

        /*
         * Ein boolean kann mittels logischer operationen abgefragt werden, um Entscheidungen zu treffen.
         * Wir werden uns logische Operationen in einer anderen Aufgabe genauer anschauen.
         * Das hier verwendete if ist ein wenn-dann-sonst
         */
        if (isTrue) { // wenn isTrue wahr ist
            System.out.println("isTrue is true"); // dann wird diese Zeile ausgegeben
        } else { // sonst
            System.out.println("isTrue is false"); // wird diese Zeile ausgegeben
        }
        if (isFalse) { // wenn isFalse wahr ist
            System.out.println("isFalse is true"); // dann wird diese Zeile ausgegeben
        } else { // sonst
            System.out.println("isFalse is false"); // wird diese Zeile ausgegeben
        }

        /*
         * Booleans können auch as vergleichen zwischen anderen Datentypen hervorgehen.
         * Alle diese Operatoren werden wir im Kapitel Operatoren genau behandeln.
         */
        boolean isTrue2 = 1 == 1;  // 1 ist gleich 1
        boolean isFalse2 = 1 == 2; // 1 ist nicht gleich 2

        boolean isTrue3 = 1 != 2;  // 1 ist ungleich 2

        boolean isFalse3 = 1 > 2;  // 1 ist nicht größer als 2

        //booleans können nicht mit Operatoren verwendet werden (+, -, *, /, %)
    }

    /**
     * In java gibt es 4 verschiedene numerische Datentypen, die ganze Zahlen repräsentieren.
     * <p>
     * byte, short, int und long.
     * <p>
     * Hierbei unterscheiden sich die Datentypen in der Größe der Zahl, die sie darstellen können.
     * Also wie gross der Zahlenbereich ist, den sie abdecken.
     */
    public void fullNumbers() {
        // fangen wir mit dem kleinsten an: byte
        byte byteNumber = 1; // byte kann Zahlen von -128 bis 127 darstellen

        // short kann Zahlen von -32'768 bis 32'767 darstellen
        short shortNumber = 32767;

        // int kann Zahlen von -2'147'483'648 bis 2'147'483'647 darstellen
        int intNumber = 2147483647;

        // long kann Zahlen von -9'223'372'036'854'775'808 bis 9'223'372'036'854'775'807 darstellen
        long longNumber = 9223372036854775807L; // L am Ende der Zahl zeigt an, dass es sich um einen long handelt.

        // long kann auch mit einem Unterstrich dargestellt werden, um die Lesbarkeit zu verbessern.
        long longNumberWithUnderline = 9_223_372_036_854_775_807L;

        // Geben wir die Zahlen aus, um zu sehen, wie die Zahlen dargestellt werden.
        System.out.println("\nfull number variables: ");
        System.out.println("byte:\t\t\t\t\t" + byteNumber);
        System.out.println("short:\t\t\t\t\t" + shortNumber);
        System.out.println("int:\t\t\t\t\t" + intNumber);
        System.out.println("long:\t\t\t\t\t" + longNumber); // diese und die nächste Zeile geben das Gleiche aus
        System.out.println("long with underline:\t" + longNumberWithUnderline);

        // byte, short und int werden als int behandelt, wenn sie mit anderen Datentypen verrechnet werden.
        // long wird als long behandelt, wenn sie mit anderen Datentypen verrechnet werden.

        // alle diese Datentypen können mit den Operatoren +, -, *, / und % verwendet werden. (siehe Kapitel Operatoren)
        // es kann hier auch zwischen den typen verrechnet werden.
        int addition = 1 + 1;
        int subtraction = intNumber - shortNumber;
        int multiplication = shortNumber * byteNumber;
        int division = intNumber / shortNumber;
        int modulo = intNumber % 2;

        // geben wir die Ergebnisse aus
        System.out.println("\nfull number operations: ");
        System.out.println("addition:\t\t\t\t1 +\t\t\t1\t\t= " + addition);
        System.out.println("subtraction:\t\t\tintNr -\t\tshortNr\t= " + subtraction);
        System.out.println("multiplication:\t\t\tshortNr *\tbyteNr\t= " + multiplication);
        System.out.println("division:\t\t\t\tintNr /\t\tshortNr\t= " + division);
        System.out.println("modulo:\t\t\t\t\tintNr %\t\t2\t\t= " + modulo);
    }

    /**
     * In java gibt es 2 verschiedene numerische Datentypen, die Kommazahlen repräsentieren.
     * <p>
     * float und double.
     * <p>
     * Hierbei unterscheiden sich die Datentypen in der Genauigkeit der Kommazahlen, die sie darstellen können.
     */
    public void decimals() {

    }
}
