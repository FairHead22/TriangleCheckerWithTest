import java.util.Scanner;

public class TriangleChecker {

    public enum TriangleType {
        NOTRIANGLE,
        NORMALTRIANGLE,
        ISOSCELES,
        EQUILATERAL
    }


    public static void main(String[] args) {

        Scanner s = new Scanner(System.in);

        System.out.println("Bitte Seitenlänge einfügen");

        float a = floatEingabe(s, "a: ");

        float b = floatEingabe(s, "b: ");

        float c = floatEingabe(s, "c: ");

        s.close();

        printAnalysis(a, b, c);
    }


    private static float floatEingabe(Scanner s, String prompt) {

        System.out.print(prompt);

        return s.nextFloat();
    }


    private static void printAnalysis(float a, float b, float c) {

        TriangleType type = checkTriangle(a, b, c);
        switch (type) {
            case NOTRIANGLE:
                System.out.println("Kein Dreieck");
                break;
            case NORMALTRIANGLE:
                System.out.println("Dreieck");
                break;
            case ISOSCELES:
                System.out.println("Gleichschenkliges Dreieck");
                break;
            case EQUILATERAL:
                System.out.println("Gleichseitiges Dreieck");
                break;
        }
    }

    // Analyse der Dreiecksart
    public static TriangleType checkTriangle(float a, float b, float c) {

        if (checkTriangleBasePossibility(a, b, c)) {

            if (a == b && a == c){
                return TriangleType.EQUILATERAL;
            }

            if (a == b || a == c || b == c) {
                return TriangleType.ISOSCELES;
            }
            return TriangleType.NORMALTRIANGLE;
        }

        return TriangleType.NOTRIANGLE;
    }

    public static boolean checkTriangleBasePossibility(float a, float b, float c) {

        if (a <= 0 || b <= 0 || c <= 0) {
            return false;
        } else {
            return a + b > c && a + c > b && b + c > a;
        }


    }
}