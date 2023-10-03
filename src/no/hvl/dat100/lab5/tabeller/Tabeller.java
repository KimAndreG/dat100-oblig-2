package no.hvl.dat100.lab5.tabeller;

public class Tabeller {

    // a)
    public static void skrivUt(int[] tabell) {
        for (int i : tabell) {
            System.out.println(i + " ");
        }

    }

    // b)
    public static String tilStreng(int[] tabell) {
        StringBuilder string = new StringBuilder();
        string.append("[");

        for (int i = 0; i < tabell.length; i++) {
            string.append(tabell[i]);
            if (i < tabell.length - 1) {
                string.append(",");
            }
        }
        string.append("]");
        return string.toString();
    }

    // c)
    public static int summer(int[] tabell) {
        int sum = 0;

        for (int i : tabell) {
            sum += i;
        }
        return sum;
    }

    public static int summerForLokke(int[] tabell) {
        int sum = 0;

        for (int i = 0; i < tabell.length; i++) {
            sum += tabell[i];
        }
        return sum;
    }

    public static int summerWhileLokke(int[] tabell) {
        int sum = 0;
        int i = 0;

        while (i < tabell.length) {
            sum += tabell[i];
            i++;
        }
        return sum;
    }

    // d)
    public static boolean finnesTall(int[] tabell, int tall) {
        for (int i : tabell) {
            if (i == tall) {
                return true;
            }
        }
        return false;
    }

    // e)
    public static int posisjonTall(int[] tabell, int tall) {
        for (int i = 0; i < tabell.length; i++) {
            if (tabell[i] == tall) {
                return i;
            }
        }
        return -1;
    }

    // f)
    public static int[] reverser(int[] tabell) {
        int[] nyTabell = new int[tabell.length];

        for (int i = 0; i < tabell.length; i++) {
            nyTabell[i] = tabell[tabell.length - 1 - i];
        }
        return nyTabell;
    }

    // g)
    public static boolean erSortert(int[] tabell) {
        for (int i = 0; i < tabell.length - 1; i++) {
            if (tabell[i] > tabell[i + 1]) {
                return false;
            }
        }
        return true;
    }

    // h)
    public static int[] settSammen(int[] tabell1, int[] tabell2) {
        int nyLengde = tabell1.length + tabell2.length;
        int[] nyTabell = new int[nyLengde];

        for (int i = 0; i < tabell1.length; i++) {
            nyTabell[i] = tabell1[i];
        }

        for (int i = 0; i < tabell2.length; i++) {
            nyTabell[tabell1.length + i] = tabell2[i];
        }

        return nyTabell;

    }
}
