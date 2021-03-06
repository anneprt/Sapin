import java.util.Scanner;

public class Sapin {
    public static void main(String[] args) {
        Scanner lectureClavier = new Scanner(System.in);
        System.out.print("Nombre de ligne :  ");
        int nl = lectureClavier.nextInt();
        if (nl <= 0) {
            System.out.println("Le nombre de lignes doit etre superieur a 0 ");
            System.exit(0);
        }
        int nc = 2 * nl - 1;
        int[][] sapin = new int[nl][nc];
        int milieu = sapin[0].length / 2;
        for (int j = 0; j < nl; j++) {
            for (int i = -j; i <= j; i++) {
                sapin[j][milieu + i] = (int) (5 * Math.random() + 1);
            }
        }
        affiche(sapin);
    }

    public static void affiche(int[][] t) {
        for (int j = 0; j < t.length; j++) {
            for (int i = 0; i < t[0].length; i++) {
                switch (t[j][i]) {
                    case 0:
                        System.out.print(" ");
                        break;
                    case 2:
                        System.out.print("%");
                        break;
                    default:
                        System.out.print(".");
                }
            }
            System.out.println();
        }
    }

}
