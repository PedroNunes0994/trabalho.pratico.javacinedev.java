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

        int opcao;

        do {
            System.out.println("\nEscolha a opção desejada:");
            System.out.println("1 - Mostrar assentos");
            System.out.println("2 - Escolher assentos");
            System.out.println("3 - Cancelar compra");
            System.out.println("4 - relatorio");
            System.out.println("0 - Sair");
            System.out.print("Opção: ");
            opcao = scanner.nextInt();

            switch (opcao) {
                case 1:

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
                    break;

                case 2:

                    System.out.print("Quantos ingressos você deseja comprar? ");
                    int ingressos = scanner.nextInt();

                    for (int k = 0; k < ingressos; k++) {
                        System.out.println("Ingresso " + (k + 1) + ":");

                        System.out.print("Digite o número da fileira (1-10): ");
                        int fileira = scanner.nextInt();

                        System.out.print("Digite o número do assento (1-20): ");
                        int coluna = scanner.nextInt();

                        if (fileira < 1 || fileira > 10 || coluna < 1 || coluna > 20) {
                            System.out.println("Erro: Assento inválido. Tente novamente.");
                            k--;
                        } else if (assento[fileira - 1][coluna - 1].equals("X")) {
                            System.out.println("Assento já ocupado. Escolha outro.");
                            k--; 
                        } else {
                            assento[fileira - 1][coluna - 1] = "X";
                            System.out.println("Assento reservado com sucesso!");
                        }
                    }
                    break;
;
    }
}