package ch.pinkypie.beginner.primitives;

/**
 * In dieser Aufgabe werden wir uns die verschiedenen Text-Datentypen in Java anschauen.
 * <p>
 * ---
 * <p>
 * Anmerkung: String in Java is ein Objekt, nicht ein Datentyp, aber wir werden es hier behandeln.
 */
public class TextPrimitives {
    public static void main(String[] args) {
        TextPrimitives textPrimitives = new TextPrimitives();
        System.out.println("char examples: ");
        textPrimitives.character();
        System.out.println("\n----------------\n");
        System.out.println("String examples: ");
        textPrimitives.string();
    }

    /*
     * In Java gibt es zwei verschiedene Text-Datentypen: char und String.
     * String beinhält eine Zeichenkette, char repräsentiert ein einzelnes Zeichen.
     */

    /**
     * Schauen wir uns hier einmal an wie man einen char alles bilden kann und mit ihm arbeiten
     */
    public void character() {
        /*
         * Grundsätzlich kann ein char wie jede andere variable erstellt werden.
         * Um bei einem char den Buchstaben verwenden zu können muss man ihn mit einzelnen Hochzeichen umgeben:
         * 'c'
         */
        char theLetterC = 'c';

        /*
         * ein Zeichen kann jedoch auch mittels seines zahlencodes aufgerufen werden.
         * Die am meisten verwendeten Zeichen befinden sich hierbei in der ASCII Tabelle.
         * URL: https://tools.piex.at/ascii-tabelle/
         *
         * Dann representiert der Buchstabe 'c' den Wert 99.
         */
        char theLetterCUsingNumbers = 99;

        /*
         * Wir können nun mittels sout (System.out.println) den Wert des char ausgeben und sehen, dass beide Werte gleich sind.
         */
        System.out.println("The letter c using 'c' and 99:");
        System.out.println(theLetterC);
        System.out.println("und");
        System.out.println(theLetterCUsingNumbers);

        /*
         * Wir können da chars als Zahlen gelten, können wir auch mit ihnen rechnen.
         */
        char theLetterD = (char) (theLetterC + 1);
        char theLetterB = (char) (theLetterC - 1);
        System.out.println("---");
        System.out.println("The letter D (c + 1):");
        System.out.println(theLetterD);
        System.out.println("The letter B (c - 1):");
        System.out.println(theLetterB);
    }

    /**
     * Hier schauen wir uns dann den String Datentyp an.
     * Strings sind in java zwar Objekte, aber werden speziell behandelt, weswegen wir sie hier behandeln.
     */
    public void string() {
        /*
         * Auch Strings können wie primitive Datentypen erstellt werden.
         * Ähnlich wie bei chars müssen Strings auch mit einem Zeichen umgeben werden.
         * Dieses Zeichen ist jedoch ein doppeltes Hochzeichen: "Dein Text"
         */
        String text = "Dein Text";

        /*
         * Bei einem String kann man nur den additions Operator verwenden.
         * Dieser führt jedoch keine rechnungen durch, sondern verbindet die gegebenen Teile zusammen
         * Daher:
         * "Hallo " + "du" = "Hallo du"
         */
        String zusammengefuegt = "Hallo " + "du";

        // dies können wir nun auch mit Variablen machen:
        String variablenText = "Hallo " + text;

        //Wir können diese auch wieder mit sout ausgeben:
        System.out.println("Einfacher String:");
        System.out.println(text);
        System.out.println("---");
        System.out.println("Zusammengefuegt:");
        System.out.println(zusammengefuegt);
        System.out.println("---");
        System.out.println("Variablen Text:");
        System.out.println(variablenText);
    }
}
