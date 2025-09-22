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

                    System.out.print("Coluna:     ");
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

                case 3:

                    int fileiraCancelar = scanner.nextInt();

                    System.out.print("Digite o número da coluna (1-20) para cancelar: ");
                    int colunaCancelar = scanner.nextInt();

                    if (fileiraCancelar < 1 || fileiraCancelar > 10 || colunaCancelar < 1 || colunaCancelar > 20) {
                        System.out.println("Assento inválido.");
                    } else if (assento[fileiraCancelar - 1][colunaCancelar - 1].equals("L")) {
                        System.out.println("Assento já está livre.");
                    } else {
                        assento[fileiraCancelar - 1][colunaCancelar - 1] = "L";
                        System.out.println("Compra cancelada com sucesso.");
                    }
                    break;
                case 4:
                int totalAssentos = assento.length * assento[0].length;
                int ocupados = 0;

               for (int i = 0; i < assento.length; i++) {
               for (int j = 0; j < assento[i].length; j++) {
               if (assento[i][j].equals("X")) {
               ocupados++;
            }
        }
    }

               int livres = totalAssentos - ocupados;
               double percentual = ((double) ocupados / totalAssentos) * 100;

                System.out.println("\n🔹 Relatório de Ocupação da Sala 🔹");
                System.out.println("Total de assentos: " + totalAssentos);
                 System.out.println("Assentos ocupados: " + ocupados);
                 System.out.println("Assentos livres: " + livres);
                 System.out.printf("Percentual de ocupação: %.2f%%\n", percentual);
                break;
                
                case 0:
                    System.out.println("Encerrando o programa...");
                    break;

                default:
                    System.out.println("Opção inválida. Tente novamente.");
            }

        } while (opcao != 0);

        scanner.close();
    }
}