package pekan5;

public class TugasNestedFor {
    public static void printRepeat(String str, int count) {
        for (int i = 0; i < count; i++) {
            System.out.print(str);
        }
    }
    public static void printRow(int i) {
        System.out.print("|");

        if (i == 1) {
            int spaces = 7;
            printRepeat(" ", spaces);
            System.out.print("<><>");
            printRepeat(" ", spaces);
        } else {
            int dots = (i - 1) * 4; 
            int spaces = (14 - dots) / 2; 
            printRepeat(" ", spaces);
            System.out.print("<>");
            printRepeat(".", dots);
            System.out.print("<>");
            printRepeat(" ", spaces);
        }

        System.out.println("|");
    }

    public static void main(String[] args) {
        System.out.print("#");
        printRepeat("=", 18);
        System.out.println("#");

        for (int i = 1; i <= 4; i++) {
            printRow(i);
        }        
        for (int i = 4; i >= 1; i--) {
            printRow(i);
        }

        System.out.print("#");
        printRepeat("=", 18);
        System.out.println("#");
    }
}