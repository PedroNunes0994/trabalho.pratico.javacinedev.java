import java.util.Scanner;

public class TrabalhoPraticoJavaCinedev {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String[][] assento = new String[10][20];


        for (int i = 0; i < assento.length; i++) {
            for (int j = 0; j < assento[i].length; j++) {
                assento[i][j] = "L";
            }
        }

        System.out.print("Coluna:      ");
        for (int j = 0; j < assento[0].length; j++) {
            System.out.printf("%3d ", (j + 1));
        }
        System.out.println();

        for (int i = 0; i < assento.length; i++) {
            System.out.printf("Fileira %2d: ", i + 1);
            for (int j = 0; j < assento[i].length; j++) {
                System.out.print(" |" + assento[i][j] + "|");
            }
            System.out.println();
        }

        scanner.close();
    }
}