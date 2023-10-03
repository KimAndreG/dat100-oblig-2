package no.hvl.dat100.lab6.matriser;

public class Matriser {

    // a)
    public static void skrivUt(int[][] matrise) {

        for(int[] rad: matrise) {
            for(int tall: rad) {
                System.out.print(tall + " ");
            }
            System.out.println();
        }
    }

    // b)
    public static String tilStreng(int[][] matrise) {

        StringBuilder string = new StringBuilder();

        for (int[] ints : matrise) {
            for (int j = 0; j < ints.length; j++) {
                string.append(ints[j]);
                if (j < ints.length - 1) {
                    string.append(" ");
                }
            }
            string.append(" \n");
        }

        return string.toString();

    }

    // c)
    public static int[][] skaler(int tall, int[][] matrise) {

        int[][] nyMatrise = new int[matrise.length][matrise[0].length];

        for(int i = 0; i < matrise.length; i++) {
            for(int j = 0; j < matrise[i].length; j++) {
                nyMatrise[i][j] = matrise[i][j] * tall;
            }
        }
        return nyMatrise;
    }

    // d)
    public static boolean erLik(int[][] a, int[][] b) {

        if(a.length != b.length) {
            return false;
        }

        for(int i = 0; i < a.length; i++) {
            if(a[i].length != b[i].length) {
                return false;
            }
            for(int j = 0; j < a[i].length; j++) {
                if(a[i][j] != b[i][j]) {
                    return false;
                }
            }
        }
        return true;
    }

    // e)
    public static int[][] speile(int[][] matrise) {

        int[][] nyMatrise = new int[matrise.length][matrise[0].length];

        for(int i = 0; i < matrise.length; i++) {
            for(int j = 0; j < matrise[i].length; j++) {
                nyMatrise[i][j] = matrise[j][i];
            }
        }
        return nyMatrise;

    }

    // f)
    public static int[][] multipliser(int[][] a, int[][] b) {

        int[][] nyMatrise = new int[a.length][b[0].length];

        for(int i = 0; i < a.length; i++) {
            for(int j = 0; j < b[0].length; j++) {
                for(int k = 0; k < a[0].length; k++) {
                    nyMatrise[i][j] += a[i][k] * b[k][j];
                }
            }
        }
        return nyMatrise;

    }
}
